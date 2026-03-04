package org.cdac.web;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class CategoryServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private Connection connection;
    private PreparedStatement psCategory;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        try {
            ServletContext ctx = getServletContext();

            String dbUrl = ctx.getInitParameter("dbUrl");
            String dbUser = ctx.getInitParameter("dbUserName");
            String dbPassword = ctx.getInitParameter("dbPassword");
            String driverClass = ctx.getInitParameter("driverClass");

            Class.forName(driverClass);
            connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);

            psCategory = connection.prepareStatement("SELECT * FROM category");

        } catch (Exception e) {
            throw new ServletException("Category Init Failed", e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ResultSet rs = null;
        PrintWriter out = response.getWriter();
        String userName = request.getParameter("userName");

        out.println("<html><body>");
        out.println("Welcome <b>" + userName + "</b><br/>");
        out.println("<table border='1'>");
        out.println("<tr><th>Name</th><th>Description</th></tr>");

        try {
            rs = psCategory.executeQuery();
            while (rs.next()) {
                out.println("<tr>");
                out.println("<td>" + rs.getString("categoryName") + "</td>");
                out.println("<td>" + rs.getString("categoryDescription") + "</td>");
                out.println("</tr>");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try { if (rs != null) rs.close(); } catch (SQLException e) {}
        }

        out.println("</table></body></html>");
    }

    @Override
    public void destroy() {
        try {
            if (psCategory != null) psCategory.close();
            if (connection != null) connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
