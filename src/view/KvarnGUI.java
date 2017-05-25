package view;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import model.Board;

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
	        
	        	        
	        ToggleButton node0 = new ToggleButton();
	        node0.setOnAction(new EventHandler<ActionEvent>() {	 
	            @Override
	            public void handle(ActionEvent event) {
	                if (node0.isSelected()) {
	                	System.out.println("pusspådig!");
	                } else {
	                	System.out.println("eller kram!");
	                }
	            }
	        });

	        boardPane.add(node0, 2, 4);
	        
	        pane.getChildren().addAll(boardPane);
	        primaryStage.setScene(scene);
	        primaryStage.setResizable(false);
	        primaryStage.show();
	        

	    }
}
