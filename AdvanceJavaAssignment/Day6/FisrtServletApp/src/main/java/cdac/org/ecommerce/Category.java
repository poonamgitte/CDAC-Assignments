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

@WebServlet("/Category")
public class Category extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Connection connection = null;
        PreparedStatement psCategory = null;
        ResultSet resultCategory = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/batch2_java", "root", "cdac");

            psCategory = connection.prepareStatement("SELECT * FROM Category");
            resultCategory = psCategory.executeQuery();

            PrintWriter out = response.getWriter();
            String userName = request.getParameter("userName");

            out.println("<html>");
            out.println("<body>");
            out.println("<h3>Welcome " + userName + "</h3>");

            out.println("<table border='1'>");
            out.println("<tr>");
            out.println("<th>Category Name</th>");
            out.println("<th>Description</th>");
            out.println("<th>Image</th>");
            out.println("<th>Action</th>");
            out.println("</tr>");

            while (resultCategory.next()) {

                int categoryId = resultCategory.getInt("CategoryID");

                out.println("<tr>");
                out.println("<td>"
                        + "<a href='Product?catId=" + categoryId + "'>"
                        + resultCategory.getString("CategoryName")
                        + "</a></td>");

                out.println("<td>" + resultCategory.getString("Description") + "</td>");

                out.println("<td>"
                        + "<img src='/FisrtServletApp/Images/"
                        + resultCategory.getString("Image")
                        + "' height='60' width='60'/>"
                        + "</td>");

                out.println("<td>"
                        + "<a href='DeleteCategory?catId=" + categoryId + "'>Delete</a>"
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

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
