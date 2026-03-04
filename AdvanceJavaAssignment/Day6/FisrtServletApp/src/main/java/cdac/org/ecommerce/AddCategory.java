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


@WebServlet("/AddCategory")
public class AddCategory extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		//PrintWriter out = response.getWriter();
//		//out.println("Category added");
//	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch2_java","root","cdac");
			
			PreparedStatement psAddCategory = connection.prepareStatement("Insert into category(CategoryName, Description, Image) values (?,?,?)");
			
			PrintWriter out = response.getWriter();
			
			String CategoryName = request.getParameter("categoryName");
			String Description = request.getParameter("description");
			String Image = request.getParameter("image");
			
			psAddCategory.setString(1, CategoryName);
			psAddCategory.setString(2,Description);
			psAddCategory.setString(3, Image);
			
			
			int resultAddCatgory = psAddCategory.executeUpdate();
			
			if(resultAddCatgory != 0) {
				out.println("Category added");
				response.encodeRedirectURL("admin/welcome.html");
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//doGet(request, response);
	}

}
