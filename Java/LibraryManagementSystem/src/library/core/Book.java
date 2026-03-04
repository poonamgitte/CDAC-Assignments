package library.core;

import java.io.Serializable;

public class Book implements Serializable{
	protected int bookId ;
	protected String title;
	protected Category category;
	protected boolean isAvailable;
	
	//Constructor
	public Book(int bookId, String title, Category category, boolean isAvailable) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.category = category;
		this.isAvailable = isAvailable;
	}

	// Setter getter method
	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailableCopies(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	
	//Override to string
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", category=" + category + ", isAvailable="
				+ isAvailable + "]";
	}
	
	
	
	
	
}
