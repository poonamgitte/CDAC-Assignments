
public class Member {
	String name;
	int age;
	String phoneNo;
	String address;
	double salary;
	
	public Member(String name, int age, String phoneNo, String address, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.phoneNo = phoneNo;
		this.address = address;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void printSal() {
		System.out.println("Salary:"+salary);
	}
}
