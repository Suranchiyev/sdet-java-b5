package day20;

public class DoWhileLoop {
	public static void main(String[] args) {
		// while(condition) { body }
		// do { body } while (condition);
		
		int i = 0;
		do {
			System.out.println("Hello, World!");
			i++;
		} while (i < 10);
		
		int i2 = 0;
		while (i2 < 10) {
			System.out.println("Good day!");
			i2++;
		}
		
		// What's the difference between while loop and do while loop?
		// while loop can have 0 iterations because body is after the condition.
		// do while will have at least one iteration because body is before the condition.
		
		do {
			System.out.println("From do while");
		} while (false);
	}
}
