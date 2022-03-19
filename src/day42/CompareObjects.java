package day42;

public class CompareObjects {
	public static void main(String[] args) {
		Book book = new Book("OCA", 500);
		Book book1 = new Book("OCA", 500);
		
		// are they same? it really depends what we are comparing
		
		// equals should be used to compare object from the same class
		// by default equals that comes from Object class will work
		// as == operator.
		
		// it is recommended that we override equals to give our
		// own way of comparing object of our class.
		// Note hashCode method also should be overridden 
		// if equals is overridden.
		
		if (book.equals(book1)) {
			System.out.println("Yes, they are same");
		} else {
			System.out.println("No, they are not");
		}
		
		System.out.println(book.hashCode());
		System.out.println(book1.hashCode());
		System.out.println("--------");
		
		Book b = new Book("Java", 600);
		Book b2 = new Book("Java", 550);
		
		if (b.equals(b2)) {
			System.out.println("Yes, they are equal.");
		} else {
			System.out.println("No, they are not equal.");
		}
	}
}
