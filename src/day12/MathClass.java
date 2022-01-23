package day12;

public class MathClass {
	public static void main(String[] args) {
		// Math.abs() method returns the absolute(positive) value of it's argument.
		
		int num = Math.abs(10);
		int num2 = Math.abs(-10);
		
		System.out.println("num: " + num);
		System.out.println("num2: " + num2);
		
		System.out.println(diff10(20, 2)); // true
		System.out.println(diff10(2, 20)); // true
		System.out.println(diff10(7, 8)); // false
		
		int i = -99;
		System.out.println(Math.abs(i));
		
		// Math.ceil() method returns a decimal point value up to nearest integer value.
		// It will round up		
		double ceil = 3.01;
		System.out.println("ceil: " + ceil);
		
		ceil = Math.ceil(ceil);
		System.out.println("after the Math.ceil(): " + ceil);
		
		// Math.floor() method will round down.
		double floorNum = 3.99;
		System.out.println("floor: " + floorNum); // 3.99
		
		floorNum = Math.floor(floorNum);
		System.out.println("after the Math.floor(): " + floorNum); // 3.0
		
		// Math.round() will round decimal point numbers.
		double rNum = 5.5;
		System.out.println("rNum: " + rNum);
		
		rNum = Math.round(rNum);
		System.out.println("after Math.round(): " + rNum);
	}
	
	// if difference between two args is 10 or more, return true otherwise false
	public static boolean diff10(int numOne, int numTwo) {
		int res = numOne - numTwo;
		res = Math.abs(res);
		
		return res >= 10;
	}
}
