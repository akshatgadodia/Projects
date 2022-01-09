package application;

import java.io.IOException;
import java.net.URL;
import javafx.util.Duration;
import java.util.Iterator;
import java.util.ResourceBundle;
import javafx.concurrent.Worker.State;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
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
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebHistory;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class GameTabController implements Initializable {
	@FXML
	private Canvas canvas;
	@FXML
	private Button opebro;
	@FXML
	private Button chknet;
	@FXML
	private Label infoLabel;
	@FXML
	private Label netStatus;
	
	private boolean play=false;
	private int barHeight=7;
	private int barWidth=150;
	private int barPosX = 478;
	private int barPosY = 780;
	private int ballPosY = 600;//760;
	private int ballPosX = 1000;//545;
	private int ballRadius = 13;
	private int ballDirX = -1;
	private int ballDirY = -2;
	private int delay=10;
	private int map[][]=new int[3][7];
	private int bricksRow=3;
	private int bricksCol=7;
	private int bricksWidth=806/bricksCol;
	private int bricksHeight=300/bricksRow;;
	private int score=0;
	private String displayText="Press (Enter) to Play";
	private Stage stage;
	private Scene scene;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//webEngine = webView.getEngine();
		try {
			GraphicsContext gc = canvas.getGraphicsContext2D();
	        Timeline tl = new Timeline(new KeyFrame(Duration.millis(delay), e -> run(gc)));
			tl.setCycleCount(Timeline.INDEFINITE);
			canvas.setFocusTraversable(true);
			//canvas.setOnMouseClicked(e->canvas.setFocusTraversable(true));
			canvas.setOnKeyPressed( e -> keyPressed(e));
			mapGenerator();
			tl.play();
			infoLabel.setText("In this game, the player moves a PADDLE from side-to-side to hit a BALL.\n"
					+ "The game’s objective is to eliminate all of the BRICKS at the top of the \nscreen by hitting them with the BALL.\n"
					+ "But, if the ball hits the bottom ENCLOSURE, the player loses and the game \nends! \nTo win the game, all the BRICKS must be eliminated.\n"
					+ "Press Enter Key to play game.\n"
					+ "Move the paddle with right and left arrow key.\n"
					+ "Press Space Key to pause the game\n"
					+ "Press ESC key to exit the game.");
	       
		}
		catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	
	
	public void openBrowser(ActionEvent event) {
		try {
			Process process = java.lang.Runtime.getRuntime().exec("ping www.google.co.in");
	        int x = process.waitFor();
	        if (x == 0) {
				Parent root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				scene = new Scene(root);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				stage.setScene(scene);
				stage.show();
	        }
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void checkConn(ActionEvent event) {
		try {
			Process process = java.lang.Runtime.getRuntime().exec("ping www.google.co.in");
	        int x = process.waitFor();
	        if (x == 0) {
				netStatus.setText("Internet Status : Connected");
	        }
	        else {
	        	netStatus.setText("Internet Status : Connected");
	        }
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void mapGenerator() {
		for(int i=0;i<map.length;i++) {
			for(int j=0; j<map[0].length;j++) {
				map[i][j]=1;
			}
		}
	}
	public void draw(GraphicsContext gc) {
		gc.setFill(Color.BLACK);
		gc.fillRect(0, 0, 1026, 800);
		gc.setFill(Color.BLUE);
		gc.fillRect(0,0,5,800);
		gc.fillRect(0,0,1026,5);
		gc.fillRect(1021,0,5,800);
		gc.fillRect(0,795,1026,5);
		
	}
	
	public void borderBricks(GraphicsContext gc) {
		gc.setFill(Color.BLACK);
		//gc.fillRect(100, 50, 806, 3);
		gc.fillRect(100, bricksHeight+100-3, 806, 3);
		gc.fillRect(100, bricksHeight*2+100-3, 806, 3);
		gc.fillRect(100, bricksHeight*3+100-3, 806, 3);
		//gc.fillRect(100, 50+500, 3, 298);
		gc.fillRect(bricksWidth+97, 100, 3, bricksHeight*3);
		gc.fillRect(bricksWidth*2+97, 100, 3, bricksHeight*3);
		gc.fillRect(bricksWidth*3+97, 100, 3, bricksHeight*3);
		gc.fillRect(bricksWidth*4+97, 100, 3, bricksHeight*3);
		gc.fillRect(bricksWidth*5+97, 100, 3, bricksHeight*3);
		gc.fillRect(bricksWidth*6+97, 100, 3, bricksHeight*3);
		//gc.fillRect(bricksWidth*7-3, 50, 3, bricksHeight*3);
		gc.setFill(Color.YELLOW);
		gc.fillOval(ballPosX, ballPosY, ballRadius, ballRadius);
		gc.setFill(Color.GREEN);
		gc.fillRect(barPosX, barPosY, barWidth, barHeight);
		gc.setTextAlign(TextAlignment.CENTER);
        gc.setTextBaseline(VPos.CENTER);
        gc.setFill(Color.WHITE);
        gc.setFont(new Font("Serif", 30));
        gc.fillText("Score : "+score, 150 , 40);
		
	}
	
	public void playConditions(GraphicsContext gc) {
		if(play) {
			ballPosX+=ballDirX;
			ballPosY+=ballDirY;
			A: for(int i=0;i<map.length;i++) {
				for(int j=0; j<map[0].length;j++) {
					if(map[i][j]>0) {
						if(new Rectangle(j*bricksWidth+100, i*bricksHeight+100, bricksWidth, bricksHeight).intersects(ballPosX, ballPosY, ballRadius, ballRadius)) {
							map[i][j]=0;
							score+=5;
							if(ballPosX+19<=i*bricksHeight+50||ballPosX+1>=(j+1)*bricksWidth+100) {
								ballDirX = -ballDirX;
							}
							else {
								ballDirY = -ballDirY;
							}
							break A;
						}
					}
				}
			}
			if(ballPosX<=10) {
				ballDirX= - ballDirX;
			}
			if(ballPosY<=10) {
				ballDirY= - ballDirY;
			}
			
			if(ballPosY>=790) {
				play=false;
				displayText="Game Over\nYour Score is "+score+"\nPress (Enter) to Play Again";
			}
			if(score==105) {
				play  = false;
				displayText="Good Job!\nYou Cleared the Game\nPress (Enter) to Play Again";
			}
			if(ballPosX>=1016) {
				ballDirX= - ballDirX;
			}
			if(new Rectangle(barPosX, barPosY, barWidth, barHeight).intersects(ballPosX, ballPosY, ballRadius, ballRadius)) {
				ballDirY= - ballDirY;
			}
		}
		else {
			
		}
	}
	
	public void drawMap(GraphicsContext gc) {
		for(int i=0;i<map.length;i++) {
			for(int j=0; j<map[0].length;j++) {
				if(map[i][j]>0) {
					gc.setFill(Color.WHITE);
					gc.fillRect(j*bricksWidth+100, i*bricksHeight+100, bricksWidth, bricksHeight);
					gc.setFill(Color.BLACK);
					/*gc.fillRect(j*bricksWidth+100, i*bricksHeight+50, 3, bricksHeight);
					gc.fillRect(j*bricksWidth+100, (i+1)*bricksWidth+97, 3, bricksHeight);
					gc.fillRect(j*bricksWidth+100, i*bricksHeight+50, bricksWidth, 3);
					gc.fillRect((j+1)*bricksWidth+100, i*bricksHeight+50, bricksWidth, 3);
					/*gc.rect(j*bricksWidth+100, i*bricksHeight+50, bricksWidth, bricksHeight);
					//gc.fill();
					gc.setStroke(Color.GREEN);
			        gc.setLineWidth(3);
			        gc.stroke();*/
			        //gc.rect(j*bricksWidth+100, i*bricksHeight+50, bricksWidth, bricksHeight);
				}
			}
		}
	}
	
	public void run(GraphicsContext gc) {
		if(play) {
			gc.clearRect(0, 0, 1026, 800);
			draw(gc);
			drawMap(gc);
			borderBricks(gc);
			playConditions(gc);
			opebro.setDisable(play);
			chknet.setDisable(play);
		}
		else {
			draw(gc);
			gc.setTextAlign(TextAlignment.CENTER);
	        gc.setTextBaseline(VPos.CENTER);
	        gc.setFill(Color.WHITE);
	        gc.setFont(new Font("Serif", 30));
	        gc.fillText(displayText, Math.round(canvas.getWidth()  / 2), Math.round(canvas.getHeight() / 2));
	        opebro.setDisable(play);
			chknet.setDisable(play);
		}
		
	}
	
	public void keyPressed(KeyEvent evt) { 

        KeyCode key = evt.getCode();  // keyboard code for the pressed key
        //System.out.println("Key Pressed: " + key);  // for testing
        
        if (key == KeyCode.ENTER) { 
        	play = true;
        	mapGenerator();
        	score=0;
        	ballPosY = 600;//760;
        	ballPosX = 1000;//545;
        	ballDirX = -1;
        	ballDirY = -2;
        	barPosX = 478;
        	barPosY = 780;
        }
        else if (key == KeyCode.SPACE) {  // left arrow key
        	if(play) {
        		play=false;
        		displayText="Game Paused\nPress (Space) to resume\nPress (Enter) to reset";
        	}
        	else{
        		play=true;
        		displayText="Game Paused\nPress (Space) to resume\nPress (Enter) to reset";
        	}
        }
        else if (key == KeyCode.ESCAPE) {  // left arrow key
        	System.exit(1);
        }
        else if (key == KeyCode.LEFT) {  // left arrow key
        	if(play) {
        		if(barPosX<=10) {
    				barPosX=10;
    			}
        		else {
					barPosX-=50;
				}
        	}
        }
        else if (key == KeyCode.RIGHT) {  // right arrow key
        	if(play) {
        		if(barPosX>=866) {
    				barPosX=866;
    			}
        		else {
					barPosX+=50;
				}
        	}
        }
 

    } 
	
}
