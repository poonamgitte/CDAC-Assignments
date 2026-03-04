package org.cdac.web.dao.impl;

import org.cdac.web.dao.CreditCardDAO;
import org.cdac.web.model.CreditCard;
import org.cdac.web.util.DBUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CreditCardDAOImpl implements CreditCardDAO {

    @Override
    public boolean addCreditCard(CreditCard card) {
        String sql = "INSERT INTO CreditCard(userId, cardNumber, cardHolder, expiryMonth, expiryYear, cvv) VALUES (?,?,?,?,?,?)";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, card.getUserId());
            ps.setString(2, card.getCardNumber());
            ps.setString(3, card.getCardHolder());
            ps.setInt(4, card.getExpiryMonth());
            ps.setInt(5, card.getExpiryYear());
            ps.setString(6, card.getCvv());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<CreditCard> getCardsByUser(int userId) {
        List<CreditCard> list = new ArrayList<>();
        String sql = "SELECT * FROM CreditCard WHERE userId=?";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, userId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                CreditCard card = new CreditCard();
                card.setCardId(rs.getInt("cardId"));
                card.setUserId(rs.getInt("userId"));
                card.setCardNumber(rs.getString("cardNumber"));
                card.setCardHolder(rs.getString("cardHolder"));
                card.setExpiryMonth(rs.getInt("expiryMonth"));
                card.setExpiryYear(rs.getInt("expiryYear"));
                card.setCvv(rs.getString("cvv"));
                list.add(card);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

	
}
