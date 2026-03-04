package org.cdac.web.dao.impl;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.cdac.web.dao.ProductDAO;
import org.cdac.web.model.Product;
import org.cdac.web.util.DBUtil;

public class ProductDAOImpl implements ProductDAO {

    @Override
    public boolean addProduct(Product product) {
        String sql = "INSERT INTO Product(CategoryID, ProductName, ProductDescription, ProductPrice, ProductImage) VALUES (?,?,?,?,?)";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, product.getCategoryId());
            ps.setString(2, product.getProductName());
            ps.setString(3, product.getProductDescription());
            ps.setDouble(4, product.getProductPrice());
            ps.setString(5, product.getProductImage());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean updateProduct(Product product) {
        String sql = "UPDATE Product SET CategoryID=?, ProductName=?, ProductDescription=?, ProductPrice=?, ProductImage=? WHERE ProductID=?";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, product.getCategoryId());
            ps.setString(2, product.getProductName());
            ps.setString(3, product.getProductDescription());
            ps.setDouble(4, product.getProductPrice());
            ps.setString(5, product.getProductImage());
            ps.setInt(6, product.getProductId());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteProduct(int productId) {
        String sql = "DELETE FROM Product WHERE ProductID=?";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, productId);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Product getProductById(int productId) {
        String sql = "SELECT * FROM Product WHERE ProductID=?";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, productId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Product p = new Product();
                p.setProductId(rs.getInt("ProductID"));
                p.setCategoryId(rs.getInt("CategoryID"));
                p.setProductName(rs.getString("ProductName"));
                p.setProductDescription(rs.getString("ProductDescription"));
                p.setProductPrice(rs.getDouble("ProductPrice"));
                p.setProductImage(rs.getString("ProductImage"));
                return p;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Product> getProductsByCategory(int categoryId) {
        List<Product> list = new ArrayList<>();
        String sql = "SELECT * FROM Product WHERE CategoryID=?";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, categoryId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setProductId(rs.getInt("ProductID"));
                p.setCategoryId(rs.getInt("CategoryID"));
                p.setProductName(rs.getString("ProductName"));
                p.setProductDescription(rs.getString("ProductDescription"));
                p.setProductPrice(rs.getDouble("ProductPrice"));
                p.setProductImage(rs.getString("ProductImage"));
                list.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<Product> getAllProducts() {
        List<Product> list = new ArrayList<>();
        String sql = "SELECT * FROM Product";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Product p = new Product();
                p.setProductId(rs.getInt("ProductID"));
                p.setCategoryId(rs.getInt("CategoryID"));
                p.setProductName(rs.getString("ProductName"));
                p.setProductDescription(rs.getString("ProductDescription"));
                p.setProductPrice(rs.getDouble("ProductPrice"));
                p.setProductImage(rs.getString("ProductImage"));
                list.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
