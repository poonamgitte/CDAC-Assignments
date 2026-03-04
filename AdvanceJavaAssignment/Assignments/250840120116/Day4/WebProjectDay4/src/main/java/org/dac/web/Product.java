package org.dac.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



@WebServlet("/Product")
@MultipartConfig
public class Product extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Product() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter printWriter = null;
		ResultSet resultSet = null;
		try {
			    Class.forName("com.mysql.cj.jdbc.Driver");
			    printWriter = response.getWriter();
			
				try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/users", "root", "cdac")) {
					
					String productName = request.getParameter("productName");
					String productDescription = request.getParameter("productDescription");
					String productPrice = request.getParameter("productPrice");
					
					//to store file name in the mysql server
					Part filePart = request.getPart("file"); 
			        String productImage = filePart.getSubmittedFileName();
			        
			        String categoryId = request.getParameter("category");
			        
			        
			        //to store actual image image in the images/category
			        String uploadDir = "C:/Users/dac/Documents/ADV JAVA/BATCH_1/WebProjectDay4/src/main/webapp/images/product/";
			        new File(uploadDir).mkdirs(); 
			        String filePath = uploadDir + productImage;
			        filePart.write(filePath);
			       
			        
			        
			        try(PreparedStatement psd = connection.prepareStatement("insert into product(categoryId,productName,productDescription,productPrice,productImage) value (?,? , ? , ? , ? )")){
			        	psd.setInt(1,Integer.parseInt(categoryId));
			        	psd.setString(2, productName);
						psd.setString(3, productDescription);
						psd.setFloat(4, Float.parseFloat(productPrice));
						psd.setString(5, productImage);
					
						psd.execute();
						
						printWriter.println(" "+productName+" "+productDescription+" "+productPrice+" "+categoryId);
						printWriter.println("Product added successfully");
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
