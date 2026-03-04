
public class Salesman extends Employee {

	private double commission;
	
	//Constructor
	public Salesman(String name, String address, int age, boolean gender, double basicSal, double commission) {
		super(name, address, age, gender, basicSal);
		this.commission = commission;
	}

	// getter and setter
	public double getCommossion() {
		return commission;
	}

	public void setCommossion(double commission) {
		this.commission = commission;
	}
	
	//Overridden method
	public String toString() {
		return super.toString()+"\nCommission:"+commission;
	}
		
	
}
