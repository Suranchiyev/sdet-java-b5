package day6;

public class Review {
	public static void main(String[] args) {
		// Can you list primitives in Java?
		// whole numbers: byte, short, int, long
		// floating numbers: float, double
		// primitive for single char: char
		// primitive for logic value: boolean
		
		// Why java has 4 type of primitives for whole numbers? 
		// what's the difference between them?
		// They can hold different range of numbers and the memory 
		// space they take is different.
		// byte -> short -> int -> long
		
		int num = 99;
		System.out.println(num); // 99
		
		num = 14;
		System.out.println(num); // 14
		
		int i = 7;
		int i2 = 2;
		System.out.println(i / i2); // 3
		System.out.println(5 / 2); // 2
		
		//          int / int
		double res = i / i2;
		System.out.println(res); // 3.0 
		
		double dNum = 99.9;
		double d = 9;
		double d2 = 2;
		//   double / double
		res = d / d2;
		System.out.println(res);
		
		char grade = 'C';
		System.out.println(grade); // C
		
		boolean isGood = true;
		isGood = false;
	}
}
