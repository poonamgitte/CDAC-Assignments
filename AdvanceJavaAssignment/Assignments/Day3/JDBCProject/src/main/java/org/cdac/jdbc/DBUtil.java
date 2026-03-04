package org.cdac.jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBUtil {
	public static Connection getConnection() throws Exception {
        Properties props = new Properties();
        props.load(new FileInputStream("DB.properties"));

        String url = props.getProperty("db.url");
        String user = props.getProperty("db.username");
        String pass = props.getProperty("db.password");

        return DriverManager.getConnection(url, user, pass);
    }
}
