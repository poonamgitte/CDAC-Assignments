
public class Student {
	String name;
	int rollNo;
	String phoneNo;
	String address;
	
	public Student(String name, int rollNo, String phoneNo, String address) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.phoneNo = phoneNo;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
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
	
	public void print() {
		System.out.println("Name:"+this.name+"\nRoll no:"+this.rollNo);
		System.out.println("Phone no:"+this.phoneNo+"\nAddress:"+this.address);
	}
	
	
	public static void main(String[] args) {
		Student s1 = new Student("Sam",10, "340222123","pune");
		
		Student s2 = new Student("John",20,"8899833387","Latur");
		
		s1.print();
		s2.print();
		
	}
}
