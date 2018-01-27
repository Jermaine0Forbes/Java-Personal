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

- [How to create a String Property][string-property]

## ChoiceBox
- [how to intialize choicebox][init-choice]
- [ChoiceBox.getItems.add][choice-add]
- [ChoiceBox.getItems.addAll][choice-addall]
- [ChoiceBox.setValue][choice-value]
- [ChoiceBox.getSelectionModel.selectedItemProperty.addListener][choice-listener]

## TreeView
- [TreeView.setExpanded]
- [how to initialize TreeView]
- [TreeView.setShowRoot]

## TableView
- [How to create a TableView][create-table]
- [TableView][table-view]
- [TableView.setItems()][table-items]
- [TableView.getColumns().addAll()][table-addAll]
- [TableColumn][table-column]
- [TableColumn.setMinWidth()][table-minwidth]
- [TableColumn.setCellValueFactory()][table-cellvalue]
- [ FXCollections.observableArrayList()][fxcollections]

[fxcollections]:#fxcollectionsobservablearraylist
[create-table]:#how-to-create-a-tableview
[table-cellvalue]:#tablecolumsetcellvaluefactory
[table-minwidth]:#tablecolumnsetminwidth
[table-column]:#tablecolumn
[table-addAll]:#tableviewgetcolumnsaddall
[table-items]:#tableviewsetitems
[table-view]:#tableview
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


### FXCollections.observableArrayList()


[go back home][home]

### How to create a TableView

**reference**
- [JavaFX TableView Tutorial](https://o7planning.org/en/11079/javafx-tableview-tutorial)
- [JavaFX Tutorial - JavaFX TableView](http://www.java2s.com/Tutorials/Java/JavaFX/0650__JavaFX_TableView.htm)


**Note: you need to create a get method in the class to actually get all the 
the data**

**Here is App**
```java
@Override
	public void start(Stage window){

		window.setTitle("Practicing using TableView");

		StackPane stack = new StackPane();

		TableView<User> tb = new TableView<User>();

		TableColumn<User,String> firstCol = new TableColumn<>("first name");

		TableColumn<User,String> lastCol = new TableColumn<>("last name");

		TableColumn<User,String> sexCol = new TableColumn<>("sex");

		TableColumn<User,String> ageCol = new TableColumn<>("age");

		firstCol.setMinWidth(100);
		lastCol.setMinWidth(100);
		sexCol.setMinWidth(100);
		ageCol.setMinWidth(100);


		firstCol.setCellValueFactory(new PropertyValueFactory<>("firstName"));
		lastCol.setCellValueFactory(new PropertyValueFactory<>("lastName"));
		sexCol.setCellValueFactory(new PropertyValueFactory<>("sex"));
		ageCol.setCellValueFactory(new PropertyValueFactory<>("age"));

		ObservableList<User> list = getList();
		tb.setItems(list);
		tb.getColumns().addAll(firstCol,lastCol,sexCol,ageCol);

		stack.getChildren().add(tb);
		Scene scene = new Scene(stack, 720,480);

		window.setScene(scene);
		window.show();
	}

	private ObservableList<User> getList(){

		User u1 = new User("john","mackel","male",36);
		User u2 = new User("rey","mary","female",24);
		User u3 = new User("mark","hamill","male",67);

		ObservableList<User> list = FXCollections.observableArrayList(u1, u2, u3);

		return list;
	}

```
**Here is the Class that I use for the table**
```java
public class User {

	private String firstName ;
	private String lastName;
	private int age;
	private String sex;

	public User(String firstName, String lastName, String sex,  int age) {
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
		this.sex = sex;
	}

	public String getFirstName (){

		return this.firstName;
	}

	public String getLastName (){

		return this.lastName;
		}

	public String getSex(){
		return this.sex;
	}

	public int getAge(){
		return this.age;
	}

}


```

[go back home][home]

### TableView.setItems()

The setItems method will add all the data created into the Table. But, the 
data first has to be assigned to an ObservableList object.

**Syntax**
`TableView.setItems(ObservableList<Object>)`

```java

TableView<User> tb = new TableView<>();

// Lets assume that the User Object only has one property which is name
TableColumn<User,String> nameCol = new TableColumn<>("name");

// Here we create multiple object to be used as data to be put into the table
User u1 = new User("john mackel");
User u2 = new User("rey mary");
User u3 = new User("mark hamill");

// FXCollections allows you to add multiple objects in an array
ObservableList<User> items = FXCollections.observableArrayList(u1,u1,u3); 

// setItems will then add the data into the table, as long as you have "getName"
// type of methods that will retrieve the properties from the Object
tb.setItems(items);

```

[go back home][home]

### TableView

This is how you create a Table View

`TableView<Object> table = new TableView<>()`

**App.java**
```java

TableView<User> table = new TableView<>();
```

**User.java**
```java

public class User{

private String firstName;
private String lastName;
private String sex;
private int age;

User(String firstName, String lastName, String sex, int age){
        this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
		this.sex = sex;
    }


}

```

[go back home][home]

### TableColumn.setCellValueFactory()

So this method is supposed to grab the property from the Object that you are using 
and insert it into the table cell. **Note: you cannot retrieve the property values if 
you do not have get methods for the property** . For example: getName()

`TableColumn.setCellValueFactory( new PropertyValueFactory<>(String value))`

```java 
TableView<User> table = new TableView<>();

TableColumn<User,String> firstCol = new TableColumn<>("First");
TableColumn<User,String> lastCol = new TableColumn<>("Last");

// Make sure that you name the property in the Object, so 
// firstName is the actual property in the User object
firstCol.setCellValueFactory(new PropertyValueFactory<>("firstName"));
firstCol.setMinWidth(100);
lastCol.setCellValueFactory(new PropertyValueFactory<>("lastName"));
lastCol.setMinWidth(100);

```

[go back home][home]

### TableColumn.setMinWidth()

Creates the minimum width of the column, its pointless to show code here

`TableColumn.setMinWidth(int value)`

[go back home][home]

### TableColumn

`TableColumn<Object,Data type> variable = new TableColumn(String name)`

**reference**
- [TableColumnBase](https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/TableColumnBase.html)
- [TableColumn](https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/TableColumn.html)

```java

TableView<User> table = new TableView<>();

TableColumn<User,String> firstCol = new TableColumn<>("First");
```

[go back home][home]



### How to create a StringProperty

The String property is an object that not only gets string values,
but it can also add listeners to the values. Something, regular strings cannot do 

**reference**
- [StringProperty](https://docs.oracle.com/javase/8/javafx/api/javafx/beans/property/StringProperty.html)

**Import**
`import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;`


**Class that has StringProperty**
```java
public class Animal {

	protected StringProperty type = new SimpleStringProperty(this,"cat");

	public Animal(){

		System.out.println("animal created");

	}

   public String getType(){
	   return type.getName();
   }
   
   public void setType(String str){
	   
	   type.setValue(str);
   }




}
```

**Inside the start method of a javafx**
```java 
FlowPane stack = new FlowPane(Orientation.VERTICAL,20,20);
		stack.setAlignment(Pos.CENTER);

		Animal a = new Animal();

		Label lb = new Label(a.getType());
		TextField tf = new TextField("Change the text");
		Button btn = new Button("Change");

		
		btn.setOnAction((e)->{

			a.setType(tf.getText());
			lb.setText(tf.getText());
		});
	
		// This will print the new value to console, once the value has changed
		a.type.addListener((obj, oldValue, newValue)->{
			System.out.println(newValue);
		});

		lb.setStyle("-fx-text-fill:white; -fx-font-size:20px;");

		stack.getChildren().addAll(lb,tf,btn);

```

[go back home][home]

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

**in lambda format**
```java
cb.getSelectionModel().selectedItemProperty().addListener(( obj, oldVal, newVal)->{
	             txt.setText(o.toString());
	        }
	      );
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

The method that triggers when an event happens

```java
btn.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent ae){
				//enter code
			}			
		});

```

**In lambda format**
```java 
btn.setOnAction((e)->{
	// enter code
	
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

`grid.add(Object, int Column,int Row)`

**reference**
- [GridPane](https://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/GridPane.html)
- [GridPane.add](https://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/GridPane.html#add-javafx.scene.Node-int-int-)

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
