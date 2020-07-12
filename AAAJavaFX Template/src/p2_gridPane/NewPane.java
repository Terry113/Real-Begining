package p2_gridPane;

import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class NewPane {
	private HBox hBox1;
	private TextField field1;
	private TextField field2;
public NewPane() {
	hBox1 = new HBox(5);
field1 = new TextField();
field2 = new TextField();
hBox1.getChildren().addAll(field1,field2);
}

public Pane getPane() {
	return hBox1;
}
}
