
public  class Manager extends Employee {


	private double hra;

	// Manager constructor
	public Manager(String name, String address, int age, boolean gender, double basicSal, double hra) {
		super(name, address, age, gender, basicSal);
		this.hra = hra;
	}
	
	// Getter and setter methods
	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}
	
	public void display() {
		super.display();
		System.out.println("HRA:"+hra);
	}
	
	// Overridden method
	@Override
	public double computeSalary() {
		return basicSal+hra;
	}
}
