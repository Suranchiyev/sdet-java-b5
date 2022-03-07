package day35;
import java.util.List;
import java.util.ArrayList;

public class WarmUp {
	public static void main(String[] args) {
		// What's the difference between array and ArrayList?
		// - ArrayList has dynamic size and array has fixed size.
		// - ArrayList works with objects only, and array can work with primitives and objects
		
		// List is interface and ArrayList is concrete class of it.
		// This is more preferable way of creating list.
		List<String> books = new ArrayList<>();
		books.add("OCA");
		books.add("OCP");
		books.add("Algorithms in Java");
		books.add("Java Head First");
		books.add("Clean code");
		
		System.out.println(books);
		System.out.println(books.size());
		
		// TODO loop over the list and print each element in the new lines.
		for (String book : books) {
			System.out.println(book);
		}
		
		System.out.println("-------------");
		// TODO loop over the list from the back and print in reverse order.
		for (int i = books.size() - 1; i >= 0; i--) {
			System.out.println(books.get(i));
		}
	}
}
