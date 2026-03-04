import java.io.Serializable;

public abstract class Employee implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6773750204497154762L;

	protected String name;
	
	protected String address;
	
	protected int age;
	
	protected boolean gender;
	
	protected double basicSal;
	
	public Employee(String name, String address, int age, boolean gender, double basicSal) {
		//super();
		this.name = name;
		this.address = address;
		this.age = age;
		this.gender = gender;
		this.basicSal = basicSal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public double getBasicSal() {
		return basicSal;
	}

	public void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}
	

//	public  void display() {
//		String genderStr = gender ? "Male" : "Female";
//		System.out.println("Name:"+name+"\nAddress:"+address+"\nAge:"+age+"\nGender:"+genderStr+"\nBasicSalary:"+basicSal);
//	}
	
	// Display using toString and String buffer
	
	@Override
	public String toString() {
		StringBuffer tempBuffer = new StringBuffer("Name:"+name+"\nAddress:"+address+"\nAge:"+age+"\nGender:"+(gender ? "Male" : "Female")+"\nBasicSalary:"+basicSal);
		
		return tempBuffer.toString();
	}

	public abstract double computeSalary();

//	@Override
//	public int compareTo(Employee o) {
//		// TODO Auto-generated method stub
//		return this.getName().compareTo(o.getName());
//	}
	
	
	
}
