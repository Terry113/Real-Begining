package p2_gridPane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class demo1_swapPanes extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {
		VBox root = new VBox(10);
		 HBox btnBox = new HBox(30);
		 Button searchBtn = new Button("search");
		 searchBtn.setOnAction(e ->{
			 
			 root.getChildren().add(new NewPane().getPane());
			 
		 });
		 Button insertBtn = new Button("insert");
		 btnBox.getChildren().addAll(searchBtn,insertBtn);
		 root.getChildren().addAll(btnBox);
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}

}
