package org.cdac.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class PreparedStatementDemo {

	public static void authenticateUser(Connection connection, Scanner scanner) throws Exception {

        String sql = "SELECT * FROM users WHERE username=? AND password=?";
        PreparedStatement ps = connection.prepareStatement(sql);

        System.out.print("Enter username: ");
        String username = scanner.next();

        System.out.print("Enter password: ");
        String password = scanner.next();

        ps.setString(1, username);
        ps.setString(2, password);

        ResultSet rs = ps.executeQuery();

        if (rs.next())
            System.out.println("User authenticated");
        else
            System.out.println("Authentication failed");
    }
}
