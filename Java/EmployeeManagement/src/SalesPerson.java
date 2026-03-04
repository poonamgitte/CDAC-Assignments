
public class SalesPerson extends Employee {
	
	private double commission;

	// Salesman constructor
	public SalesPerson(String name, String address, int age, boolean gender, double basicSal, double commission) {
		super(name, address, age, gender, basicSal);
		this.commission = commission;
	}
	
	//getter and setter methods
	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	public void display() {
		super.display();
		System.out.println("Commission:"+commission);
	}
	
	//Overridden method
	@Override
	public double computeSalary() {
		return basicSal+commission;
	}
}
