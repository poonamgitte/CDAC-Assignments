package cdac.org.ecommerce;

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

@WebServlet("/Authenticate")
public class Authenticate extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	
//		System.out.println("doGet fired.....");
//		doPost(request,response);
//		
//	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch2_java","root","cdac");
			
			PreparedStatement psAuthenticate=connection.prepareStatement("Select * from users where user_name = ? and password = ?");
			
//			PreparedStatement psGetRole=connection.prepareStatement("Select role from users where user_name = ? and password = ?");
			
			System.out.println("doPost fired.....");
			PrintWriter out = response.getWriter();
			
			String userName = request.getParameter("userName");
			String password = request.getParameter("password");
			
			
			psAuthenticate.setString(1,userName);
			psAuthenticate.setString(2,password);
			
			ResultSet resultAuthenticate = psAuthenticate.executeQuery();
			
//			ResultSet role = psGetRole.executeQuery();
			
//			System.out.println(role);
			
			if(resultAuthenticate.next()) {
				System.out.println("Authentication successful ");
				
				if(resultAuthenticate.getString("role").equals("admin")) {
					response.sendRedirect("admin/welcome.html");
				}
				else {
					response.sendRedirect("Category?userName="+userName);
				}
			}
			else {
				out.println("Authentication failed ");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
	}

}
