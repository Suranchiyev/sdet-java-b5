package day42;

public class SuperObjectClass {
	public static void main(String[] args) {
		Book book = new Book("OCA", 500);
		
		// Every class extends java.lang.Object class by default
		// Why?
		// Because java wants to give common behaviors 
		// for every object that will be created.
		
		System.out.println(book.getClass()); // class day42.Book
		System.out.println(book.getClass().getTypeName());
		
		System.out.println(book.toString()); // day42.Book@7ad041f3
		System.out.println(book.equals(null)); // false
		System.out.println(book.hashCode()); // 2060468723
		
		// these methods for multithreading environment
		book.notify();
		book.notifyAll();
		// unhanlded exception
//		book.wait();
//		book.wait(2000);
//		book.wait(100, 10);
	}
}
