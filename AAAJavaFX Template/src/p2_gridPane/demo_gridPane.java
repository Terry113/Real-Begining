package p2_gridPane;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class demo_gridPane extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	public void start(Stage stage) {
		Button[][] buttons = new Button[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				buttons[i][j] = new Button();
				buttons[i][j].setPrefSize(50, 50);

			}
		}

		GridPane root = new GridPane();
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				root.add(buttons[j][i], j, i);
			}
		}
		root.setAlignment(Pos.CENTER);
		Scene scene = new Scene(root,550,550);
		stage.setScene(scene);
		stage.show();
		
		
		TextField nameField = new TextField();
		TextArea area1 = new TextArea();
		Button hiButton = new Button();
		Button byeButton = new Button();
		
		root.add(hiButton, 0, 3,2,1);
		
	}
}
