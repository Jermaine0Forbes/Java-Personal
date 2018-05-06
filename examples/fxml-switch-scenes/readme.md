# FXML : how to switch scenes with a controller


## Main.java 

```java

package switchy;

import javafx.animation.AnimationTimer;
import javafx.application.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.*;
import javafx.fxml.FXMLLoader;
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

import java.io.IOException;
import java.util.*;
import javafx.scene.paint.*;
import javafx.scene.image.*;
import javafx.scene.input.*;

public class Main extends Application {

	Scene scene;

	@Override
	public void start(Stage window) throws IOException {
		window.setTitle("Scene");

		Pane root = (Pane) FXMLLoader.load(Main.class.getResource("Scene1.fxml"));

		scene = new Scene(root);

		window.setScene(scene);

		window.show();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}


```


## ScreenController.java 

```java


package switchy;

import java.io.IOException;
import java.util.HashMap;

import javafx.stage.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class SceneController {

	private HashMap<String,String> switchScene = new HashMap<>();

	public SceneController() throws IOException {

		switchScene.put("2", "Scene2.fxml");
		switchScene.put("1", "Scene1.fxml");
	}


    @FXML
    private Button fx_btn;

    @FXML
    void onSwitch(ActionEvent e) throws IOException {


    	String src = switchScene.get("2");
    	Scene s = (Scene)((Node) e.getSource()).getScene();
    	Pane pane = (Pane) FXMLLoader.load(Main.class.getResource(src));
    	s.setRoot(pane);


    }

    @FXML
    private Button fx_btn2;

    @FXML
    void onSwitch2(ActionEvent e) throws IOException {
    	String src = switchScene.get("1");
    	Scene s = (Scene)((Node) e.getSource()).getScene();
    	Pane pane = (Pane) FXMLLoader.load(Main.class.getResource(src));
    	s.setRoot(pane);

    }

}


```


## Scene1.fxml

```xml

<?xml version="1.0" encoding="UTF-8"?>

<?import javafx.scene.text.*?>
<?import javafx.scene.control.*?>
<?import java.lang.*?>
<?import javafx.scene.layout.*?>


<AnchorPane maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="400.0" prefWidth="600.0" xmlns="http://javafx.com/javafx/8" xmlns:fx="http://javafx.com/fxml/1" fx:controller="switchy.SceneController">
   <children>
      <Label layoutX="238.0" layoutY="59.0" text="Scene 1">
         <font>
            <Font size="36.0" />
         </font>
      </Label>
      <Button fx:id="fx_btn" layoutX="274.0" layoutY="221.0" mnemonicParsing="false" onAction="#onSwitch" text="Button" />
   </children>
</AnchorPane>


```

## Scene2.fxml

```xml

<?xml version="1.0" encoding="UTF-8"?>

<?import javafx.scene.text.*?>
<?import javafx.scene.control.*?>
<?import java.lang.*?>
<?import javafx.scene.layout.*?>


<AnchorPane maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="400.0" prefWidth="600.0" xmlns="http://javafx.com/javafx/8" xmlns:fx="http://javafx.com/fxml/1" fx:controller="switchy.SceneController">
   <children>
      <Label layoutX="238.0" layoutY="59.0" text="Scene 2">
         <font>
            <Font size="36.0" />
         </font>
      </Label>
      <Button fx:id="fx_btn2" layoutX="274.0" layoutY="221.0" mnemonicParsing="false" onAction="#onSwitch2" text="Button" />
   </children>
</AnchorPane>


```