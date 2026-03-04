package cdac;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjectInputStream objectStream = null;
		try {
			objectStream = new ObjectInputStream(new FileInputStream("C:\\Users\\dac\\Documents\\Employee.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Employee objEmployee = null;
		
		
		try {
			while((objEmployee = (Employee)objectStream.readObject()) != null)
			{
				System.out.println(objEmployee.getAddress());
				System.out.println(objEmployee.getAge());
				System.out.println(objEmployee.getName());
				System.out.println(objEmployee.getGender());
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void write() {
		Employee objEmployee = new Employee();
		objEmployee.setName("Neeta");
		objEmployee.setAddress("pune");
		objEmployee.setAge(13);
		objEmployee.setGender(true);
		
		
		try (ObjectOutputStream objectStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\dac\\Documents\\Employee.txt"))) {
			objectStream.writeObject(objEmployee);
			
			Employee objEmployee1 = new Employee();
			
			objEmployee1.setName("rim");
			objEmployee1.setAddress("mumbai");
			objEmployee1.setAge(22);
			objEmployee1.setGender(true);
			
			objectStream.writeObject(objEmployee1);
			
			System.out.println("Object written");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
