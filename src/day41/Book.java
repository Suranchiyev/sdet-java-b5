package day41;

// TODO encapsulate
// 1. Make instance variables private.
// 2. Create getters and setters for each of them.
public class Book {
	private String title;	
	private String author;
	private int pages;
	private String description;
	private double price;
	
	// Cursor inside the class
	// Right click -> Source -> Generate getters and setters -> select all -> Generate
	
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
	
	public int getPages() {
		return pages;
	}
	
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
}
