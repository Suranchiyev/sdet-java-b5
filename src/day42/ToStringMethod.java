package day42;

public class ToStringMethod {
	public static void main(String[] args) {
		Book book = new Book("OCA", 500);
		
		/*
		 * It is recommended that all classes override toString method
		 * In  general, toString should return a string that 
		 * "textually represents" this object.
		 * The result should be informative representation that is easy 
		 * for a person to read.
		 */
		
		System.out.println(book); // Book [title=OCA, numberOfPages=500]
		// System.out.println(book.toString()); // Book [title=OCA, numberOfPages=500]
		String strObj = book.toString();
		
		Book book2 = new Book("Java OCP", 900);
		System.out.println(book2);
	}
}
