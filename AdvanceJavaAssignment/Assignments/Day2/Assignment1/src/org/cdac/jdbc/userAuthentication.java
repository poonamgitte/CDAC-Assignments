package org.cdac.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class userAuthentication {

	public static void main(String[] args) throws SQLException {
		
		
		Scanner scanner = new Scanner(System.in);
		
		Connection connection = DriverManager.getConnection(args[0], args[1], args[2]);
		
		PreparedStatement psAuthenticateUser = connection.prepareStatement("select * from users where user_name=? and password=?");

		
		System.out.println("Enter user name:");
		String userName = scanner.next();
		
		System.out.println("Enter password:");
		String password = scanner.next();
		
		password += scanner.nextLine();		
		System.out.println(psAuthenticateUser);
		
		psAuthenticateUser.setString(1,userName);
		psAuthenticateUser.setString(2,password);
		
		ResultSet result = psAuthenticateUser.executeQuery();
		
		if(result.next())
			System.out.println("User authenticated");
		else {
			System.out.println("Authentication failed");
		}
		
	}

}
