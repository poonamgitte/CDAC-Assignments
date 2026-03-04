// Serialization and deserialization

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDeserialization {
	public static void main(String[] args) {
		
		Student s1 = new Student("Poonam", 22);
		
		
		// Serialization
		try {
			FileOutputStream fileOut = new FileOutputStream("C:\\Users\\dahip\\OneDrive\\Desktop\\CDAC\\Java\\Student.ser");
			
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			
			out.writeObject(s1);
			
			System.out.println("Object Serialized and stored in file");
			
			out.close();
			fileOut.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Deserialization
		
		try {
			FileInputStream fileIn = new FileInputStream("C:\\Users\\dahip\\OneDrive\\Desktop\\CDAC\\Java\\Student.ser");
			
			ObjectInputStream in = new ObjectInputStream(fileIn);
			
			Student s2 = (Student)in.readObject();
			
			in.close();
			fileIn.close();
			
			System.out.println("Object deserialized");
			System.out.println("Name:"+s2.name);
			System.out.println("Age:"+s2.age);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
