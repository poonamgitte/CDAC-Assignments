package org.cdac.web.controller;




import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

import org.cdac.web.model.Product;


@WebServlet("/Checkout")
public class CheckoutServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        List<Product> cart = (List<Product>) session.getAttribute("cart");

        double totalAmount = 0;
        if(cart != null) {
            for(Product p : cart) {
                totalAmount += p.getProductPrice();
            }
        }

        request.setAttribute("totalAmount", totalAmount);
        request.getRequestDispatcher("payment.jsp").forward(request, response);
    }
}
