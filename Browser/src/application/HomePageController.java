package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class HomePageController implements Initializable{
	@FXML
	private TextField searchField;
	@FXML
	public TabPane tabPane;
	@FXML
	private Tab wasteTab;
	@FXML
	private AnchorPane ap;
	
	private Stage stage;
	private Scene scene;
	
	public void addTab(ActionEvent e) {
		try {
			Tab tab = new Tab("New Tab");
			Parent nroot =(Parent) FXMLLoader.load(getClass().getResource("NewTab.fxml"));
			tab.setClosable(true);
			tab.setContent(nroot);     
			tabPane.getTabs().add(tab);
			tabPane.getSelectionModel().select(tab);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	
	public void closeBrowser(ActionEvent e) {
		System.exit(3);
	}
	
	public void playBricksBreaker(ActionEvent event) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("GameTab.fxml"));
			//stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			stage = (Stage)((Scene)tabPane.getScene()).getWindow();
			scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		try {
	        	Tab tab = new Tab("New Tab");
				Parent nroot;
				nroot = (Parent) FXMLLoader.load(getClass().getResource("NewTab.fxml"));
				tab.setClosable(true);
				tab.setContent(nroot);     
				tabPane.getTabs().add(tab);
				tabPane.getSelectionModel().select(tab);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
