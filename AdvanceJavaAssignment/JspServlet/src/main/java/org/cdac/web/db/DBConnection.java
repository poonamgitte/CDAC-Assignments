package org.cdac.web.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
     
	 private String dbURL;
	 private String user;
	 private String password;
	 private Connection connection ;
	 
	 
	 public DBConnection(String className, String url , String user , String password){
		      this.dbURL = url;
		      this.user = user;
		      this.password = password;
		      
		      try {
				  Class.forName(className);
				  this.connection = DriverManager.getConnection(dbURL , user, password);
				  System.out.println(this.connection);
		      } catch (ClassNotFoundException | SQLException e) {
				  e.printStackTrace();
			  }   
	 }
	 
	 public Connection getConnection() {
		    return this.connection;
	 }
	 
	 public void closeConnection(){
			try {
			   if(connection != null) {
				  connection.close();
				}
		    } catch (SQLException e) {
			   e.printStackTrace();
		    }

	 }
}
