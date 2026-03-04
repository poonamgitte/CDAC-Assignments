package org.cdac.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Date;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/AnnotationGetTime")
public class AnnotationGetTime extends HttpServlet{

		
		protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
			
			PrintWriter out = res.getWriter();
			out.println("<h1>"+ new Date()+"</h1>");
			
		}
}
