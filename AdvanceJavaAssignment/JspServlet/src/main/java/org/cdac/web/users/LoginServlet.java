package org.cdac.web.users;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.SQLException;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	private UserImplement userImpl;
	
	public void init() throws ServletException {
		ServletContext ctx = getServletContext();
		this.userImpl = new UserImplement(ctx);
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 try {
			 String username = request.getParameter("username");
			 String password = request.getParameter("password");
			 Users user = userImpl.login(username,password);
			 
			 if(user != null) {
				    
				  HttpSession session = request.getSession(true);
				  session.setAttribute("currentUser", user);
				  
				  if("admin".equals(user.getRole())) {
					     response.sendRedirect("admin/dashboard.jsp");
				  }else {
					    response.sendRedirect("user/Welcome.jsp");
				  }
			 }else {
				  request.setAttribute("error", "Invalid username or password.");
				  request.getRequestDispatcher("login.jsp").forward(request, response);
			 }
			 
		} catch (SQLException e) {
			e.printStackTrace();
			
			 request.setAttribute("error", "A server error");
			 request.getRequestDispatcher("error.jsp").forward(request, response);

		}
	}
}
