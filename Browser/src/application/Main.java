package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.web.WebEngine;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
			//BorderPane root = new BorderPane();
			Parent root; 
			try {
				//wasteTab.setDisable(true);
				Process process = java.lang.Runtime.getRuntime().exec("ping www.google.co.in");
		        int x = process.waitFor();
		        if (x == 0) {
		        	root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
		        	Scene scene = new Scene(root,400,400);
		    		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		    		primaryStage.setScene(scene);
		    		primaryStage.setTitle("MyBrowser");
		    		Image icon = new Image(getClass().getResourceAsStream("/Image/browsericon.png"));
		    	    primaryStage.getIcons().add(icon);
		    		primaryStage.setMaximized(true);
		    		primaryStage.show();
		        }
		        else {
		        	root = FXMLLoader.load(getClass().getResource("GameTab.fxml"));
		        	Scene scene = new Scene(root,400,400);
		    		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		    		primaryStage.setScene(scene);
		    		primaryStage.setTitle("MyBrowser");
		    		Image icon = new Image(getClass().getResourceAsStream("/Image/browsericon.png"));
		    	    primaryStage.getIcons().add(icon);
		    		primaryStage.setMaximized(true);
		    		primaryStage.show();
		        }
			} catch (IOException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			/*try {
				root = FXMLLoader.load(getClass().getResource("GameTab.fxml"));
				//= FXMLLoader.load(getClass().getResource("HomePage.fxml"));
				//Parent root = FXMLLoader.load(getClass().getResource("GameTab.fxml"));
				//Parent root = FXMLLoader.load(getClass().getResource("NewTab.fxml"));
				Scene scene = new Scene(root,400,400);
	    		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	    		primaryStage.setScene(scene);
	    		primaryStage.setTitle("MyBrowser");
	    		Image icon = new Image(getClass().getResourceAsStream("/Image/browsericon.png"));
	    	    primaryStage.getIcons().add(icon);
	    		primaryStage.setMaximized(true);
	    		primaryStage.show();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
        	
		
	}
	
	public static void main(String[] args) throws IOException {
		launch(args);
	}
}
