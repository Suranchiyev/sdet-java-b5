package day9;

public class MoreMethods {
	public static void main(String[] args) {
		int i = 9;
		int j = 17;
		
		//  9 > 17 => false
		if (i > j) {
			// if condition true if's body gets executed
			System.out.println("Yes, it's");
		} else {
			// if condition is false else's body gets executed
			System.out.println("No, it's not");
		}
		
		System.out.println("----------");
		luckyNumber(9);
		luckyNumber(7);
		
		badNum(78); // Normal number: 78
		badNum(8);  // Normal number: 8
		badNum(13); // Bad number: 13
	}
	
	// create void method that will accept one int number and if number is 7, it will print
	// "bingo!" otherwise "not today"
	public static void luckyNumber(int num) {
		// == equal operator
		if (num == 7) {
			System.out.println("Bingo!");
		} else {
			System.out.println("Not today.");
		}
	}
	
	// if argument num == 13 then print "Bad number: <num>"  
	// otherwise print "Normal number: <num>"
	public static void badNum(int num) {
		if (num == 13) {
			System.out.println("Bad number: " + num);
		} else {
			System.out.println("Normal number: " + num);
		}
	}
}
