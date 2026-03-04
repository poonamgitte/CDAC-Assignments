package book.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.prefs.BackingStoreException;

import book.core.Book;
import book.exception.BookHandlingException;
import book.util.CollectionUtils;
import book.util.IOUtil;

public class Entry {

	public static void main(String[] args) throws BookHandlingException, BackingStoreException {
		
		Map<String, Book>bookShop = CollectionUtils.populateBooks();
		
		List<Book>userCart = new ArrayList<>();
		
		IOUtil.loadCart(userCart);
		
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		
		do {
			System.out.println("1.display Shop books");
			System.out.println("2.Add book to cart");
			System.out.println("3.Display Cart Containt");
			System.out.println("4.Check Out");
			System.out.println("5.Exit");
			
			System.out.println("Enter choice:");
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:{
				if(bookShop.isEmpty()) {
					throw new BookHandlingException("No book Available");
				}
				
				System.out.println("All available books in shop");
				bookShop.values().forEach(System.out::println);
			}
			break;
			
			case 2:{
				System.out.println("Enter name of book to add");
				
				//Clear buffer
				sc.nextLine();
				
				String title = sc.nextLine();
				
				Book book = bookShop.get(title);
				
				if(book == null) {
					throw new BookHandlingException("Book not Available");

				}
				
				userCart.add(book);
				System.out.println("Book added to cart");
			}
			break;
			
			case 3:{
				if(userCart.isEmpty()) {
					throw new BookHandlingException("Book not found in cart");
				}
				
				System.out.println("All books in cart");
				userCart.forEach(System.out::println);
				
			}
			break;
			
			case 4:{
				double totalValue = 0;
				for(Book book:bookShop.values()) {
					
					totalValue += book.getPrice();
				}
				
				System.out.println("Total price:"+totalValue);
				
				System.out.println("All books purchased by the user");
				
				userCart.forEach(c-> System.out.println(c.getTitle()));
				
				//Autosave cart 
				IOUtil.saveCart(userCart);
				System.out.println("Cart Saved");
				
			}
			}
			
		}while(choice != 6);
		
		
	}

}
