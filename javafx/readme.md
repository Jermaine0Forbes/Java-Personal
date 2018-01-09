# JavaFX Guide

I am basically learning all there is to know about JavaFX
. And then  recording it because I know I will forget this
shit.

## Events

- [setOnAction][btn-event]
- [addListener][listen-please]

## Stage
- [setTitle][stage-title]
- [show][stage-show]
- [setScene][stage-scene]

## Scene
- [Scene][scene]
- [switch to different scenes][switch-scene]

## Button
- [how to create a button][button]

## ListView 
- [ListView.getItems.addAll][list-all]
- [ListView.getSelectionModel.setSelectionMode(SelectionMode)][list-selectionMode]
- [ListView.getSelectionModel.getSelectedItems][list-selectedItems]
- [ListView.setPrefHeight][list-height]


## ComboBox
- [ComboBox.getItems.addAll][combo-all]
- [ComboBox.setPromptText][combo-prompt]
- [ComboBox.getValue][combo-value]
- [ComboBox.setEditable][combo-edit]



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
- [Flowpane.setAlignment][flow-align]


## Other
- [how to create an alert box][alert-box]


## CSS Stylesheets
- [how to add stylesheet to app][stylesheet]
- [css reference table][css-table]
- [css inline style][css-inline]
- [how to set an id][css-id]

## Property

- [How to create a String Property][]

## ChoiceBox
- [how to intialize choicebox][init-choice]
- [ChoiceBox.getItems.add][choice-add]
- [ChoiceBox.getItems.addAll][choice-addall]
- [ChoiceBox.setValue][choice-value]
- [ChoiceBox.getSelectionModel.selectedItemProperty.addListener][choice-listener]


[listen-please]:#addlistener
[list-height]:#listviewsetprefheight
[choice-listener]:#choiceboxgetselectionmodelselecteditempropertyaddlistener
[css-id]:#how-to-set-an-id
[css-inline]:#css-inline-style
[css-table]:#css-reference-table
[stylesheet]:#how-to-add-stylesheet-to-app
[list-selectedItems]:#listviewgetselectionmodelgetselecteditems
[list-selectionMode]:#listviewgetselectionmodelsetselectionmode(selectionmode)
[list-all]:#listviewgetitemsaddall
[combo-edit]:#comboboxseteditable
[combo-value]:#comboboxgetvalue
[combo-prompt]:#comboboxsetprompttext
[combo-all]:#comboboxgetchildrenaddall
[init-choice]:#choiceboxsetvalue
[choice-value]:#choiceboxgetitemssetvalue
[choice-addall]:#choiceboxgetitemsaddall
[choice-add]:#choiceboxgetitemsadd
[init-choice]:#how-to-initialize-choicebox
[grid-padding]:#gridpanesetpadding
[alert-box]:#how-to-create-an-alert-box
[flow-align]:#flowpanesetalignment
[switch-scene]:#switch-to-different-scenes
[flow-addall]:#flowpanegetchildrenaddall
[flow-vgap]:#flowpanesetvgap
[flow-hgap]:#flowpanesethgap
[flow-add]:#flowpanegetchildrenadd
[btn-event]:#setonaction
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

### addListener

The add listener method checks when a item is selected  and activates the 
**changed** method inside of it. The **changed** method has three paramaters 
`o, oldVal, and newVal`. 

**The three changed parameters**
- The **o** variable returns an object that has the properties `bean, name, and value`
- The **oldVal** returns an object that contains the value of the previous selected item
- The **newVal** returns an object that contains the value of the new selected item

**Make sure you import**
```java
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
```

```java
cb.getSelectionModel().selectedItemProperty().addListener(new ChangeListener(){
	        @Override public void changed(ObservableValue o,Object oldVal, Object newVal){
	             txt.setText(o.toString());
	        }
	      });
```

[go back home][home]

### ListView.setPrefHeight

Sets the preferred height of the list view box

```java

final ListView<String> lv = new ListView();
lv.getItems().addAll("call of duty", "medal of honor", "battlefield", "battlegrounds");
lv.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
lv.setPrefHeight(100);// Creates the height to be 100px?

```

[go back home][home]

### ChoiceBox.getSelectionModel.selectedItemProperty.addListener

The choice box add listener, checks when a item is selected  and activates the 
**changed** method inside of it. The **changed** method has three paramaters 
`o, oldVal, and newVal`. 

- The **o** variable returns an object that has the properties `bean, name, and value`
- The **oldVal** returns an object that contains the value of the previous selected item
- The **newVal** returns an object that contains the value of the new selected item

```java

final TextArea txt = new TextArea();
		txt.setText("Select");
		Label lbl = new Label("Choose a Color!");
		ChoiceBox<String> cb = new ChoiceBox();
		
		cb.getItems().addAll("Red", "Blue", "Green");
		cb.setValue("Red");
		cb.setPrefWidth(200);
		cb.getSelectionModel().selectedItemProperty().addListener(new ChangeListener(){
	        @Override public void changed(ObservableValue o,Object oldVal, Object newVal){
	             txt.setText(newVal.toString()); // Make sure you call the toString property
	        }
	      });

```

[go back home][home]

### How to set an id

Allows you to to set a CSS ID to a JavaFX component

**In CSS**
```
#fancy{
	-fx-fill-text:pinky;
	-fx-font-size:16px;
}
```

**In java**
```java
Label l = new Label("This is a label");

l.setId("fancy");

```

[go back home][home]

### CSS Inline Style

`Object.setStyle("Insert styles here")`

```java
Button b = new Button("Submit");
		
String btnStyle = "-fx-background-color:orange;"
					+ "-fx-text-fill:white";
		
b.setStyle(btnStyle);
```

[go back home][home]

### CSS Reference Table

There are different properties in javafx that is not identical 
to css so I am going to  equate javafx css to regular css

JavaFX | CSS
-|-
-fx-background-color | background-color
-fx-text-fill | color
-fx-padding | padding
-fx-font | font
-fx-border-radius | border-radius
-fx-border-radius | border-radius


[go back home][home]

### How to add Stylesheet to app

You can either add the stylesheet to the layout or the scene.
Either one will work

```java
// Note: You also have to reference that package that you are in
scene.getStylesheets().add("javafx/style.css");
```

[go back home][home]

### ListView.setPrefHeight

Sets the height to the list view 

```java

lv.getItems().addAll("call of duty", "medal of honor", "battlefield", "battlegrounds");
lv.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
lv.setPrefHeight(100);// Sets the height to be 100 pixels
```

[go back home][home]

### ListView.getSelectionModel.getSelectedItems

Extracts the selected items from the ListView so that can be assigned 
to an ObservableList object. This object can then be to print out the items 
singularly

```java
@Override
	public void start(Stage myStage){
		myStage.setTitle("ListView");
		Text t  = new Text("Let's select multiple items");
		final ListView<String> lv = new ListView();
		lv.getItems().addAll("call of duty", "medal of honor", "battlefield", "battlegrounds");
		lv.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		lv.setPrefHeight(100);
		Button btn = new Button("Action");
		btn.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent ae){
				showItems(lv);
			}

			
		});
		
		FlowPane flow = new FlowPane(Orientation.VERTICAL,10,10);
		flow.setAlignment(Pos.CENTER);
		flow.getChildren().addAll(t,lv,btn);
		Scene scene = new Scene(flow,720,480);
		myStage.setScene(scene);
		myStage.show();
	}
	
	
	private void showItems(ListView<String> list){
		
		ObservableList<String>  games;
		String message = "";
		
		games = list.getSelectionModel().getSelectedItems();
		
		for(String m : games){
			message += m+"\n";
		}
		
		System.out.println(message);
	}
```

[go back home][home]

### ListView.getSelectionModel.setSelectionMode(SelectionMode)

This allows you to select multiple items by holding the **Ctrl** key. And
clicking on the other options

```java
ListView<String> lv = new ListView();
lv.getItems().addAll("call of duty", "medal of honor", "battlefield", "battlegrounds");
lv.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
lv.setPrefHeight(100);
```

[go back home][home]

### ListView.getItems.addAll

Adds all the items to the ListView 

```java
ListView<String> lv = new ListView();
		
lv.getItems().addAll("mario","link", "donkey kong");
```

[go back home][home]


### ComboBox.setEditable

Allows you to edit the options within the combo box

```java

final ComboBox cb = new ComboBox();
		
cb.getItems().addAll("Pikachu", "Charmander", "Bulbasaur", "Squirtle");
		
cb.setEditable(true);
```

[go back home][home]

### ComboBox.getValue

Gets the value of the current option that you selected

```java

Text t = new Text("Let's try to get the values of these things");
		
		
		
		final ComboBox cb = new ComboBox();
		
		cb.getItems().addAll("Pikachu", "Charmander", "Bulbasaur", "Squirtle");
		
		grid.setVgap(20);
		grid.setHgap(20);
		
		grid.add(t,2,1);
		grid.add(cb, 2, 2);
		
		cb.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent ae){
				
			System.out.println(cb.getValue());
			}
		});
```

[go back home][home]

### ComboBox.setPromptText

The prompt text is not an option, but is the first option that you will
see in the combo box. Usually the prompt text will be used as a question
to make the user decide which option he wants to choose.

```java
ComboBox cb2 = new ComboBox();
		
cb2.getItems().addAll("Mouth", "Tits", "Ass" );
		
cb2.setPromptText("Choose your favorite part of a woman");

```

[go back home][home]

### ComboBox.getChildren.addAll

Adds all the options to the combo box

```java

ComboBox cb = new ComboBox();
		
cb.getItems().addAll("Apples", "Bananas", "Carrots");
```


[go back home][home]

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
### How to create an alert box

You have to create two files one for the main javafx window that we will call
**App** and the other file for the next window that we are going to call **Modal**.

```java

//inside App or at least the start function
public void start(Stage myStage){
	   window = myStage;
	   window.setTitle("Modal Popup");

	   FlowPane flow = new FlowPane(Orientation.VERTICAL,20,20);
	   flow.setAlignment(Pos.CENTER);

	   btn = new Button("Open up modal");
	   tx = new Text("Some Title");

	   btn.setOnAction(e -> Modal.display());

	   flow.getChildren().addAll(tx,btn);

	   Scene scene = new Scene(flow,400,400);

	   window.setScene(scene);
	   window.show();
   }
```
```java

//inside Modal

public class Modal {




    public static void display(){

        Stage window = new Stage();
        window.setTitle("Modal Window");
        window.initModality(Modality.APPLICATION_MODAL);// this options makes you have to close this window before going to another
        Button btn = new Button("close window");
        Text tx = new Text("This is a modal window");

        FlowPane flow = new FlowPane();
        flow.setAlignment(Pos.CENTER);
        flow.getChildren().addAll(tx,btn);

        btn.setOnAction(e -> window.close());

        Scene scene = new Scene(flow,720,480);

        window.setScene(scene);

        window.showAndWait();// I'm not that sure why we needed this but it as added in the tutorial so..

    }
}

```

[go back home][home]

### GridPane.setPadding

this sets the padding to the grid layout

```java
GridPane grid  = new GridPane();

grid.setPadding(new Insets(10,10,10,10));// creates padding for the layout/pane
```
[go back home][home]

=======
### FlowPane.setAlignment

**reference**
- [docs](https://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/FlowPane.html#setAlignment-javafx.geometry.Pos-)

Aligns the elements in a certain position in the layout

```java
FlowPane flow = new FlowPane();

flow.setAlignment(Pos.CENTER);
```
**Pos Options**
- CENTER
- BASELINE_CENTER
- BASELINE_LEFT
- BASELINE_RIGHT
- TOP_CENTER
- TOP_LEFT
- TOP_RIGHT
- BOTTOM_CENTER
- BOTTOM_LEFT
- BOTTOM_RIGHT

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

### setOnAction

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
- [java docs](https://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/FlowPane.html)

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
