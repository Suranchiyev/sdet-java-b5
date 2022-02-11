package day22;

public class FizzBuzz {
	public static void main(String[] args) {
		System.out.println("starting");
		// write a program that will print numbers from
		// 1 to 100 inclusive.
		// except:
		// if number is divisible by 5 then print "Fizz"
		// if number is divisible by 7 then print "Buzz"
		// if number is divisible by 5 and 7 then print "Fizz Buzz"
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0) {
				System.out.println("Fizz");
				
			} else if (i % 7 == 0) {
				System.out.println("Buzz");
				
			} else if (i % 5 == 0 && i % 7 == 0) {
				System.out.println("Fizz Buzz");
				
			} else {
				System.out.println(i);
			}
		}
		System.out.println("the end.");
	}
}







