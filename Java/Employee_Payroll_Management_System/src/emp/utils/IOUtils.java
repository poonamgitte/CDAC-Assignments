package emp.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import emp.core.Employee;
import emp.exception.EmployeeHandlingException;

public class IOUtils {

	public static void save(List<Employee>list) throws EmployeeHandlingException {
		try (ObjectOutputStream objOutStream = new ObjectOutputStream(new FileOutputStream("save.txt"))) {
			
			if(list.isEmpty()) {
				throw new EmployeeHandlingException("List is Empty ");
			}

			
			objOutStream.writeObject(list);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void load(List<Employee>list) throws EmployeeHandlingException {
		
		try (ObjectInputStream objInStream = new ObjectInputStream(new FileInputStream("save.txt"))) {
			
		
			@SuppressWarnings("unchecked")
			List<Employee>loadList = (List<Employee>)objInStream.readObject();
			
			list.addAll(loadList);
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
