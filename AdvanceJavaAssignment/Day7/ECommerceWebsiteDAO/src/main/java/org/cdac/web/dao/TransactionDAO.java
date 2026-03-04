package org.cdac.web.dao;



import java.util.List;

import org.cdac.web.model.Transaction;

public interface TransactionDAO {
    boolean addTransaction(Transaction transaction);
    List<Transaction> getTransactionsByUser(int userId);
}
