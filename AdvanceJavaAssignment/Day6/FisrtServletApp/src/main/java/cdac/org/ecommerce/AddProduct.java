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

@WebServlet("/AddProduct")
public class AddProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch2_java","root","cdac");
			
			PreparedStatement psAddProduct = connection.prepareStatement(
					"Insert into Product(CategoryID,ProductName,ProductDescription,ProductPrice, productImage) values (?,?,?,?,?)");

			PreparedStatement psGetCategoryId = connection.prepareStatement(
				    "SELECT p.CategoryID FROM Product p INNER JOIN Category c ON p.CategoryID = c.CategoryID WHERE c.CategoryName = ?"
				);
					
			
			PrintWriter out = response.getWriter();
			
			String categoryName = request.getParameter("categoryName");
			String productName = request.getParameter("productName");
			String productDescription = request.getParameter("productDescription");
			String productImage = request.getParameter("productImage");
			String productPrice = request.getParameter("productPrice");
			
			
			psGetCategoryId.setString(1,categoryName);
			
			ResultSet categoryIdResult = psGetCategoryId.executeQuery();
			
		
			psAddProduct.setString(2,productName);
			psAddProduct.setString(3,productDescription);
			psAddProduct.setString(4,productPrice);
			psAddProduct.setString(5,productImage);
			
			
			if(categoryIdResult.next()) {
				int categoryId = categoryIdResult.getInt("CategoryID");
				
				psAddProduct.setInt(1,categoryId);
				
				int result = psAddProduct.executeUpdate();
				
				if(result != 0) {
					out.println("Product added");
					response.encodeRedirectURL("admin/welcome.html");
				}
				
//				out.println(categoryId);
			}
			else {
				out.println("Category not found");
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		psAddProduct.setString(1, CategoryName);
//		psAddProduct.setString(2,Description);
//		psAddProduct.setString(3, Image);
//		
		
//		int resultAddCatgory = psAddCategory.executeUpdate();
		
//		if(resultAddCatgory != 0) {
//			out.println("Category added");
//			response.encodeRedirectURL("admin/welcome.html");
//		}
		
		
		doGet(request, response);
	}

}
