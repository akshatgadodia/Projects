package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class HomePageController implements Initializable{
	@FXML
	private TextField searchField;
	@FXML
	public TabPane tabPane;
	
	
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
	
	public void addTabNew(String title) {
		try {
			Tab tab = new Tab(title);
			System.out.println("Tab");
			Parent nroot =(Parent) FXMLLoader.load(getClass().getResource("NewTab.fxml"));
			tab.setClosable(true);
			tab.setContent(nroot);     
			tabPane.getTabs().add(tab);
			tabPane.getSelectionModel().select(tab);
			System.out.println(tabPane.getTabs().size());
			System.out.println("Tabl");
		} catch (Exception e1) {
			e1.printStackTrace();
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
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
