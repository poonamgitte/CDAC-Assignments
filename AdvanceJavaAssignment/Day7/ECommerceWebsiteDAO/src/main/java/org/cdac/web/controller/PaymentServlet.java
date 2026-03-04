package org.cdac.web.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.cdac.web.util.DBUtil;



@WebServlet("/Payment")
public class PaymentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        List<Product> cart = (List<Product>) session.getAttribute("cart");

        if(cart == null || cart.isEmpty()) {
            response.sendRedirect("cart.jsp");
            return;
        }

        String cardHolder = request.getParameter("cardHolder");
        String cardNumber = request.getParameter("cardNumber");
        String expiryMonth = request.getParameter("expiryMonth");
        String expiryYear = request.getParameter("expiryYear");
        String cvv = request.getParameter("cvv");
        double amount = Double.parseDouble(request.getParameter("amount"));

        try (Connection conn = DBUtil.getConnection()) {
            String insertTransaction = "INSERT INTO Transaction(userId, amount, cardNumber) VALUES(?,?,?)";
            try (PreparedStatement ps = conn.prepareStatement(insertTransaction)) {
                ps.setInt(1, 1); // TODO: Replace with actual logged-in userId
                ps.setDouble(2, amount);
                ps.setString(3, cardNumber);
                ps.executeUpdate();
            }

            session.removeAttribute("cart"); // Clear cart after payment
            response.sendRedirect("success.jsp");

        } catch (SQLException e) {
            e.printStackTrace();
            response.getWriter().println("Payment failed: " + e.getMessage());
        }
    }
}
