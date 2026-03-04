package org.cdac.web.filters;

import java.io.IOException;

import org.cdac.web.users.Users;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebFilter("/admin/*") 
public class AdminFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		
		HttpSession session = httpRequest.getSession(false);
		
		Users user = null;
		if (session != null) {
		    user = (Users)session.getAttribute("currentUser");
		}
		
		if (user == null) {
			System.out.println("Filter: User not logged in. Redirecting to login.");
			
			// Redirect to the login page
			httpResponse.sendRedirect(httpRequest.getContextPath() + "/login.jsp");
			return;
		}

  
		if (!"admin".equals(user.getRole())) {
		    System.out.println("Filter: User role access denied: " + user.getRole());
            request.setAttribute("error", "Access denied. Insufficient privileges.");
            request.getRequestDispatcher(httpRequest.getContextPath()+"/error.jsp").forward(request, response);
            return; 
		}

		System.out.println("Filter: User logged in and authorized. Proceeding.");
	    chain.doFilter(request, response);
	}
}