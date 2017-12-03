# JavaFX Guide

I am basically learning all there is to know about JavaFX
. And then  recording it because I know I will forget this 
shit.

## Stage 

[setTitle][stage-title]


[home]:#javafx-guide
[stage-title]:#stage.settitle


### Stage.setTitle 

sets the title to the window

```java

import java.awt.Color;
import javafx.application.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.*;
import javafx.stage.*;

public class App4 extends Application {
	
	
	@Override
	public void start(Stage myStage){
		
		myStage.setTitle("This is a new window!"); // this adds the title to the window
		GridPane root = new GridPane();
		
		Scene myScene = new Scene(root,720,480);
		myStage.setScene(myScene);
		myStage.show();
	}
	
	
	public static void main(String args[]){
		
		launch(args);
	}

}

```

[go back home][home]