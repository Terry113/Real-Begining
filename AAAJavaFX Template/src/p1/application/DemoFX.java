package p1.application;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.function.Predicate;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBase;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DemoFX extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {
		Text searches = new Text("");

		FileOutputStream fis = null;
		try {
			fis = new FileOutputStream("BinaryFile1.dat");
		} catch (FileNotFoundException e) {

			System.out.println("there is a problem");
		}

		ObjectOutputStream dis = new ObjectOutputStream(fis);
		UserBag userBag = new UserBag(200);
		User user1 = new User("Jason", "liu");
		User user2 = new User("Terry", "zhang");
		LibraryObj book1 = new Book("hi", "123", "me", 9.0, 1);
		LibraryObj dvd1 = new DVD("The", 9.99, "action", "1900", false);
		BookBag.insert(book1);
		BookBag.insert(dvd1);

		Text text1 = new Text("Search the Library for Items");

		HBox hbox0 = new HBox();
		hbox0.setAlignment(Pos.CENTER);
		hbox0.getChildren().add(text1);

		TextField searchField = new TextField();
		searchField.setPrefSize(80, 20);
		searchField.setPromptText("Items");

		HBox hbox1 = new HBox(20);
		hbox1.setAlignment(Pos.CENTER);

		hbox1.getChildren().addAll(searchField);

		Button searchBtn = new Button("Search");
		searchBtn.setPrefSize(70, 30);

		Button newItemBtn = new Button("New");
		newItemBtn.setPrefSize(70, 30);

		Button backupBtn = new Button("Backup");
		backupBtn.setPrefSize(70, 30);

		HBox hbox2 = new HBox(20);
		hbox2.setAlignment(Pos.CENTER);

		Button bookBtn = new Button("new book");
		bookBtn.setPrefSize(700, 150);

		Button dvdBtn = new Button("new DVD");
		dvdBtn.setPrefSize(700, 150);

		Button magazineBtn = new Button("new magazine");
		magazineBtn.setPrefSize(700, 150);

		hbox2.getChildren().addAll(searchBtn, newItemBtn, backupBtn);
		backupBtn.setOnAction(e -> {
			try {
				dis.writeObject(BookBag.returnlibraryObj());
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		searchBtn.setOnAction(e -> {
			LibraryObj x = BookBag.search((LibraryObj k) -> {

				if (k.getTitle().contentEquals(searchField.getText())) {
					return true;

				}
				return false;
			});
			System.out.println(x);
			String x1 = x.toString();
			searches.setText(x1);
		});
		HBox hBox3 = new HBox(searches);
		hBox3.setAlignment(Pos.BASELINE_CENTER);
		newItemBtn.setOnAction(e -> {

			HBox hBox4 = new HBox();
			hBox4.getChildren().addAll(bookBtn, dvdBtn, magazineBtn);
			hBox4.setAlignment(Pos.CENTER);
			VBox root1 = new VBox(20);
			root1.setAlignment(Pos.CENTER);

			root1.getChildren().add(hBox4);

			Scene scene1 = new Scene(root1, 500, 300);
			stage.setScene(scene1);
			stage.show();
		});
		TextField textfield2 = new TextField("title");
		TextField textfield3 = new TextField("isbn");
		TextField textfield4 = new TextField("author");
		TextField textfield5 = new TextField("price");
		TextField textfield6 = new TextField("roomNumber");
		Button insertBookBtn = new Button("Insert");
		insertBookBtn.setPrefSize(70, 30);
		Button back = new Button("back");
		bookBtn.setOnAction(e -> {
			TextArea area1 = new TextArea();
			area1.appendText("what Title do you want do you want\n");

			area1.appendText("what Isbn do you want do you want\n");

			area1.appendText("what Author do you want do you want\n");

			area1.appendText("what price do you want do you want\n");

			area1.appendText("what RoomNumber do you want do you want\n");

			HBox inputBox = new HBox();
			inputBox.getChildren().addAll(textfield2, textfield3, textfield4, textfield5, textfield6);

			HBox hBox5 = new HBox();
			hBox5.getChildren().add(area1);

			VBox root2 = new VBox(20);
			root2.setAlignment(Pos.CENTER);
			VBox inputV = new VBox(20);
			inputV.getChildren().add(inputBox);
			root2.getChildren().addAll(hBox5, inputV, insertBookBtn, back);

			VBox.setMargin(root2, new Insets(20));

			Scene scene2 = new Scene(root2, 1000, 600);
			stage.setScene(scene2);
			stage.show();

		});

		insertBookBtn.setOnAction(e -> {
			String title = textfield2.getText();
			String isbn = textfield3.getText();
			String author = textfield4.getText();
			String price = textfield5.getText();
			double priceD = Double.parseDouble(price);
			String roomNum = textfield6.getText();
			int roomNumI = Integer.parseInt(roomNum);
			LibraryObj book2 = new Book(title, isbn, author, priceD, roomNumI);
			BookBag.insert(book2);

		});
		Button insertDVD = new Button("insert");
		dvdBtn.setOnAction(e -> {
			TextArea area1 = new TextArea();
			area1.appendText("what Genre do you want do you want/n");

			area1.appendText("what Year do you want do you want/n");

			area1.appendText("what price do you want do you want/n");

			area1.appendText("what Title do you want do you want/n");

			HBox hBox5 = new HBox();
			hBox5.getChildren().add(area1);
			HBox inputBox = new HBox();
			inputBox.getChildren().addAll(textfield2, textfield3, textfield4, textfield5, textfield6);
			VBox root2 = new VBox(20);
			root2.setAlignment(Pos.CENTER);

			root2.getChildren().addAll(hBox5, inputBox, insertDVD, back);

			Scene scene2 = new Scene(root2, 500, 300);
			stage.setScene(scene2);
			stage.show();

		});
		insertDVD.setOnAction(e -> {
			String title = textfield5.getText();
			String price = textfield4.getText();
			double priceD = Double.parseDouble(price);
			String year = textfield3.getText();
			String genre = textfield2.getText();
			LibraryObj dvd3 = new DVD(title, priceD, genre, year, true);
			BookBag.insert(dvd3);
		});
		Button insertMagazine = new Button();

		magazineBtn.setOnAction(e -> {
			Text text2 = new Text("what Title do you want do you want");

			Text text4 = new Text("what date do you want do you want");

			Text text5 = new Text("what price do you want do you want");

			HBox inputBox = new HBox();
			inputBox.getChildren().addAll(textfield2, textfield3, textfield4);

			HBox hBox5 = new HBox();
			hBox5.getChildren().addAll(text2, text4, text5);

			VBox root2 = new VBox(20);
			root2.setAlignment(Pos.CENTER);

			root2.getChildren().addAll(hBox5, inputBox, insertMagazine, back);

			Scene scene2 = new Scene(root2, 500, 300);
			stage.setScene(scene2);
			stage.show();

		});

		insertMagazine.setOnAction(e -> {
			String title = textfield2.getText();
			String date = textfield3.getText();
			String price = textfield4.getText();
			double priceD = Double.parseDouble(price);
			LibraryObj magazine4 = new Magazine(title, priceD, date);
			BookBag.insert(magazine4);
		});

		VBox root = new VBox(20);
		root.setAlignment(Pos.CENTER);

		root.getChildren().addAll(hbox0, hbox1, hbox2, hBox3);

		Scene scene = new Scene(root, 500, 300);
		stage.setScene(scene);
		stage.setTitle("My GUI");
		stage.show();
		System.out.println(stage.isShowing());

		// threads: one for GUI: graphic User Interface
		// Another one for user programs
		back.setOnAction(e -> {
			stage.setScene(scene);
		});

	}

}
