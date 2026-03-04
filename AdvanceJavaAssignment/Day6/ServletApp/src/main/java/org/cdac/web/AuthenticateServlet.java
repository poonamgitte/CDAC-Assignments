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

public class AuthenticateServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private Connection connection;
    private PreparedStatement psAuthenticateUser;

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

            psAuthenticateUser = connection.prepareStatement(
                    "SELECT * FROM users WHERE username=? AND password=?"
            );

        } catch (Exception e) {
            throw new ServletException("Authentication Servlet Init Failed", e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ResultSet rs = null;
        try {
            PrintWriter out = response.getWriter();
            String userName = request.getParameter("userName");
            String password = request.getParameter("password");

            psAuthenticateUser.setString(1, userName);
            psAuthenticateUser.setString(2, password);

            rs = psAuthenticateUser.executeQuery();

            if (rs.next()) {
                response.sendRedirect("Category?userName=" + userName);
            } else {
                out.println("Authentication Failed");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try { if (rs != null) rs.close(); } catch (SQLException e) {}
        }
    }

    @Override
    public void destroy() {
        try {
            if (psAuthenticateUser != null) psAuthenticateUser.close();
            if (connection != null) connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
