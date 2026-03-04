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

@WebServlet("/ShowCategory")
public class ShowCategory extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Connection connection = null;
		PreparedStatement psCategory = null;
		ResultSet resultCategory = null;
		PrintWriter out = response.getWriter();

		String username = request.getParameter("username");
		String role = request.getParameter("role");

		try {
			connection = DbConnection.getConnection();
			psCategory = connection.prepareStatement("select * from category");
			resultCategory = psCategory.executeQuery();

			out.print("<html>");
			out.print("<body>");

			out.print("<p>" + username + " " + role + "</p>");
			out.print("<table border='1'>");
			out.print("<tr>");

			out.print("<th>Category Id</th>");
			out.print("<th>Category Name</th>");
			out.print("<th>Category Description</th>");
			out.print("<th>Category Image</th>");
			out.print("</tr>");

			while (resultCategory.next()) {

				out.print("<tr>");
				out.print("<td>" + resultCategory.getInt("categoryId") + "</td>");
				out.print("<td>" + resultCategory.getString("categoryName") + "</td>");
				out.print("<td>" + resultCategory.getString("categoryDescription") + "</td>");
				out.print("<td> <img src='/WebProjectDay4/images/category/" + resultCategory.getString("categoryImage")
						+ "'></td>");

				if (role.equals("admin")) {
					out.print("<td><a href='/WebProjectDay4/DeleteCategory?username=" + username + "&role=" + role
							+ "&id=" + resultCategory.getInt("categoryId") + "'>Delete</a></td>");
				}
				out.print("<td>" + "<a href='/WebProjectDay4/ShowProduct?username=" + username + "&role=" + role
						+ "&catId= " + resultCategory.getInt("categoryId") + "''>Open</a></td>");
				out.print("</tr>");

			}

			out.print("</table>");
			out.print("</body>");
			out.print("</html>");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
