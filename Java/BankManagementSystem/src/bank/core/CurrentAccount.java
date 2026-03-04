package bank.core;

import java.io.Serializable;
import java.time.LocalDate;

public class CurrentAccount extends BankAccount implements Serializable {

	private double overdraftLimit;

	//Constructor
	public CurrentAccount(int accoutNo, String customerName, double balance, AccountType enum1, LocalDate openDate,
			double overdraftLimit) {
		super(accoutNo, customerName, balance, enum1, openDate);
		this.overdraftLimit = overdraftLimit;
	}

	//Setter getter methods
	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
	
	//override base method
	public double computeInterest() {
		return 0;
	}

	@Override
	public String toString() {
		return "CurrentAccount [overdraftLimit=" + overdraftLimit + ", accoutNo=" + accoutNo + ", customerName="
				+ customerName + ", balance=" + balance + ", Enum=" + type + ", openDate=" + openDate + "]";
	}
	
	
}
