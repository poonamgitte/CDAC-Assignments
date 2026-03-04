
package org.cdac.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UserEntry {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Connection connection = null;
		Statement stUpdateUser = null;
		ResultSet listResult = null;
		ResultSet result = null;
		

		Scanner scanner = new Scanner(System.in);

		Class.forName("com.mysql.cj.jdbc.Driver");

		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch2_java", "root", "cdac");

		stUpdateUser = connection.createStatement();

		System.out.println(
				"Enter choice 1. Register a User\n2. List All Users based on City\n3. Update Password of a User\n "
				+ "4. Display user information based on User Name \n 5.display");
		int choice = scanner.nextInt();

		switch (choice) {
		case 1: {
			// 1. register user

			System.out.println("Enter Username:");
			String userName = scanner.next();

			System.out.println("Enter password:");
			String password = scanner.next();

			System.out.println("Enter name:");
			String name = scanner.next();

			System.out.println("Enter Email:");
			String email = scanner.next();

			System.out.println("Enter city:");
			String city = scanner.next();

			String insertUser = "Insert into users values ('" + userName + "', '" + password + "', '" + name
					+ "', '" + email + "', '" + city + "' )";

			stUpdateUser.executeUpdate(insertUser);

			System.out.println("User Registered");

		}
			break;

		case 2: {
			// 2. List all user based on city

			System.out.println("Enter city to search users:");
			String city = scanner.next();
			String listUsers = "SELECT * FROM users WHERE city = ' " + city + " ' ";

			listResult = stUpdateUser.executeQuery(listUsers);

			while (listResult.next()) {
				System.out.print(listResult.getString("user_name") + " ");
				System.out.print(listResult.getString("password") + " ");

				System.out.print(listResult.getString("name") + " ");

				System.out.print(listResult.getString("email") + " ");

				System.out.print(listResult.getString("city") + " ");

			}
		}
			break;

		case 3: {
			System.out.println("Enter username to update password:");
			String userName2 = scanner.next();

			System.out.println("Enter new password :");
			String password2 = scanner.next();

			String updatePassword = "Update users set password ='" + password2 + "' where user_name = trim('" + userName2
					+ "')";

			stUpdateUser.executeUpdate(updatePassword);

			System.out.println("Password Updated");
		}
			break;
		
		case 4: {
			// 4. List all user based on username

			System.out.println("Enter username to search users:");
			String userName = scanner.next();
			String listUsers = "SELECT * FROM users WHERE user_name = '" + userName + "' ";

			listResult = stUpdateUser.executeQuery(listUsers);

			while (listResult.next()) {
				System.out.print(listResult.getString("user_name") + " ");
				System.out.print(listResult.getString("password") + " ");

				System.out.print(listResult.getString("name") + " ");

				System.out.print(listResult.getString("email") + " ");

				System.out.print(listResult.getString("city") + " ");

			}
		}
			break;
		

		case 5: {
			result = stUpdateUser.executeQuery("SELECT * FROM batch2_java.users;");

			System.out.println(result);

			while (result.next()) {

				System.out.println("username\t password\t name\t email \tcity");
				System.out.print(result.getString("user_name") + "\t");
				System.out.print(result.getString("password") + "\t");

				System.out.print(result.getString("name") + "\t");

				System.out.print(result.getString("email") + "\t");

				System.out.print(result.getString("city") + "\n");

				System.out.println("*********************");
			}
		}
		break;

		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}

	}
}
