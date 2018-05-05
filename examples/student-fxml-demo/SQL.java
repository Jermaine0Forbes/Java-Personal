
package lite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.*;
import java.util.*;


public class SQL {
	private static String url = "jdbc:sqlite:C:\\Users\\j\\Documents\\Web Development\\sqlite\\sample.db";
//	private static Connection conn = null;
	private static Statement st ;
	private static ResultSet rs;
	
	
	public static void log (String txt){
		System.out.println(txt);
	}
	
	public static void create(String table){
		
		Connection conn = null;
		
		try{
			 
			 conn = DriverManager.getConnection(url); st = conn.createStatement();
	            
			 st.execute(table);
			 
			 log("table created");
	         
			 	            
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }finally {
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
	
	
	public static void insert(String values){
		
		Connection conn = null;
		
		try{
			 
			 conn = DriverManager.getConnection(url);  st = conn.createStatement();
	            
			 st.execute(values);
			 
			 log("Data has been saved");
	         
			 //conn.close();
			 st.close();
	            
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }finally {
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
	
	
		 public static void connect() {
	

				Connection conn = null;
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
	
	public static void main (String[] args){
		
		String table = "create table if not exists students("
				+ "id integer primary key autoincrement,"
				+ "name text not null,"
				+ "age integer not null);";
		
//		create(table);
	}

}
