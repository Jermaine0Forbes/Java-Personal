# JavaFX Guide

I am basically learning all there is to know about JavaFX
. And then  recording it because I know I will forget this 
shit.

## Stage 

- [setTitle][stage-title]
- [show][stage-show]
- [setScene][stage-scene]

Scene
-[Scene][scene]


## Layouts 
- [GridPane][grid]


[scene]:#scene
[grid]:#gridpane
[stage-scene]:#stage.setscene
[stage-show]:#stage.show
[home]:#javafx-guide
[stage-title]:#stage.settitle

### Scene

`Scene myScene = new Scene(layout, width, height)`

The scene is the container that posesses the layouts that structure 
the elements within the window



**reference**

- (Scene)[https://docs.oracle.com/javase/8/javafx/api/javafx/scene/Scene.html]

```java

public class App4 extends Application {
	
	
	@Override
	public void start(Stage myStage){
		
		myStage.setTitle("This is a new window!");
		GridPane root = new GridPane();
		
		Scene myScene = new Scene(root,720,480);// checkout out the scene
		myStage.setScene(myScene);
		myStage.show();
	}
	
	
	public static void main(String args[]){
		
		launch(args);
	}

}


```

[go back home][home]

### GridPane

**reference**
-(GridPane)[https://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/GridPane.html]

a gridpane is a class that supports a column/row layout

```java
public class App4 extends Application {
	
	
	@Override
	public void start(Stage myStage){
		
		myStage.setTitle("This is a new window!");
		GridPane root = new GridPane();// do you see that amazing gridpane?
		
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

### Stage.setScene 

**reference**
- [setScene](https://docs.oracle.com/javase/8/javafx/api/javafx/stage/Stage.html#setScene-javafx.scene.Scene-)

Adds the scene to the Stage/Window class

```java
public class App extends Application {
	
	
	@Override
	public void start(Stage myStage){
		
		myStage.setTitle("This is a new window!");
		GridPane root = new GridPane();
		
		Scene myScene = new Scene(root,720,480);
		myStage.setScene(myScene);// you see me adding it
		myStage.show();
	}
	
	
	public static void main(String args[]){
		
		launch(args);
	}

}
```

[go back home][home]

### Stage.show

**reference**
- [show](https://docs.oracle.com/javase/8/javafx/api/javafx/stage/Stage.html#show--)

shows the window dummy

[go back home][home]


### Stage.setTitle

**reference** 
- [setTitle](https://docs.oracle.com/javase/8/javafx/api/javafx/stage/Stage.html#setTitle-java.lang.String-) 

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

public class App extends Application {
	
	
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