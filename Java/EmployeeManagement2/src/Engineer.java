
public class Engineer extends Employee{
	private double overTime;

	//Constructor
	public Engineer(String name, String address, int age, boolean gender, double basicSal, double overTime) {
		super(name, address, age, gender, basicSal);
		this.overTime = overTime;
	}

	public double getOverTime() {
		return overTime;
	}

	public void setOverTime(double overTime) {
		this.overTime = overTime;
	}
	
	//Overridden method
	public String toString() {
		return super.toString()+"\nOver time:"+overTime;
	}
}
