package bank.core;

public enum AccountType {
	SAVING(4.0), 
	CURRENT(0.0), 
	FIXED(6.5);

	
	private double InterestRate;

	//Constructor
	private AccountType(double interestRate) {
		InterestRate = interestRate;
	}

	//getter
	public double getInterestRate() {
		return InterestRate;
	}

	
	
}
