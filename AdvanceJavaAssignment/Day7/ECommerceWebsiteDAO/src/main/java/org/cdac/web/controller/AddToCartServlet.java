package org.cdac.web.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.cdac.web.dao.impl.ProductDAOImpl;
import org.cdac.web.model.Product;


@WebServlet("/AddToCart")
public class AddToCartServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        List<Product> cart = (List<Product>) session.getAttribute("cart");
        if(cart == null) {
            cart = new ArrayList<>();
        }

        String action = request.getParameter("action");
        int productId = Integer.parseInt(request.getParameter("productId"));

        ProductDAO productDAO = new ProductDAOImpl();
        Product product = productDAO.getProductById(productId);

        if("add".equals(action) && product != null) {
            cart.add(product);
        } else if("remove".equals(action)) {
            cart.removeIf(p -> p.getProductId() == productId);
        }

        session.setAttribute("cart", cart);
        response.sendRedirect("cart.jsp");
    }
}
