package org.dac.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/ShowProduct")
public class ShowProducts extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Connection connection=null;
		PreparedStatement psProduct=null;
		ResultSet resultProduct=null;
		PrintWriter out = response.getWriter();
		String categoryId = request.getParameter("catId");
		String username = request.getParameter("username");
		String role = request.getParameter("role");
	
		
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DbConnection.getConnection();
			
			psProduct=connection.prepareStatement("select * from product where categoryId = ?");
			psProduct.setString(1, categoryId);
			resultProduct=psProduct.executeQuery();
			
			out.print("<html>");
			out.print("<body>");
			
			out.print("<p>" + username + " " + role + "</p>");
			out.print("<table border='1'>");
			out.print("<tr>");
			
			out.print("<th>Product Id</th>");
			out.print("<th>Product Name</th>");
			out.print("<th>Product Price</th>");
			out.print("<th>Product Description</th>");
			out.print("<th>Product Image</th>");
			out.print("</tr>");
			
			
			while(resultProduct.next()) {
				
				out.print("<tr>");
				out.print("<td>"+resultProduct.getInt("productId")+"</td>");
				out.print("<td>"+resultProduct.getString("productName")+"</td>");
				out.print("<td>"+resultProduct.getString("productPrice")+"</td>");
				out.print("<td>"+resultProduct.getString("productDescription")+"</td>");
				out.print("<td> <img src='/WebProjectDay4/images/product/"+resultProduct.getString("productImage")+"'></td>");
				if(role.equals("admin")) {
					   out.print("<td><a href='/WebProjectDay4/DeleteProduct?username="+username+"&role="+role+ "&id="+ resultProduct.getInt("categoryId") +"'>Delete</a></td>");
				}
				out.print("</tr>");
				
			}
			
			out.print("</table>");
			out.print("</body>");
			out.print("</html>");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	}
}
