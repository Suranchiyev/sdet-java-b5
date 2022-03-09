package day36;

import java.util.ArrayList;
import java.util.List;

public class BookDemo {
	public static void main(String[] args) {
		List<Book> list = new ArrayList<>();
		
		Book b = new Book("OCA", "Jenne", 500, Rating.EXCELLENT);
		list.add(b);
		list.add(new Book("OCP", "Jenne", 700, Rating.EXCELLENT));
		list.add(new Book("The 10X Rule", "Cardone", 250, Rating.GOOD));
		list.add(new Book("Educated", "Westover", 350, Rating.GOOD));
		list.add(new Book("The Black Swan", "Taleb", 482, Rating.EXCELLENT));
		
		System.out.println(list.get(0));
		// Get first element and assign back to Book variable
		Book firstBook = list.get(0);
		// print each property of first book
		System.out.println("Title: " + firstBook.title);
		System.out.println("Author: " + firstBook.author);
		System.out.println("Pages: " + firstBook.pages);
		System.out.println("Rating: " + firstBook.rating);
		System.out.println("-----");
		
		// print each property of second book
		System.out.println("Title: " + list.get(1).title);
		System.out.println("Author: " + list.get(1).author);
		System.out.println("Pages: " + list.get(1).pages);
		System.out.println("Rating: " + list.get(1).rating);
			
		System.out.println("-----");
		// TODO print title of each book inside our list by using loop	
		for (int i = 0; i < list.size(); i++) {
			Book myBook = list.get(i);
			System.out.println(myBook.title);
			// System.out.println(list.get(i).title);
		}
		System.out.println("-----");
		for (Book book : list) {
			System.out.println(book.title);
		}
		System.out.println("-----");
		
		int totalPagesToRead = 0;
		// TODO find out and assign total pages to totalPagesToRead from our list
//		for (int i = 0; i < list.size(); i++) {
//			totalPagesToRead += list.get(i).pages;
//		}
		
		// we use for each loop when we need to over each element one by one.
		for (Book book : list) {
			totalPagesToRead += book.pages;
		}
		System.out.println("The total pages to read is " + totalPagesToRead);
		System.out.println("-----");
		
		// TODO add all GOOD books from list to goodBooks based on rating
		List<Book> goodBooks = new ArrayList<>();
		
//		for (int i = 0; i < list.size(); i++) {
//			if (list.get(i).rating == Rating.GOOD) {
//				goodBooks.add(list.get(i));
//			}
//		}
		
		// List<Book> list = new ArrayList<>();
		for (Book str : list) {
			if (str.rating == Rating.GOOD) {
				goodBooks.add(str);
			}
		}
		
		System.out.println("-----");
		for (Book eachBook : goodBooks) {
			System.out.println(eachBook.title);
		}
	}
}






