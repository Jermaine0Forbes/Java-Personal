# Collision detection with ImageView

I'm trying to make the image collide with a shape, but I have 
been having trouble with it for a week or so.


```java

package javafx_game_dev;

import javafx.animation.AnimationTimer;
import javafx.application.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.scene.*;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.*;
import java.util.*;
import javafx.scene.paint.*;
import javafx.scene.image.*;
import javafx.scene.input.*;

public class ImageViews6 extends Application {

	private static final double CELL_WIDTH = 134, CELL_HEIGHT = 200, WINDOW_WIDTH =720, WINDOW_HEIGHT =480;
	private int speedX =0, speedY=0;
	private ImageView iv ;
	GraphicsContext gc;
	Text dit;

	@Override
	public void start(Stage window){

		window.setTitle("Try to make the image view move and animate");

		 iv = new ImageView("Isaiah.png");
		Rectangle2D port = new Rectangle2D(0, 600, CELL_WIDTH, CELL_HEIGHT);
		iv.setViewport(port);


		Canvas cv = new Canvas(512,512);
		 gc = cv.getGraphicsContext2D();

		GridPane grid = new GridPane();
		grid.setHgap(20);
		grid.setPadding(new Insets(10));
		Label px =  new Label("Position X: ");
		Text tx = new Text("0");
		Label py =  new Label("Position Y: ");
		Text ty = new Text("0");
		Label dil =  new Label("Distance: ");
		 dit = new Text("0");

		Label wx =  new Label("Window Position X: ");
		Text twx = new Text(String.valueOf(WINDOW_WIDTH));
		Label wy =  new Label("Window Position Y: ");
		Text twy = new Text(String.valueOf(WINDOW_HEIGHT));


		grid.add(px, 0, 0);
		grid.add(tx, 1, 0);
		grid.add(py, 2, 0);
		grid.add(ty, 3, 0);
		grid.add(dil, 4, 0);
		grid.add(dit, 5, 0);

		grid.add(wx, 0, 1);
		grid.add(twx, 1, 1);
		grid.add(wy, 2, 1);
		grid.add(twy, 3, 1);
		grid.setStyle("-fx-background-color:white");
		StackPane cPane = new StackPane();
//		FlowPane cPane = new FlowPane();
		cv.setStyle("-fx-background-color:magento");
		cPane.setAlignment(Pos.TOP_LEFT);
		cPane.getChildren().addAll(cv,iv);
		cPane.setStyle("-fx-background-color:cyan;");
		Bounds bc = cPane.getBoundsInLocal();
		double cvHeight = bc.getMaxX(), cvWidth = bc.getMaxY();
		twx.setText(String.valueOf(cvHeight));
		twy.setText(String.valueOf(cvWidth));

		VBox root = new VBox();
		root.getChildren().addAll(grid,cPane);

		root.setStyle("-fx-background-color:black");

		Scene scene = new Scene(root,WINDOW_WIDTH,WINDOW_HEIGHT);

		scene.setOnKeyPressed(e ->{

			String code = e.getCode().toString();
			Bounds b = iv.getBoundsInParent();
			double ivHeight= b.getHeight();
			double ivWidth = b.getWidth();
//			double ivWidth = iv.getX();
//			double ivHeight = iv.getY();
			double windowTop, windowBottom, windowLeft, windowRight;
//			log("Y position: "+ivWidth);
//			log("X position: "+ivHeight);
//			windowTop = - CELL_HEIGHT;
			windowTop = 0;
//			windowBottom = WINDOW_HEIGHT - CELL_HEIGHT;
			windowBottom = cvHeight - ivHeight;
//			windowLeft = - CELL_WIDTH*2;
			windowLeft = 0;
//			windowRight = WINDOW_WIDTH - CELL_WIDTH;
//			windowRight = WINDOW_WIDTH - ivWidth;
			windowRight = cvWidth - ivWidth;


			switch(code){

			case "UP":
				speedY -=5;

				if(windowTop >= speedY){
					speedY = (int)windowTop;
				}

				ty.setText(String.valueOf(speedY));
				break;
			case "DOWN":
				speedY +=5;
				if(windowBottom <= speedY){
					speedY = (int)windowBottom;
				}
				ty.setText(String.valueOf(speedY));
				break;
			case "LEFT":
				speedX -=5;
				if(windowLeft >= speedX){
					speedX = (int)windowLeft;
				}
				tx.setText(String.valueOf(speedX));
				break;
			case "RIGHT":
				speedX +=5;
				if(windowRight <= speedX){
					speedX = (int)windowRight;
				}
				tx.setText(String.valueOf(speedX));
				break;

			}


		});
		scene.setOnKeyReleased(e ->{

			String code = e.getCode().toString();
			switch(code){

			case "UP":
				// do something
				break;
			case "DOWN":
				// do something
				break;
			case "LEFT":
//				speedX =0;
				break;
			case "RIGHT":
//				speedX =0;
				break;

			}


		});

		GameLoop loop = new GameLoop();
		loop.start();

		window.setScene(scene);

		window.show();

	}

	private class GameLoop extends AnimationTimer{

		private long startNanoTime = System.nanoTime();
		private int minutes = 0 , seconds, frames ;
		private double objLeft, objTop, objBottom, objRight, imgTop, imgBottom, imgLeft, imgRight;


		@Override
		public void handle(long now){

			double t =  (now - startNanoTime) / Math.pow(10, 9);
			seconds = (int)t;
			double s = ((now - startNanoTime) / Math.pow(10, 9))*60;
			 frames = (int) s % 60;
			 minutes = seconds / 60;

			 imgTop = speedY;
				imgBottom = speedY+CELL_HEIGHT;
				imgLeft= speedX;
				imgRight= speedX+CELL_WIDTH;

				objTop = 0;
				objBottom = 100;
				objLeft = 341;
				objRight = 341+171;


//			 if(iv.getBoundsInParent().intersects(341, 0, 171, 100)){
//					log("collision detected");
//					if(imgRight > objLeft && imgTop == 0 )
//						speedX =(int) (objLeft-CELL_WIDTH-1);
//					else if (imgTop < objBottom && imgRight > objLeft && imgLeft < objRight)
//						speedY =(int)(objBottom);
//
//				}

//				double distX = (imgRight - objRight)/2;
//				double distY = (imgBottom - objBottom)/2;
				double distX = (objRight - imgRight)/2;
				double distY = (objBottom - imgBottom)/2;

				double objR = Math.pow((objRight/2), 2)+ Math.pow((objBottom/2), 2);
				double imgR = Math.pow((imgRight/2), 2)+ Math.pow((imgBottom/2), 2);

				double distance = Math.sqrt((distX+distX)+(distY*distY));

				dit.setText(String.valueOf(distance));

			 if(iv.getBoundsInParent().intersects(341, 0, 171, 100)){
				 if (distance <= objR+imgR) {
					 log("its working "+distance);
					}


//				 if (imgTop > objBottom )
//					 speedY +=(int)5;
//				 if(imgRight > objLeft )
//					 speedX -=(int)5;


			 }

			iv.setTranslateX(speedX);
			iv.setTranslateY(speedY);

			gc.fillRect(341,0,171,100);
			gc.setFill(Color.RED);




//			if ((imgBottom < objTop) ||
//		               (imgTop > objBottom) ||
//		               (imgRight < objLeft) ||
//		               (imgLeft > objRight)) {
//				log("collision detected");
//		        }

//			if((imgBottom < objTop)){
//				log("collision detected at the top");
//
//			}else if (imgTop > objBottom){
//
//				log("collision detected at the bottom");
//
//			}else if(imgRight > objLeft){
//				log("collision detected at the left");
//
//			}else if (imgLeft > objRight){
//				log("collision detected at the right");
//			}




//			if((speedX >= (341 - CELL_WIDTH) && speedX <=(341+171 - CELL_WIDTH)) || (speedY >=0 && speedY <=(100 - CELL_HEIGHT))){
//				log("collision detected");
//			}

//			Bounds  b = iv.getBoundsInLocal();
//			Bounds  b = iv.getBoundsInParent();
//			log("Y coordinate: "+b.getMaxY());
//			log("X coordinate: "+b.getMaxX());

		}

	}

	private void log(String msg){
		System.out.println(msg);
	}

	private double getRadius(double length){
		double radius = Math.sqrt(Math.pow((length/2), 2)*2 );
		return radius;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
```