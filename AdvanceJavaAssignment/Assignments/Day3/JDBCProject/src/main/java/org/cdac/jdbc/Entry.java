package org.cdac.jdbc;

import java.sql.Connection;
import java.util.Scanner;

public class Entry {

	public static void main(String[] args) {
        try (
            Scanner scanner = new Scanner(System.in);
            Connection connection = DBUtil.getConnection();
        ) {

            StoredProcedureDemo.getRecordCount(connection);
            FunctionDemo.getPenalty(connection, scanner);
            PreparedStatementDemo.authenticateUser(connection, scanner);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
