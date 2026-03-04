package org.cdac.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

public class StoredProcedureDemo {

	public static void getRecordCount(Connection connection) throws Exception {

        CallableStatement cs = connection.prepareCall("CALL GetRecordCount()");

        boolean status = cs.execute();

        while (status) {
            ResultSet rs = cs.getResultSet();
            while (rs.next()) {
                System.out.println("Total Records: " + rs.getInt(1));
            }
            status = cs.getMoreResults();
        }
    }
}
