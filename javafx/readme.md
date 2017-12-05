# JavaFX Guide

I am basically learning all there is to know about JavaFX
. And then  recording it because I know I will forget this
shit.

## Stage

- [setTitle][stage-title]
- [show][stage-show]
- [setScene][stage-scene]

## Scene
- [Scene][scene]


## Layouts
- [GridPane][grid]
- [GridPane.setHgap][grid-hgap]
- [GridPane.setVgap][grid-vgap]
- [GridPane.add][grid-add]

[grid-add]:#gridadd
[grid-vgap]:#gridpanesetvgap
[grid-hgap]:#gridpanesethgap
[scene]:#scene
[grid]:#gridpane
[stage-scene]:#stagesetscene
[stage-show]:#stageshow
[home]:#javafx-guide
[stage-title]:#stagesettitle

### Grid.add

`grid.add(element, column, row, columnSpan, rowSpan)`

Adds the elements to the grid and allows you to position them 
in a column/row format

```java

@Override
		public void start(Stage myStage){
			myStage.setTitle("Application 6");
			
			GridPane grid = new GridPane();
			
			txt = new Text("Jermaine Forbes");
			
			txt2 = new Text("I am 27 years old");
			
			txt3 = new Text("and I am a black guy");
			
			grid.add(txt, 1, 1, 1,1);
			grid.add(txt2,1,2,1,1);
			grid.add(txt3,1,3,50,50);// The colspan and rowspan don't do shit, at least I didn't see anything
			
			
			Scene scene = new Scene(grid,720,480);
			
			myStage.setScene(scene);
			
			myStage.show();
			
		}
```

[go back home][home]

### GridPane.setVgap

this method adds vertical space to all the elements within
the Grid in pixels.

```java

@Override
	public void start(Stage myStage){
		
		myStage.setTitle("Application 5");
		
		GridPane root = new GridPane();
		
		root.setHgap(25);
		root.setVgap(25);// this will create up and down space for all the elements
		
		btn = new Button("this is a button");
		
		root.add(btn, 1, 2);
		
		Scene scene  = new Scene(root, 720, 480);
		
		myStage.setScene(scene);
		
		myStage.show();
		
	}

```


[go back home][home]

### GridPane.setHgap

this method adds horizontal space to all the elements within
the Grid in pixels I believe

```java

@Override
	public void start(Stage myStage){
		
		myStage.setTitle("Application 5");
		
		GridPane root = new GridPane();
		
		root.setHgap(25);// This will create 25 pixels of space on left and right sides
		
		
		btn = new Button("this is a button");
		
		root.add(btn, 1, 2);
		
		Scene scene  = new Scene(root, 720, 480);
		
		myStage.setScene(scene);
		
		myStage.show();
		
	}

```

[go back home][home]

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
