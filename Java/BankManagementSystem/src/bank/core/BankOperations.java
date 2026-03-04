package bank.core;

import bank.exception.InsufficientFundsException;

public interface BankOperations {
	
	public void deposit(double amount);
	
	public void withdraw(double amount) throws InsufficientFundsException;
}
