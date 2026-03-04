package book.util;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import book.core.Book;
import book.core.Category;

public class CollectionUtils {

	// Collection util
	
	public static Map<String, Book> populateBooks(){
		
		Map<String,Book>shop = new HashMap<>();
		
		//String title, String author, double price, Category category, LocalDate publishDate
		shop.put("Automic Habbit", new Book("Automic Habbit", "James Clear", 300, Category.SELFHELP, LocalDate.of(1998,11,10)));
		shop.put("Java Complete Reference", new Book("Java Complete Reference", "Herbert Schildt", 800, Category.TECHNOLOGY, LocalDate.of(2020, 1, 5)));
        shop.put("Sapiens", new Book("Sapiens", "Yuval Noah Harari", 650, Category.HISTORY, LocalDate.of(2015, 6, 10)));
        shop.put("Harry Potter", new Book("Harry Potter", "J.K. Rowling", 500, Category.FICTION, LocalDate.of(2007, 7, 21)));
        shop.put("A Brief History of Time", new Book("A Brief History of Time", "Stephen Hawking", 550, Category.SCIENCE, LocalDate.of(1998, 4, 10)));
        
        return shop;
	}
}
