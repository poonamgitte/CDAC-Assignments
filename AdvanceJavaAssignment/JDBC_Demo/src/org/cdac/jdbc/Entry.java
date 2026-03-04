package org.cdac.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Entry {
	public static void main(String[] args) throws SQLException {
		Connection connection=null;
		Statement stSelector=null;
		ResultSet result=null;
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch2_java","root","cdac");
			
			stSelector=connection.createStatement();
			
			result=stSelector.executeQuery("SELECT * FROM batch2_java.users;");
			
			System.out.println(result);
			
			while(result.next()) {
				
				System.out.println("username\t password\t name\t email \tcity");
				System.out.print(result.getString("user_name") + "\t");
				System.out.print(result.getString("password")+ "\t");
				
				System.out.print(result.getString("name")+ "\t");
				
				System.out.print(result.getString("email")+ "\t");
				
				System.out.print(result.getString("city")+"\n");
				
				
				
				System.out.println("*********************");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			try {
				if(result!=null)
					result.close();
				if(stSelector!=null)
					stSelector.close();
				if(connection!=null)
					connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}
}
