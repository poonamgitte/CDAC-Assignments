package cdac.org.ecommerce;

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

@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
		
		try {
			// Driver loaded
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Database connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch2_java","root","cdac");
			
			// Prepared statement
			PreparedStatement psRegister = connection.prepareStatement("insert into users(user_name, password, name, email, city) values(?, ?, ?, ?,?);");
			
			PreparedStatement psAuthenticate=connection.prepareStatement("Select * from users where user_name = ? and password = ?");
			
			PrintWriter out = response.getWriter();
			
			String userName = request.getParameter("userName");
			String password = request.getParameter("password");
			String confirmedPassword = request.getParameter("confirmPassword");
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String city = request.getParameter("city");
			
			psRegister.setString(1, userName);
			psRegister.setString(2, password);
			psRegister.setString(3, name);
			psRegister.setString(4,email);
			psRegister.setString(5,city);
			
			psAuthenticate.setString(1,userName);
			psAuthenticate.setString(2,password);
			
			out.println("<html>");
			out.println("<body>");
			
			ResultSet resultAuthenticate = psAuthenticate.executeQuery();
			
			if(resultAuthenticate.next()) {
				out.println("User Already Exist");
				
				out.println("<p>Login here <a href=\"login.html\">"+"login</a></p>");
				
//				response.sendRedirect("Category?userName="+userName);
			}
			else {
//				out.println("Authentication failed ");
				
				if(!password.equals(confirmedPassword)) {
					
					out.println("password and confirmed password must be same"+
				"<a href='RegisterUser.html'>"+"go to register"+"</a>");
					
					
				}
				else {
					
					int registerResult = psRegister.executeUpdate();
					System.out.println(registerResult);
					response.sendRedirect("login.html");
				}
			}
			
			out.println("</body>");
			out.println("</html>");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
