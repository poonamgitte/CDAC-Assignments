package org.cdac.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Scanner;

public class FunctionDemo {

	public static void getPenalty(Connection connection, Scanner scanner) throws Exception {

        System.out.print("Enter card number: ");
        int cardNo = scanner.nextInt();

        CallableStatement cs = connection.prepareCall("SELECT GetPenalty(?)");
        cs.setInt(1, cardNo);

        ResultSet rs = cs.executeQuery();
        if (rs.next()) {
            System.out.println("Penalty: " + rs.getFloat(1));
        }
    }
}
