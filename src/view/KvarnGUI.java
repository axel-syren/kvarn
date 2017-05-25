package view;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.Board;
import view.util.NodeUtility;

public class KvarnGUI extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Kvarn");
		Pane pane = new Pane();
		Scene scene = new Scene(pane, 1000, 800);

		Board board = new Board();

		GridPane boardPane = new GridPane();
		boardPane.setLayoutX(100);
		boardPane.setLayoutY(100);
		boardPane.setVgap(10);
		boardPane.setHgap(10);


		for (int i = 0; i < board.nodes.length; i++) {
			final ToggleButton node = new ToggleButton();
			final int[] coord = NodeUtility.COORDINATE[i];
			boardPane.add(node, coord[0], coord[1]);
			
			node.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					if (node.isSelected()) {
						System.out.println("Selected " + coord[0] + " " + coord[1]);
					} else {
						System.out.println("Not selected " + coord[0] + " " + coord[1]);
					}
				}
			});
		}



		pane.getChildren().addAll(boardPane);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();


	}
}
