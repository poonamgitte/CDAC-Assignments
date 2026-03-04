package org.dac.web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;

public class DbConnection extends HttpServlet {
	private static Connection connection;

	public void init() throws ServletException {
		super.init();
		ServletContext application = getServletContext();

		String dbUrl = (String) application.getAttribute("dbUrl");
		String connectorClass = (String) application.getAttribute("connectorClass");
		String dbUser = (String) application.getAttribute("dbUser");
		String dbPassword = (String) application.getAttribute("dbPassword");

		try {
			Class.forName(connectorClass);
			connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Error establishing db connection " + e.getMessage());
			throw new ServletException("Error establishing db connection ", e);
		}
	}

	public static Connection getConnection() {
		return connection;
	}

	@Override
	public void destroy() {
		// Close the connection and release resources
		if (connection != null) {
			try {
				connection.close();
				System.out.println("Database connection closed in destroy() method.");
			} catch (SQLException e) {
				System.err.println("Error closing database connection: " + e.getMessage());
			}
		}
		super.destroy();
	}

}
