package book.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Map;
import java.util.prefs.BackingStoreException;

import book.core.Book;

public class IOUtil {
	
	// Serialization of bookShop
	public static void save(Map<String, Book>bookShop) {
		
		try (ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("BookShop.ser"))) {
			objOut.writeObject(bookShop);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	//De-Serialization of bookShop
	
	@SuppressWarnings("unchecked")
	public static void load(Map<String,Book>bookShop) {
		
		
			try (ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("BookShop.ser"))) {
				
				Map<String,Book>loadList = (Map<String,Book>)objIn.readObject();
				
				bookShop.putAll(loadList);
				
			} catch (ClassNotFoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	//Serialization of user cart
	
	public static void saveCart(List<Book>cart) throws BackingStoreException {
		
		try (ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("UserCart.ser"))) {
			
			if(cart.isEmpty()) {
				throw new BackingStoreException("Cart is empty");
			}
			objOut.writeObject(cart);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//De-serialization of user cart
	
	public static void loadCart(List<Book>cart) {
		
		try (ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("UserCart.ser"))) {
			
			@SuppressWarnings("unchecked")
			List<Book>loadCart = (List<Book>)objIn.readObject();
			
			cart.addAll(loadCart);
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
