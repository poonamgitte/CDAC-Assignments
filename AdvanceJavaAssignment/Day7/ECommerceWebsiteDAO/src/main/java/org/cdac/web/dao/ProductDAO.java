package org.cdac.web.dao;

import java.util.List;

import org.cdac.web.model.Product;

public interface ProductDAO {
    boolean addProduct(Product product);
    boolean updateProduct(Product product);
    boolean deleteProduct(int productId);
    Product getProductById(int productId);
    List<Product> getProductsByCategory(int categoryId);
    List<Product> getAllProducts();
}