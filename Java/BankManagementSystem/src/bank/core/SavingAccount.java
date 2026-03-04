package bank.core;

import java.io.Serializable;
import java.time.LocalDate;

public class SavingAccount extends BankAccount implements Serializable {
	
	private double interestRate;

	//Constructor
	public SavingAccount(int accoutNo, String customerName, double balance, AccountType enum1, LocalDate openDate,
			double interestRate) {
		super(accoutNo, customerName, balance, enum1, openDate);
		this.interestRate = interestRate;
	}
	
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	//Overridden abstract method
	@Override
	public double computeInterest() {
		
		return balance * interestRate/100;
	}

	@Override
	public String toString() {
		return "SavingAccount [interestRate=" + interestRate + ", accoutNo=" + accoutNo + ", customerName="
				+ customerName + ", balance=" + balance + ", Enum=" + type + ", openDate=" + openDate + "]";
	}
	
	
	
}
