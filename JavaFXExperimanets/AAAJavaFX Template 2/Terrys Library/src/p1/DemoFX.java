package p1;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.function.Predicate;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
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
		double ds;
		FileOutputStream fis = null;
		try {
			fis = new FileOutputStream("BinaryFile1.dat");
		} catch (FileNotFoundException e) {

			System.out.println("there is a problem");
		}

		DataOutputStream dis = new DataOutputStream(fis);
		UserBag userBag = new UserBag(200);
		User user1 = new User("Jason", "liu");
		User user2 = new User("Terry", "zhang");
		LibraryObj book1 = new Book("hi", "123", "me", 9.0, 1);
		BookBag.insert(book1);

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

		Button newAccountBtn = new Button("New");
		newAccountBtn.setPrefSize(70, 30);

		Button backupBtn = new Button("Backup");
		backupBtn.setPrefSize(70, 30);

		HBox hbox2 = new HBox(20);
		hbox2.setAlignment(Pos.CENTER);

		hbox2.getChildren().addAll(searchBtn, newAccountBtn, backupBtn);
		backupBtn.setOnAction(e -> {

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
		newAccountBtn.setOnAction(e -> {

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

	}

}
