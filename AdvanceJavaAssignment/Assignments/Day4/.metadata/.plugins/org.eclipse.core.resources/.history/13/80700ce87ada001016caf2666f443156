package org.shivam.web;

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
import org.cdac.db.DBconnection;


@WebServlet("/Authentification")
public class Authentification extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
          
            try (Connection connection = DBconnection.getConnection();) {

                String username = request.getParameter("username");
                String password = request.getParameter("password");

                PreparedStatement psd = connection.prepareStatement(
                        "SELECT * FROM user_table WHERE username = ? AND password = ?");
                psd.setString(1, username);
                psd.setString(2, password);

                ResultSet resultSet = psd.executeQuery();

                if (resultSet.next()) {
                    String role = resultSet.getString("role");
                    if ("admin".equalsIgnoreCase(role)) {
                        response.sendRedirect(request.getContextPath() + "/WelcomeAdmin.jsp");
                    } else {
                        response.sendRedirect(request.getContextPath() + "/category/Category?username=" + username + "&role=" + role);
                    }
                } else {
                    response.setContentType("text/html");
                    PrintWriter out = response.getWriter();
                    out.println("<html><body>");
                    out.println("<h3>User not authenticated!</h3>");
                    out.println("<a href='login.jsp'>Try Again</a>");
                    out.println("</body></html>");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new ServletException("Authentication error", e);
        }
    }
}