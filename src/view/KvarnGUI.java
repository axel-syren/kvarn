package view;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.GridPane;
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
	        
	        Board board = new Board();
	        
	        GridPane boardPane = new GridPane();
	        
	        
	        
	        ToggleButton node0 = new ToggleButton();
	        node0.setOnAction(new EventHandler<ActionEvent>() {	 
	            @Override
	            public void handle(ActionEvent event) {
	                
	            }
	        });
	        
	        StackPane root = new StackPane();
	        root.getChildren().add(node0);
	        primaryStage.setScene(new Scene(root, 300, 250));
	        primaryStage.show();
	    }
}
