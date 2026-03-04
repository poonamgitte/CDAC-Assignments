// Serializable class

import java.io.Serializable;

public class Student implements Serializable{
	String name;
	int age;
	
	public Student(String n, int a) {
		this.name = n;
		this.age = a;
	}
}
