
public class SalesPerson extends Employee {
	
	private double commission;

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	public SalesPerson(String name, String address, int age, boolean gender, double basicSal, double commission) {
		super(name, address, age, gender, basicSal);
		this.commission = commission;
	}
//	public void display() {
//		super.display();
//		System.out.println("Commission:"+commission);
//	}
	
	@Override
	public String toString() {
		return super.toString()+"\nCommission:"+commission;
	}
	
	@Override
	public double computeSalary() {
		return basicSal+commission;
	}
}
