# JavaFX Guide

I am basically learning all there is to know about JavaFX
. And then  recording it because I know I will forget this
shit.

## Events

- [button event][btn-event]

## Stage

- [setTitle][stage-title]
- [show][stage-show]
- [setScene][stage-scene]

## Scene
- [Scene][scene]

## Button
- [how to create a button][button]


## CheckBox
- [how to create a checkbox][checkbox]

## Layouts
- [GridPane][grid]
- [GridPane.setHgap][grid-hgap]
- [GridPane.setVgap][grid-vgap]
- [GridPane.add][grid-add]
- [FlowPane][flow]
- [FlowPane.setVgap]
- [FlowPane.setHgap]
- [FlowPane.getChildren.add]

[btn-event]:#button-event
[button]:#how-to-create-a-button
[checkbox]:#how-to-create-a-checkbox
[flow]:#flowpane
[grid-add]:#gridadd
[grid-vgap]:#gridpanesetvgap
[grid-hgap]:#gridpanesethgap
[scene]:#scene
[grid]:#gridpane
[stage-scene]:#stagesetscene
[stage-show]:#stageshow
[home]:#javafx-guide
[stage-title]:#stagesettitle


### Button event

```java
btn.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent ae){
				window.setScene(sc2);
			}			
		});

```

[go back home][home]

### How to create a button

```java

Button btn = new Button("This is a new Button");
```
#### To import

```java
import javafx.scene.control.Button;
```

[go back home][home]

### How to create a checkbox

```java

CheckBox box = new CheckBox("this is a checkbox");
```

#### To import

```java
import javafx.scene.control.CheckBox;
```

[go back home][home]


### FlowPane

**reference**
-[java docs](https://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/FlowPane.html)

`new FlowPane(Orientation, hgap , vgap )`

I think the flow pane adjusts the elements positions when you resize
the window



```java
	public void start(Stage myStage){

		local = LocalDate.now();

		format = DateTimeFormatter.ofPattern("M/d/Y");

		date = local.format(format);

		myStage.setTitle("Testing "+date);

		box = new CheckBox("this is a checkbox");


		FlowPane root = new FlowPane(Orientation.VERTICAL,10,10);

		root.setAlignment(Pos.CENTER);

		root.getChildren().add(box);

		Scene scene = new Scene(root,720,480);

		myStage.setScene(scene);

		myStage.show();

	}

```
[go back home][home]


### Grid.add

```java
public void start(Stage myStage){

		myStage.setTitle("Application 2 : Adding Events");

		GridPane  grid = new GridPane();
		grid.setHgap(20);
		grid.setVgap(30);

		btn = new Button("Click here");
		t = new Text("This text can change");

		btn.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent ae){

				t.setText("The button has been pressed");
			}

		});// yes this long ass function allows you to add an event to a button



		grid.add(btn, 1, 1);
		grid.add(t, 1, 2);

		Scene scene = new Scene(grid,720,480);

		myStage.setScene(scene);

		myStage.show();

	}

```

#### Or lambda expressions

```java

public void start(Stage myStage){

		myStage.setTitle("Application 2 : Adding Events");

		GridPane  grid = new GridPane();
		grid.setHgap(20);
		grid.setVgap(30);

		btn = new Button("Click here");
		t = new Text("This text can change");

		btn.setOnAction((ae) ->
			t.setText("somebody poisoned the waterhole") // the other way to add event on button
		);

		grid.add(btn, 1, 1);
		grid.add(t, 1, 2);

		Scene scene = new Scene(grid,720,480);

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
