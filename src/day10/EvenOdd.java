package day10;

public class EvenOdd {
	public static void main(String[] args) {
		int num = 26;
		
		// How find out if num's value is even or odd?
		
		// number % 2 == 0 then it's even number otherwise odd
		if (num % 2 == 0) {
			System.out.println(num + " is even.");
		} else {
			System.out.println(num + " is odd.");
		}	
		
		evenOrOdd(7); // 7 is odd
		evenOrOdd(10); // 10 is even
		evenOrOdd(234);
	}
	
	/*
	 * - Create a static void method that accepts one int argument.
	 * - If method argument is even print "<number> is even"
	 * - If method argument is odd print "<number> is odd"
	 * - Use your method in the main method with odd and even numbers.
	 */
	public static void evenOrOdd(int number) {
		if (number % 2 == 0) {
			System.out.println(number + " is even");
		} else {
			System.out.println(number + " is odd");
		}
	}
}
