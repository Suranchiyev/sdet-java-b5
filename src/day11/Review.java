package day11;

public class Review {
	public static void main(String[] args) {
		// Logical operators
		// && - AND
		// || - OR
		// !  - NOT
			
		// if num is 7, 9, or 27 then print "My number" 
		// otherwise print "regular number"
		
		int num = 28;
		if (num == 7 || num == 9 || num == 27) {
			System.out.println("My number");
		} else {
			System.out.println("regular number");
		}
		
		int amount = 15;
		// if amount is even and greater than 10 then print "my even number"
		// otherwise print "regular number"
		
		// amount % 2 == 0 if true then number is even
		if (amount % 2 == 0 && amount > 10) {
			System.out.println("my even number");
		} else {
			System.out.println("regular number");
		}

	}

}
