package bank.core;

import java.io.Serializable;
import java.time.LocalDate;

import bank.exception.InsufficientFundsException;

public abstract class BankAccount implements Serializable,BankOperations {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected int accoutNo;
	protected String customerName;
	protected double balance;
	protected AccountType type;
	protected LocalDate openDate;
	
	//Constructor
	public BankAccount(int accoutNo, String customerName, double balance, AccountType enum1, LocalDate openDate) {
		super();
		this.accoutNo = accoutNo;
		this.customerName = customerName;
		this.balance = balance;
		type = enum1;
		this.openDate = openDate;
	}

	//setter getter methods

	public int getAccoutNo() {
		return accoutNo;
	}

	public void setAccoutNo(int accoutNo) {
		this.accoutNo = accoutNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public AccountType getEnum() {
		return type;
	}

	public void setEnum(AccountType enum1) {
		type = enum1;
	}

	public LocalDate getOpenDate() {
		return openDate;
	}

	public void setOpenDate(LocalDate openDate) {
		this.openDate = openDate;
	}

	// toString Override
	@Override
	public String toString() {
		return "BankAccount [accoutNo=" + accoutNo + ", customerName=" + customerName + ", balance=" + balance
				+ ", Enum=" + type + ", openDate=" + openDate + "]";
	}
	
	// Abstract method
	public abstract double computeInterest(); 
	
	// Overriding interface method
	
	@Override
	public void deposit(double amount) {
		
		setBalance(balance + amount);
	}
	
	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		
		if(amount > balance)
			throw new InsufficientFundsException("Insufficient amount to withdraw");
		setBalance(balance - amount);
	}
	
}
