package org.cdac.web.dao;

import java.util.List;

import org.cdac.web.model.CreditCard;

public interface CreditCardDAO {
    boolean addCreditCard(CreditCard card);
    List<CreditCard> getCardsByUser(int userId);
}
