package org.cdac.web.users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.http.HttpSession;

public class UserImplement implements UsersDAO {
    Connection connection ;
    String tableName ;
    
	public UserImplement(ServletContext ctx) {
		this.connection = (Connection) ctx.getAttribute("globalConnection");
		this.tableName = (String)ctx.getInitParameter("UTName");
		System.out.println(this.tableName);
	}

	@Override
	public Users login(String username, String password) throws SQLException {
		
		String sql = "SELECT * from "+ tableName +" where username = ? and password = ?";
		try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
			preparedStatement.setString(1,username);
			preparedStatement.setString(2, password);
			ResultSet resultSet = preparedStatement.executeQuery();
	
			if(resultSet.next()){
				String usr = resultSet.getString("username");
				String pwd = resultSet.getString("password");
				String name = resultSet.getString("name");
				String email = resultSet.getString("email");
				String city = resultSet.getString("city");
				String role = resultSet.getString("role");
				Users user = new Users(usr,pwd,name,email,city,role);
				return user;  
			}
		}
		return null;
	}

	@Override
	public Boolean signUp(String username, String password,String confPassword, String name, String email, String city) throws SQLException {
		
		if(!password.equals(confPassword)) {
			  return false;
		}
		
		String sql = "insert into "+tableName+" (username,password, name ,email ,city) VALUES (?,?,?,?,?)";
		try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
			preparedStatement.setString(1,username);
			preparedStatement.setString(2, password);
			preparedStatement.setString(3, name);
			preparedStatement.setString(4, email);
			preparedStatement.setString(5, city);
			
			int rowsAffected = preparedStatement.executeUpdate();
			return rowsAffected > 0;
		}
	}
     
}
