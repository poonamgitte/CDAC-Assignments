
public class Engineer extends Employee {

	private double overTime;

	public double getOverTime() {
		return overTime;
	}

	public void setOverTime(double overTime) {
		this.overTime = overTime;
	}

	public Engineer(String name, String address, int age, boolean gender, double basicSal, double overTime) {
		super(name, address, age, gender, basicSal);
		this.overTime = overTime;
		
	}
//	public void display() {
//		super.display();
//		System.out.println("OverTime:"+overTime);
//	}
	
	@Override
	public String toString() {
		
		return super.toString()+ "\nOverTime:"+overTime;
	}
	
	@Override
	public double computeSalary() {
		return basicSal+overTime;
	}
	
	
}
