package day36;

public class Book {
	public String title;
	public String author;
	public int pages;
	public Rating rating;
	
	public Book(String title, String author, int pages, Rating rating) {
		this.title = title;
		this.author = author;
		this.pages = pages;
		this.rating = rating;
	}
	
	public Book() {
		
	}
}
