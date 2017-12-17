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
- [switch to different scenes][switch-scene]

## Button
- [how to create a button][button]

## ChoiceBox
- [how to intialize choicebox][init-choice]
- [ChoiceBox.getItems.add][choice-add]
- [ChoiceBox.getItems.addAll][choice-addall]
- [ChoiceBox.setValue][choice-value]

## CheckBox
- [how to create a checkbox][checkbox]

## Layouts
- [GridPane][grid]
- [GridPane.setHgap][grid-hgap]
- [GridPane.setVgap][grid-vgap]
- [GridPane.setPadding][grid-padding]
- [GridPane.add][grid-add]
- [FlowPane][flow]
- [FlowPane.setVgap][flow-vgap]
- [FlowPane.setHgap][flow-hgap]
- [FlowPane.getChildren.add][flow-add]
- [FlowPane.getChildren.addAll][flow-addall]

[init-choice]:#choiceboxsetvalue
[choice-value]:#choiceboxgetitemssetvalue
[choice-addall]:#choiceboxgetitemsaddall
[choice-add]:#choiceboxgetitemsadd
[init-choice]:#how-to-initialize-choicebox
[grid-padding]:#gridpanesetpadding
[switch-scene]:#switch-to-different-scenes
[flow-addall]:#flowpanegetchildrenaddall
[flow-vgap]:#flowpanesetvgap
[flow-hgap]:#flowpanesethgap
[flow-add]:#flowpanegetchildrenadd
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

### ChoiceBox.setValue

Set the default selected choice in the ChoiceBox

```java
ChoiceBox<String> choice  = new ChoiceBox();

choice.getItems().addAll("Apple", "Athritus","Animal", "Arrogant");

choice.setValue("Animal");
```

[go back home][home]

### ChoiceBox.getItems.addAll

Adds multiple items to the ChoiceBox

```java
ChoiceBox<String> choice  = new ChoiceBox();

choice.getItems().addAll("Apple", "Athritus","Animal", "Arrogant");
```

[go back home][home]

### ChoiceBox.getItems.add

Adds an option to the choicebox

```java
ChoiceBox<String> choice  = new ChoiceBox();

choice.getItems().add("Apple");
```		

[go back home][home]

### How to initialize ChoiceBox

`ChoiceBox<Data Type> choice = new ChoiceBox();`

```java
ChoiceBox<String> choice = new ChoiceBox();
```

[go back home][home]

### GridPane.setPadding

this sets the padding to the grid layout

```java
GridPane grid  = new GridPane();

grid.setPadding(new Insets(10,10,10,10));// creates padding for the layout/pane
```
[go back home][home]


### Switch to different scenes

Essentially, you need use event methods to switch 
between different scenes as shown below

```java
Stage window;
	Button btn, btn2;
	Text tx , tx2;
	public void start(Stage myStage){
		window = myStage;
		window.setTitle("Testing Different Scenes");
		tx = new Text("This is Scene 1");
		btn = new Button("Switch to a different scene");
		
		GridPane grid = new GridPane();
		grid.add(tx, 1, 1);
		grid.add(btn, 1, 2);
		grid.setVgap(20);
		
		final Scene sc = new Scene(grid,720,480);
		
	   window.setScene(sc);
		
		tx2 = new Text("This is Scene 2");
		btn2 = new Button("Switch back to the first scene");
		FlowPane flow = new FlowPane(Orientation.VERTICAL,10,10);
		flow.setVgap(40);
		flow.getChildren().addAll(tx2,btn2);
		final Scene sc2 = new Scene(flow,480,720);
		
		// This button event switches to scene 2
		btn.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent ae){
				window.setScene(sc2);
			}			
		});
		
		// This button event switches to scene 1
		btn2.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent ae){
				window.setScene(sc);
			}			
		});
		
		window.show();
		
	}
```

[go back home][home]

### FlowPane.getChildren.addAll

Adds all the elements to the pane

```java
tx2 = new Text("This is Scene 2");
btn2 = new Button("Switch back to the first scene");
FlowPane flow = new FlowPane(Orientation.VERTICAL,10,10);
flow.setVgap(40);
flow.getChildren().addAll(tx2,btn2);//adds all the elements
```

[go back home][home]

### FlowPane.setHgap

Similar to [Grid.setHgap][grid-sethgap]

[go back home][home]

### FlowPane.setVgap

Similar to [Grid.setVgap][grid-setvgap]


[go back home][home]

### FlowPane.getChildren.add

Add elements/nodes to the FlowPane

```java
	FlowPane root = new FlowPane(Orientation.VERTICAL,10,10);
		
	root.setAlignment(Pos.CENTER);
		
	root.getChildren().add(button);
```

[go back home][home]

### Button event

```java
btn.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent ae){
				//enter code
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
