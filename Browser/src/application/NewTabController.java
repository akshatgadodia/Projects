package application;

import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.ResourceBundle;
import javafx.concurrent.Worker.State;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebHistory;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class NewTabController implements Initializable{
	@FXML
	private TextField searchField;
	@FXML
	private WebView webView;
	@FXML
	private Button btn1;
	@FXML
	private Button btn11;
	@FXML
	private Button btn2;
	@FXML
	private Button btn3;
	@FXML
	private Label label;
	@FXML
	private AnchorPane ancPane;
	@FXML
	private ListView<String> listView;
	private double zoom=1.0;
	private Stage stage;
	private Scene scene;
	WebEngine webEngine = new WebEngine();
	
	public void zoomOut(ActionEvent e) {
		webView.setZoom(zoom-=0.25);
	}
	
	public void zoomIn(ActionEvent e) {
		webView.setZoom(zoom+=0.25);
	}
	
	public void zoomReset(ActionEvent e) {
		webView.setZoom(1.0);
	}
	

	public boolean checkURL(String url) {
		try {
            new URL(url).toURI();
            return true;
        }
        catch (Exception e) {
            return false;
        }
	}
	
	public void initializzeWebEngine() throws IOException {
		webEngine = webView.getEngine();
	}
	
	public void exitBrowser() throws IOException {
		System.exit(1);
	}
	
	public void goBack() throws IOException {
		WebHistory history = webEngine.getHistory();
		ObservableList<WebHistory.Entry> entries = history.getEntries();
		int currentIndex=history.getCurrentIndex();
		if(currentIndex!=0) {
			history.go(-1);
		}
	}
	
	public void hideHistoryTab() {
		ancPane.setVisible(false);
		label.setVisible(false);
		btn11.setVisible(false);
		listView.setVisible(false);
	}
	
	public void showHistoryTab() {
		ancPane.setVisible(true);
		label.setVisible(true);
		btn11.setVisible(true);
		listView.setVisible(true);
	}
	
	public void hideBrowsingTab() {
		webView.setVisible(false);
		btn1.setVisible(false);		
		btn2.setVisible(false);
		btn3.setVisible(false);
		searchField.setVisible(false);
	}
	
	public void showBrowsingTab() {
		webView.setVisible(true);
		btn1.setVisible(true);		
		btn2.setVisible(true);
		btn3.setVisible(true);
		searchField.setVisible(true);
	}
	
	public void history() {
		hideBrowsingTab();
		showHistoryTab();
		WebHistory history = webEngine.getHistory();
		ObservableList<WebHistory.Entry> entries = history.getEntries();
		Iterator<WebHistory.Entry> iterator = entries.iterator();
		while(iterator.hasNext()){
		    WebHistory.Entry entry = iterator.next();
		    String title = entry.getTitle();
		    String url = entry.getUrl();
		    listView.getItems().add(title+"\t"+url);
		}
	}
	
	public void displayBrowsingTab(ActionEvent e) {
		showBrowsingTab();
		hideHistoryTab();
	}
	
	
	public void refresh(ActionEvent e) {
		webEngine.reload();
	}
	
	public void search(ActionEvent e) {
		//webEngine = webView.getEngine();
		String url = searchField.getText();
		if(checkURL(url)) {
			webEngine.load(url);
		}
		else {
			webEngine.load("https://www.google.co.in/search?q="+url);
		}
	}
	
	public void searchUrl(String url) {
		//webEngine = webView.getEngine();
		webEngine.load(url);
		//searchField.setText(webEngine.getLocation());
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//webEngine = webView.getEngine();
		try {
			initializzeWebEngine();
			webEngine.load("https://www.google.co.in");
			webEngine.getLoadWorker().stateProperty().addListener(
				      (ChangeListener<? super State>) new ChangeListener<State>() {

						@Override
						public void changed(ObservableValue<? extends State> arg0, State arg1, State arg2) {
							// TODO Auto-generated method stub
							searchField.setText(webEngine.getLocation());
						}
				    	  
			});
			hideHistoryTab();
		}
		catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	
}
