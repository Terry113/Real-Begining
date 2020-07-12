import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	public static Button[][] buttons = new Button[10][10];
	 private int[][] lastClickedIndex = new int[10][10]; 
	@Override
	public void start(Stage stage) throws Exception {

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				buttons[i][j] = new Button();
				buttons[i][j].setMaxSize(70, 70);
				buttons[i][j].setMaxSize(50, 50);
				buttons[i][j].setMinSize(50, 50);
			}
		}
		        for(int i = 0; i < 10; i++) {
		        	for(int j = 0;j<10;j++) {
            
            buttons[i][j].setOnAction(e -> {
                show();
               
            });
        }
		        }
		        buttons[0][0].setOnAction(e->{
		        	System.out.println(lastClickedIndex);
		        });
		        
		GridPane root = new GridPane();
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				root.add(buttons[j][i], j, i);
			}
		}
		for (int i = 0; i < 10; i++) {
			generateElems("Bomb");
		}
		root.setAlignment(Pos.CENTER);
		Scene scene = new Scene(root, 750, 750);
		stage.setScene(scene);
		stage.show();
	}

	private void show() {
		
		
	}

	public static void generateElems(String what) {

		try {
			FileInputStream inputstream = new FileInputStream(what + ".jpeg");
			Image image = new Image(inputstream);

			buttons[(int) (Math.random() * 9)][(int) (Math.random() * 9)].setGraphic(new ImageView(image));

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println("somthing went wrong");
		}

	}

}
