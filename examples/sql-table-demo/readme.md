# SQL TABLE DEMO


### Table2Controller 

```java
package controller;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import model.SQL;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeView;

public class Table2Controller implements Initializable{

    @FXML
    private ListView<String> fx_lv;

    @FXML
    private TableView<?> fx_tv;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		List<String> listTables = SQL.listTables();
			
		for(String val : listTables){
			
		    fx_lv.getItems().add(val);
		}
		
		
	
		
		fx_lv.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>(){
			
			@Override
			public void changed (ObservableValue<? extends String> obj, String old, String recent) {
		
				System.out.println(recent);
				
				List<String> list = SQL.getColumns(recent);
				
				for(String val : list){
					System.out.println(val);
				}
			}
		});
	
	}//init

}


```


### Table2.fxml

```xml
<?xml version="1.0" encoding="UTF-8"?>

<?import javafx.scene.control.Label?>
<?import javafx.scene.control.ListView?>
<?import javafx.scene.control.Menu?>
<?import javafx.scene.control.MenuBar?>
<?import javafx.scene.control.MenuItem?>
<?import javafx.scene.control.SeparatorMenuItem?>
<?import javafx.scene.control.TableColumn?>
<?import javafx.scene.control.TableView?>
<?import javafx.scene.layout.AnchorPane?>
<?import javafx.scene.layout.VBox?>
<?import javafx.scene.text.Font?>

<VBox prefHeight="400.0" prefWidth="640.0" xmlns="http://javafx.com/javafx/8.0.141" xmlns:fx="http://javafx.com/fxml/1" fx:controller="controller.Table2Controller">
  <children>
    <MenuBar VBox.vgrow="NEVER">
      <menus>
        <Menu mnemonicParsing="false" text="File">
          <items>
            <MenuItem mnemonicParsing="false" text="New" />
            <MenuItem mnemonicParsing="false" text="Openâ€¦" />
            <Menu mnemonicParsing="false" text="Open Recent" />
            <SeparatorMenuItem mnemonicParsing="false" />
            <MenuItem mnemonicParsing="false" text="Close" />
            <MenuItem mnemonicParsing="false" text="Save" />
            <MenuItem mnemonicParsing="false" text="Save Asâ€¦" />
            <MenuItem mnemonicParsing="false" text="Revert" />
            <SeparatorMenuItem mnemonicParsing="false" />
            <MenuItem mnemonicParsing="false" text="Preferencesâ€¦" />
            <SeparatorMenuItem mnemonicParsing="false" />
            <MenuItem mnemonicParsing="false" text="Quit" />
          </items>
        </Menu>
        <Menu mnemonicParsing="false" text="Edit">
          <items>
            <MenuItem mnemonicParsing="false" text="Undo" />
            <MenuItem mnemonicParsing="false" text="Redo" />
            <SeparatorMenuItem mnemonicParsing="false" />
            <MenuItem mnemonicParsing="false" text="Cut" />
            <MenuItem mnemonicParsing="false" text="Copy" />
            <MenuItem mnemonicParsing="false" text="Paste" />
            <MenuItem mnemonicParsing="false" text="Delete" />
            <SeparatorMenuItem mnemonicParsing="false" />
            <MenuItem mnemonicParsing="false" text="Select All" />
            <MenuItem mnemonicParsing="false" text="Unselect All" />
          </items>
        </Menu>
        <Menu mnemonicParsing="false" text="Help">
          <items>
            <MenuItem mnemonicParsing="false" text="About MyHelloApp" />
          </items>
        </Menu>
      </menus>
    </MenuBar>
    <AnchorPane maxHeight="-1.0" maxWidth="-1.0" prefHeight="-1.0" prefWidth="-1.0" VBox.vgrow="ALWAYS">
      <children>
        <Label alignment="CENTER" layoutX="263.0" layoutY="14.0" style="&#10;" text="Getting Tables" textAlignment="CENTER" textFill="#9f9f9f" wrapText="false">
          <font>
            <Font size="18.0" />
          </font>
        </Label>
            <TableView fx:id="fx_tv" layoutX="273.0" layoutY="59.0" prefHeight="200.0" prefWidth="200.0">
              <columns>
                <TableColumn prefWidth="75.0" text="C1" />
                <TableColumn prefWidth="75.0" text="C2" />
              </columns>
            </TableView>
            <ListView fx:id="fx_lv" layoutX="27.0" layoutY="59.0" prefHeight="200.0" prefWidth="200.0" />
      </children>
    </AnchorPane>
  </children>
</VBox>


```

### SQL 

```java
package model;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.*;
import java.util.*;

public class SQL {
	private static String url = "jdbc:sqlite:C:\\Users\\j\\Documents\\Web Development\\sqlite\\sample.db";
	private static Connection conn = null;
	private static Statement st;
	private static ResultSet rs;
	private static final SQL sql = new SQL();
	private static String db = null;

	public static SQL db(String db){
		
		sql.db = db;
		return sql;
	}
	
	
	public static void log(String txt) {
		System.out.println(txt);
	}

	public static void create(String table) {

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
					conn.close();
					st.close();

				}
			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}

	public static void insert(String values) {

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

	public static void query(String query) {

		try {

			conn = DriverManager.getConnection(url);
			st = conn.createStatement();

			rs = st.executeQuery(query);

			log("Here are the values");

			while (rs.next()) {
				log("\n");
				log("id : " + rs.getInt("id"));
				log("name : " + rs.getString("name"));
				log("age : " + rs.getInt("age"));

			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
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

	public static void getColumnTypes(String query) {

		try {

			conn = DriverManager.getConnection(url);
			st = conn.createStatement();
			DatabaseMetaData md = conn.getMetaData();

			rs = st.executeQuery(query);

			ResultSetMetaData rsd = rs.getMetaData();

			for (int col = 1; col <= rsd.getColumnCount(); col++) {

				log("column: " + rsd.getColumnName(col));
				log("colmn type: " + rsd.getColumnTypeName(col));
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
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


	public static List<String> getColumns(String table) {

		List<String> list = new ArrayList<String>();
		
		try {

			conn = DriverManager.getConnection(url);
			st = conn.createStatement();
			DatabaseMetaData md = conn.getMetaData();

			

			 rs = md.getColumns(null,null,table,null);
			 while(rs.next()){
//			 log("column: "+ rs.getString("COLUMN_NAME"));
				 list.add(rs.getString("COLUMN_NAME"));
			 }

			

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
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
		
		return list;
	}


	public static void getSchemas() {

		try {

			conn = DriverManager.getConnection(url);
			st = conn.createStatement();
			DatabaseMetaData md = conn.getMetaData();

			 rs = md.getSchemas();
			 String tableSchema, tableCatalog;
			 log("Here are the values");
			
			 while (rs.next()) {
			 tableSchema = rs.getString(1); // "TABLE_SCHEMA"
			 tableCatalog = rs.getString(2); // "TABLE_CATALOG"
			 System.out.println("tableSchema" + tableSchema);
			 }

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
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

	
	
	
	public static List<String> listTables() {

		List<String> list =  new ArrayList<String>();
		
		try {

			conn = DriverManager.getConnection(url);
			st = conn.createStatement();
			DatabaseMetaData md = conn.getMetaData();

			rs = md.getTables(null, null, "%", null);

			log("Here are the values");

			while (rs.next()) {
				
				list.add(rs.getString(3));

			}


		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
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
		
		return list;
	}

	public static void connect() {

		try {
			// db parameters
			// create a connection to the database
			conn = DriverManager.getConnection(url);

			System.out.println("Connection to SQLite has been established.");

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

	public static void main(String[] args) {

		String table = "create table if not exists students("
				+ "id integer primary key autoincrement,"
				+ "name text not null," + "age integer not null);";

		// create(table);

		listTables();
	}

}


```


### Main

```java
package main;


import java.io.IOException;
import java.time.LocalDateTime;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
	
	
	@Override
	public void start(Stage window) throws IOException {
		window.setTitle("I don't know");

		Pane root = (Pane) FXMLLoader.load(getClass().getResource("../view/Table2.fxml"));

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