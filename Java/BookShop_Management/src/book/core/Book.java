package book.core;

import java.io.Serializable;
import java.time.LocalDate;

public class Book implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected String title;
	protected String author;
	protected double price;
	protected Category category;
	protected LocalDate publishDate;
	
	// Book Constructor
	public Book(String title, String author, double price, Category category, LocalDate publishDate) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.category = category;
		this.publishDate = publishDate;
	}

	// Setter and getter methods
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public LocalDate getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + ", category=" + category
				+ ", publishDate=" + publishDate + "]";
	}
	
	
	
	
}
