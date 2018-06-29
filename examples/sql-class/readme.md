# SQL Class



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
