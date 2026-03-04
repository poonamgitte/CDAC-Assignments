
public  class Manager extends Employee {


	private double hra;

	public Manager(String name, String address, int age, boolean gender, double basicSal, double hra) {
		super(name, address, age, gender, basicSal);
		this.hra = hra;
	}
	
	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}
	
	@Override
	public String toString() {
		//super.toString();
		return super.toString()+"\nHRA:"+hra;
	}
	
//	public void display() {
//		super.display();
//		System.out.println("HRA:"+hra);
//	}
	@Override
	public double computeSalary() {
		return basicSal+hra;
	}
}
