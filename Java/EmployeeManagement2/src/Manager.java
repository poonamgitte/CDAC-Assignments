
public class Manager extends Employee {
	private double hra;

	//Constructor
	public Manager(String name, String address, int age, boolean gender, double basicSal, double hra) {
		super(name, address, age, gender, basicSal);
		this.hra = hra;
	}

	//Setter and getter
	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}
	
	//Overridden method
	public String toString() {
		return super.toString()+"\nHRA:"+hra;
	}
	
}
