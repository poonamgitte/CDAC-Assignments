package org.cdac.web.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/Product")
public class ProductServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private ProductDAO productDAO = new ProductDAOImpl();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String categoryIdParam = request.getParameter("catId");
        if (categoryIdParam != null) {
            int categoryId = Integer.parseInt(categoryIdParam);
            List<Product> products = productDAO.getProductsByCategory(categoryId);
            request.setAttribute("products", products);
        }
        request.getRequestDispatcher("products.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if ("delete".equals(action)) {
            int productId = Integer.parseInt(request.getParameter("productId"));
            productDAO.deleteProduct(productId);
        }
        doGet(request, response);
    }
}
