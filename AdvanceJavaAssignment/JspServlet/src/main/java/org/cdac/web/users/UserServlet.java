package org.cdac.web.users;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;


@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserImplement userImpl;
	
	public void init() throws ServletException {
		ServletContext ctx = getServletContext();
		this.userImpl = new UserImplement(ctx);
	}
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String username = request.getParameter("username");
		 String password = request.getParameter("password");
		 String confPassword = request.getParameter("confirmPassword");
		 String name = request.getParameter("name");
		 String email = request.getParameter("email");
		 String city = request.getParameter("city");
		 
		 try {
			 //signUp Process
			Boolean status = userImpl.signUp(username, password,confPassword, name, email, city);
			if(status) {
				 response.sendRedirect("login.jsp"); 
			}else {
				 request.setAttribute("error", "Signup failed");
				 request.getRequestDispatcher("signup.jsp").forward(request, response);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();

			request.setAttribute("error", "A database error occured during signup");
			request.getRequestDispatcher("error.jsp").forward(request, response);
			 
		}
		 
	}

}
