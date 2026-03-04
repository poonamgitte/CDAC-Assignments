package org.dac.web;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.web.dao.CategoryDao;
import org.web.implement.CategoryImplement;

@WebServlet("/Category")
@MultipartConfig
public class CategoryServlet extends HttpServlet {
	
	
	CategoryDao categoryDao;


	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		
		ServletContext application=getServletContext();
		
		Connection connection = DbConnection.getConnection();
		
		categoryDao = new CategoryImplement(connection);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter printWriter = null;
		ResultSet resultSet = null;
		try {
			    Class.forName("com.mysql.cj.jdbc.Driver");
			    printWriter = response.getWriter();
			
				try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/users", "root", "cdac")) {
					
					String categoryName = request.getParameter("catName");
					String categoryDesc = request.getParameter("catDesc");
					Part filePart = request.getPart("file"); 
			        String categoryImg = filePart.getSubmittedFileName();
			        
			 
			        
			        String uploadDir = "C:/Users/dac/Documents/ADV JAVA/BATCH_1/WebProjectDay4/src/main/webapp/images/category/";
			        new File(uploadDir).mkdirs(); 
			        String filePath = uploadDir + categoryImg;
			        filePart.write(filePath);

			        
			        
			        try(PreparedStatement psd = connection.prepareStatement("insert into category(categoryName,categoryDescription, categoryImage) value (? , ? , ? )")){
			        	psd.setString(1, categoryName);
						psd.setString(2, categoryDesc);
						psd.setString(3, categoryImg);
						psd.execute();
						
						printWriter.println("Successfully Submitted");
			        }
				
					
				} catch (SQLException e) {
					printWriter.println(e.getMessage());
					//e.printStackTrace();
				}
		} catch (ClassNotFoundException e) {
			   printWriter.println(e.getMessage());
				//e.printStackTrace();
		 }
	}

}
