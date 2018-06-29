var main, sql, ani, zooT, codeArr = [];

main = `package zoo;


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
`;

sql = `    package zoo;

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
`;

ani = `				package zoo;

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
					`;
zooT = `<?xml version="1.0" encoding="UTF-8"?>

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
`;

codeArr = [main,sql,ani,zooT];