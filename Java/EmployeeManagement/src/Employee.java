public abstract class Employee {
	
	
	protected String name;
	
	protected String address;
	
	protected int age;
	
	protected boolean gender;
	
	protected double basicSal;
	
	// Employee constructor
	public Employee(String name, String address, int age, boolean gender, double basicSal) {
		//super();
		this.name = name;
		this.address = address;
		this.age = age;
		this.gender = gender;
		this.basicSal = basicSal;
	}

	//Setter and getter methods
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
	
	public  void display() {
		String genderStr = gender ? "Male" : "Female";
		System.out.println("Name:"+name+"\nAddress:"+address+"\nAge:"+age+"\nGender:"+genderStr+"\nBasicSalary:"+basicSal);
	}
	
	// abstract method
	public abstract double computeSalary();
	
}
