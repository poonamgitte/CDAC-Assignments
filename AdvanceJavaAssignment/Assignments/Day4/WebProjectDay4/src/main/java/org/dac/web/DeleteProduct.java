package org.dac.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Servlet implementation class DeleteProduct
 */
@WebServlet("/DeleteProduct")
public class DeleteProduct extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String productId = request.getParameter("id");
		String username = request.getParameter("username");
		String role = request.getParameter("role");
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			ResultSet resultSet = null;
			try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/users", "root", "cdac")) {


				if(role.equals("admin")) {
					PreparedStatement psd = connection.prepareStatement("delete from product where productId = ?");
					psd.setString(1, productId);


					resultSet = psd.executeQuery();
					
					if(resultSet.next()) {
						   out.print("Deleted Succesfully !");
					}else {
						 out.print("Failed to Delete !");
					}
				}else {
					  out.print("Not Authorized !");
				}
				

			} catch (SQLException e) {
				e.printStackTrace();
			}
	
		 } catch (ClassNotFoundException e) {
				e.printStackTrace();
		 }
	}

}
