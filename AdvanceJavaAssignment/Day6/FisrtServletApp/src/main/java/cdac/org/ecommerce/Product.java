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

@WebServlet("/Product")
public class Product extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Connection connection = null;
        PreparedStatement psProduct = null;
        ResultSet resultProduct = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/batch2_java", "root", "cdac");

            int categoryId = Integer.parseInt(request.getParameter("catId"));

            psProduct = connection.prepareStatement(
                    "SELECT * FROM Product WHERE CategoryID = ?");
            psProduct.setInt(1, categoryId);

            resultProduct = psProduct.executeQuery();

            PrintWriter out = response.getWriter();

            out.println("<html>");
            out.println("<body>");
            out.println("<h3>Product List</h3>");

            out.println("<table border='1'>");
            out.println("<tr>");
            out.println("<th>Product Name</th>");
            out.println("<th>Description</th>");
            out.println("<th>Image</th>");
            out.println("<th>Action</th>");
            out.println("</tr>");

            while (resultProduct.next()) {

                int productId = resultProduct.getInt("ProductID");

                out.println("<tr>");
                out.println("<td>" + resultProduct.getString("ProductName") + "</td>");
                out.println("<td>" + resultProduct.getString("ProductDescription") + "</td>");

                out.println("<td>"
                        + "<img src='/FisrtServletApp/Images/"
                        + resultProduct.getString("ProductImage")
                        + "' height='60' width='60'/>"
                        + "</td>");

                out.println("<td>"
                        + "<a href='DeleteProduct?productId=" + productId + "'>Delete</a>"
                        + "</td>");

                out.println("</tr>");
            }

            out.println("</table>");
            out.println("</body>");
            out.println("</html>");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
