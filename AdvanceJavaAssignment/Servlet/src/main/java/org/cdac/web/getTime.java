package org.cdac.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class getTime extends HttpServlet{
	
	public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException {
		
			PrintWriter out = res.getWriter();
			
			out.println("<h1>Time:"+ LocalDate.now()+"</h1>");
			
	}
	

}
