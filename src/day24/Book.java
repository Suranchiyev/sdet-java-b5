package day24;

public class Book {
	public String title;
	public int pages;
	public String author;

	public void read() {
		System.out.println("reading " + title);
	}
	
	public Book() {
		
	}
	
	public Book(String title, int pages, String author) {
		this.title = title;
		this.pages = pages;
		this.author = author;
	}
	
	// TODO define a constructor that make work Library class
	public Book(String title, int pages) {
		this.title = title;
		this.pages = pages;
	}
}
