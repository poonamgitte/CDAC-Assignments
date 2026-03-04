
package cdac.org.ecommerce;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@WebServlet("/DeleteProduct")
public class DeleteProduct extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/batch2_java", "root", "cdac");

            int productId = Integer.parseInt(request.getParameter("productId"));

            PreparedStatement ps = con.prepareStatement(
                    "DELETE FROM Product WHERE ProductID = ?");

            ps.setInt(1, productId);
            ps.executeUpdate();

            response.sendRedirect("Category");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
