# Zoo SQL Example 


This is just an example of using SQLite with FXML. At this moment
I have created two windows that allows you  to insert data, query 
data into a table, edit data from the table, and update the data into 
SQLite. I have not created a method to delete data from SQLite, but I can definietly remove right now 


## Controllers


## FXML

## General 


[home]:#zoo-sql-example



### Main

<details>
    <summary>
        View Content
    </summary>
    
```java
package zoo;


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

	@Override
	public void start(Stage window) throws IOException {
		window.setTitle("Zoo Time");

		Pane root = (Pane) FXMLLoader.load(Main.class.getResource("Zoo.fxml"));

		Scene scene = new Scene(root);
		window.setScene(scene);

		window.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}



    
    
```
    
</details>

[go back :house:][home]

### SQL

<details>
    <summary>
        View Content
    </summary>
    
```java
package zoo;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.*;
import java.util.*;

public class SQL {

	private static String url = "jdbc:sqlite:C:\\Users\\j\\Documents\\Web Development\\sqlite\\sample.db";

	private static Connection conn = null;

	private static Statement st;

	private static ResultSet rs;




	private static void log(String msg) {

		System.out.println(msg);
	}

	private static void log(int msg) {

		System.out.println(msg);
	}

	public static void connect() {

		try {

			conn = DriverManager.getConnection(url);
			st = conn.createStatement();

			log("Established a connection");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {

			try {
				if (conn != null) {
					conn.close();

				}

			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}

		}

	}

	public static void create() {

		String table = "create table if not exists zoo(" + "id integer primary key autoincrement,"
				+ "animal text not null," + "sex text not null);";

		try {

			conn = DriverManager.getConnection(url);
			st = conn.createStatement();

			st.execute(table);

			log("table created");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (conn != null) {

					st.close();
					conn.close();

				}
			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}

	public static void insert(String values) {

		Connection conn = null;

		try {

			conn = DriverManager.getConnection(url);
			st = conn.createStatement();

			st.execute(values);

			log("Data has been saved");

			// conn.close();
			st.close();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}


	public static void update(String values){


		try {

			conn = DriverManager.getConnection(url);
			st = conn.createStatement();

			st.executeUpdate(values);

			log("Data has been updated");

			st.close();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
			}
		}

	}


	public static void query(String query){

		Connection conn = null;

		try{

			 conn = DriverManager.getConnection(url);  st = conn.createStatement();
//			 DatabaseMetaData dmb;

			 rs  = st.executeQuery(query);

			 log("Here are the values");

			 while(rs.next()){
				 log("\n");
				 log("id : "+rs.getInt("id"));
				 log("name : "+rs.getString("name"));
				 log("age : "+rs.getInt("age"));

			 }



	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }finally {
	            try {
	                if (conn != null) {

	                    rs.close();
	                    st.close();
	                    conn.close();
	                }
	            } catch (SQLException ex) {
	                System.out.println(ex.getMessage());
	            }
	        }
	}


	public static ArrayList<Animal> queryAnimal(String query){

		Connection conn = null;
		ArrayList<Animal> aList = new ArrayList<Animal>();

		try{

			conn = DriverManager.getConnection(url);  st = conn.createStatement();
//			 DatabaseMetaData dmb;

			rs  = st.executeQuery(query);

			log("Here are the values");

			while(rs.next()){

				aList.add(new Animal(rs.getInt("id"),rs.getString("animal"),rs.getString("sex")));
//				log("\n");
//				log("id : "+rs.getInt("id"));
//				log("name : "+rs.getString("name"));
//				log("age : "+rs.getInt("age"));

			}



		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if (conn != null) {

					rs.close();
					st.close();
					conn.close();
				}
			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
			}
		}

		return aList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		create();

	}

}

    
    
```
    
</details>

[go back :house:][home]

### Animal

<details>
    <summary>
        View Content
    </summary>
    
```java
package zoo;

public class Animal {
	private int id;

	private String name;
	private String sex;

	public Animal(int id, String name, String sex){
		this.id  = id;
		this.name = name;
		this.sex = sex;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

}
    
    
```
    
</details>

[go back :house:][home]

### ZooTable.fxml

<details>
    <summary>
        View Content
    </summary>
    
```xml
<?xml version="1.0" encoding="UTF-8"?>

<?import javafx.scene.text.*?>
<?import javafx.scene.control.*?>
<?import java.lang.*?>
<?import javafx.scene.layout.*?>

<AnchorPane maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="400.0" prefWidth="600.0" xmlns="http://javafx.com/javafx/8" xmlns:fx="http://javafx.com/fxml/1" fx:controller="zoo.ZooTableController">
   <children>
      <Label layoutX="267.0" layoutY="14.0" text="Zoo">
         <font>
            <Font size="36.0" />
         </font>
      </Label>
      <ScrollPane layoutX="1.0" layoutY="112.0" prefHeight="200.0" prefWidth="600.0">
         <content>
            <StackPane prefHeight="198.0" prefWidth="570.0">
               <children>
                  <TableView fx:id="fx_table" nodeOrientation="LEFT_TO_RIGHT" prefHeight="200.0" prefWidth="226.0">
                    <columns>
                        <TableColumn fx:id="t_id" prefWidth="75.0" text="Id">

                      </TableColumn>
                      <TableColumn fx:id="t_name" prefWidth="75.0" text="Name">

                      </TableColumn>
                      <TableColumn fx:id="t_sex" prefWidth="75.0" text="Sex">

                      </TableColumn>
                    </columns>
                  </TableView>
               </children>
            </StackPane>
         </content>
      </ScrollPane>
      <Button fx:id="btn_query" layoutX="33.0" layoutY="67.0" mnemonicParsing="false" onAction="#onQuery" text="Query" />
      <Button fx:id="btn_back" layoutX="127.0" layoutY="67.0" mnemonicParsing="false" onAction="#onBack" text="Back" />
      <Button layoutX="209.0" layoutY="67.0" mnemonicParsing="false" onAction="#onDelete" text="Delete" />
      <Button layoutX="304.0" layoutY="67.0" mnemonicParsing="false" onAction="#onUpdate" text="Update" />
   </children>
</AnchorPane>
    
    
```
    
</details>

[go back :house:][home]

### Zoo.fxml

<details>
    <summary>
        View Content
    </summary>
    
```xml
 <?xml version="1.0" encoding="UTF-8"?>

<?import javafx.scene.text.*?>
<?import javafx.scene.control.*?>
<?import java.lang.*?>
<?import javafx.scene.layout.*?>


<AnchorPane maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="400.0" prefWidth="600.0" xmlns="http://javafx.com/javafx/8" xmlns:fx="http://javafx.com/fxml/1" fx:controller="zoo.ZooController">
   <children>
      <Label layoutX="181.0" layoutY="35.0" text="Create Animals">
         <font>
            <Font size="36.0" />
         </font>
      </Label>
      <Button fx:id="fx_save" layoutX="181.0" layoutY="122.0" mnemonicParsing="false" onAction="#onSave" text="Save" />
      <Button fx:id="fx_switch" layoutX="376.0" layoutY="122.0" mnemonicParsing="false" onAction="#goToTable" text="Table" />
      <Separator layoutX="297.0" layoutY="113.0" orientation="VERTICAL" prefHeight="44.0" prefWidth="0.0" />
      <Label layoutX="181.0" layoutY="200.0" text="Animal :">
         <font>
            <Font size="14.0" />
         </font>
      </Label>
      <Label layoutX="181.0" layoutY="283.0" text="Sex :">
         <font>
            <Font size="14.0" />
         </font>
      </Label>
      <TextField fx:id="fx_animal" layoutX="250.0" layoutY="198.0" />
      <TextField fx:id="fx_sex" layoutX="250.0" layoutY="281.0" />
   </children>
</AnchorPane>
   
    
```
    
</details>

[go back :house:][home]


### ZooTableController

<details>
    <summary>
        View Content
    </summary>
    
```java
package zoo;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.Pane;
import javafx.util.converter.IntegerStringConverter;

public class ZooTableController implements Initializable {

	private ArrayList<Animal> animalList = new ArrayList<Animal>();
	private HashMap<String, String> hs = new HashMap<>();

	public ZooTableController() {
		hs.put("insert", "Zoo.fxml");
		hs.put("table", "ZooTable.fxml");
	}

	@FXML
	private TableColumn<Animal, Integer> t_id;

	@FXML
	private TableView<Animal> fx_table;

	@FXML
	private TableColumn<Animal, String> t_sex;

	@FXML
	private TableColumn<Animal, String> t_name;

	@FXML
	private Button btn_query;

	@FXML
	private Button btn_back;

	@FXML
	void onUpdate(ActionEvent event) {
		String updateQ = "";

		List<Animal> animalData = new ArrayList<>();
		for (Animal item : fx_table.getItems()) {
//		    animalData.add(col.getCellObservableValue(item).getValue());
			updateQ += "update zoo set animal = '"+item.getName()+"' , sex ='"+item.getSex()+"'  where id = "+item.getId()+"; \n ";


		}

		System.out.println(updateQ);

		SQL.update(updateQ);

	}

	@FXML
	void onDelete(ActionEvent event) {
		Animal a = fx_table.getSelectionModel().getSelectedItem();
		fx_table.getItems().remove(a);
		System.out.println(a.getName() + " has been removed");
	}

	@FXML
	void onBack(ActionEvent e) throws IOException {
		String src = hs.get("insert");
		Scene s = (Scene) ((Node) e.getSource()).getScene();
		Pane pane = (Pane) FXMLLoader.load(Main.class.getResource(src));
		s.setRoot(pane);

	}

	@FXML
	void onQuery(ActionEvent event) {
		animalList = SQL.queryAnimal("select * from zoo");

		// for(int x =0 ; x < animalList.size(); x++){
		// Animal ani = animalList.get(x);
		//
		// System.out.println("Animal: "+x+1);
		// System.out.println("Id: "+ani.getId());
		// System.out.println("Name: "+ani.getName());
		// System.out.println("Sex:"+ ani.getSex());
		// }

		ObservableList<Animal> data = FXCollections.observableArrayList();

		for (Animal a : animalList) {

			data.add(a);
			// System.out.println("\n \n");
			// System.out.println("Id: "+a.getId());
			// System.out.println("Name: "+a.getName());
			// System.out.println("Sex:"+ a.getSex());

		}

		// ObservableList<Animal> data =
		// FXCollections.observableArrayList(animalList);
		// ObservableList<Animal> data = FXCollections.observableArrayList(new
		// Animal(1, "cat","female"));
		// ObservableList<Animal> data = list;

		fx_table.setItems(data);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

		t_name.setCellValueFactory(new PropertyValueFactory<>("name"));
		t_sex.setCellValueFactory(new PropertyValueFactory<>("sex"));
		t_id.setCellValueFactory(new PropertyValueFactory<>("id"));

		t_name.setCellFactory(TextFieldTableCell.forTableColumn());
		t_sex.setCellFactory(TextFieldTableCell.forTableColumn());
//		t_id.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));

		 t_name.setOnEditCommit(
		 (TableColumn.CellEditEvent<Animal, String> t) ->
		 ( t.getTableView().getItems().get(
		 t.getTablePosition().getRow())
		 ).setName(t.getNewValue())
		 );

//
//		 t_id.setOnEditCommit(
//		 (TableColumn.CellEditEvent<Animal, Integer> t) ->
//		 ( t.getTableView().getItems().get(
//		 t.getTablePosition().getRow())
//		 ).setId(t.getNewValue())
//		 );

		 t_sex.setOnEditCommit(
		 (TableColumn.CellEditEvent<Animal, String> t) ->
		 ( t.getTableView().getItems().get(
		 t.getTablePosition().getRow())
		 ).setSex(t.getNewValue())
		 );

		fx_table.setEditable(true);
	}

}
   
    
```
    
</details>

[go back :house:][home]


### ZooController

<details>
    <summary>
        View Content
    </summary>
    
```java
 package zoo;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;

public class ZooController implements  Initializable{

	private HashMap<String, String> hs = new HashMap<>();


	public ZooController(){

		hs.put("insert", "Zoo.fxml");
		hs.put("table", "ZooTable.fxml");


	}

    @FXML
    private TableView<Animal> fx_table;

    @FXML
    private Button fx_switch;

    @FXML
    private Button fx_save;

    @FXML
    private TextField fx_animal;

    @FXML
    private TextField fx_sex;

    @FXML
    private TableColumn<Animal,String> t_id;


    @FXML
    private TableColumn<Animal,String> t_sex;


    @FXML
    private TableColumn<Animal,String> t_name;



    @FXML
    void onSave(ActionEvent event) {

    	String ani = fx_animal.getText();
    	String sex = fx_sex.getText();

    	String insert = "insert into zoo (animal,sex) values ('"+ani+"','"+sex+"')";

    	SQL.insert(insert);

    	fx_animal.setText("");
    	fx_sex.setText("");

    }

    @FXML
    void goToTable(ActionEvent e) throws IOException {

    	String src = hs.get("table");
    	Scene s = (Scene)((Node) e.getSource()).getScene();
    	Pane pane = (Pane) FXMLLoader.load(Main.class.getResource(src));
    	s.setRoot(pane);


    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}

}
   
    
```
    
</details>

[go back :house:][home]