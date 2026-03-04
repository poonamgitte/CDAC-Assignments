package bank.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

import bank.core.BankAccount;
import bank.exception.FileIOException;

public class IOUtils {

	//Serialization
	
	public static <T extends Serializable> void saveAccount(List<T>accountList,String filename) {
		
		try (ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream(filename))) {
			if(accountList.isEmpty()) {
				System.out.println("List is empty");
				return;
			}
			
			objOut.writeObject(accountList);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	//Deserialization
	
	@SuppressWarnings("unchecked")
	public static <T> List<T> loadAccount(String filename) throws FileNotFoundException, IOException{
		
		List<T> loadAccountList;
		try (ObjectInputStream objIn = new ObjectInputStream(new FileInputStream(filename))) {
			if(filename == null) {
				throw new FileIOException(filename);
			}
			
			loadAccountList = (List<T>)objIn.readObject();
			
			return loadAccountList;
		} catch (FileIOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
