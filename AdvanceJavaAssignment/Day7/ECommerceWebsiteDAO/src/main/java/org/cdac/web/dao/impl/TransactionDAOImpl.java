package org.cdac.web.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.cdac.web.dao.TransactionDAO;
import org.cdac.web.util.DBUtil;

package cdac.org.ecommerce.dao.impl;

import cdac.org.ecommerce.dao.TransactionDAO;
import cdac.org.ecommerce.model.Transaction;
import cdac.org.ecommerce.util.DBUtil;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TransactionDAOImpl implements TransactionDAO {

    @Override
    public boolean addTransaction(Transaction transaction) {
        String sql = "INSERT INTO Transaction(userId, productId, amount, transactionDate) VALUES (?,?,?,?)";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, transaction.getUserId());
            ps.setInt(2, transaction.getProductId());
            ps.setDouble(3, transaction.getAmount());
            ps.setTimestamp(4, new Timestamp(transaction.getTransactionDate().getTime()));
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Transaction> getTransactionsByUser(int userId) {
        List<Transaction> list = new ArrayList<>();
        String sql = "SELECT * FROM Transaction WHERE userId=?";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, userId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Transaction t = new Transaction();
                t.setTransactionId(rs.getInt("transactionId"));
                t.setUserId(rs.getInt("userId"));
                t.setProductId(rs.getInt("productId"));
                t.setAmount(rs.getDouble("amount"));
                t.setTransactionDate(rs.getTimestamp("transactionDate"));
                list.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
