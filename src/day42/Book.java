package day42;

public class Book {
	public String title;
	public int numberOfPages;
	
	public Book(String title, int numberOfPages) {
		this.title = title;
		this.numberOfPages = numberOfPages;
	}
	
	public Book() {}
	
	@Override
	public String toString() {
		return "Book [title="+title+", numberOfPages=" + numberOfPages+"]";
	}
	
	@Override
	public boolean equals(Object obj) {
		// instanceof will check if object is instance of specific class.
		if (obj == null || !(obj instanceof Book)) {
			return false;
		}
		
		// casting Object to Book class
		Book book = (Book)obj;
		
		return title.equals(book.title) && numberOfPages == book.numberOfPages;
	}
	
	@Override
	public int hashCode() {
		return title.hashCode() + numberOfPages;
	}
}
