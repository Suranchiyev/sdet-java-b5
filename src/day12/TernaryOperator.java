package day12;

public class TernaryOperator {
	public static void main(String[] args) {
		int y = 10;
		int x;
		
		// if y is greater than 5 then assign value to x = y * 2
		// otherwise assign value to x = y * 3	
//		if (y > 5) { 
//			x = y * 2;
//		} else {
//			x = y * 3;
//		}
		
		// = condition ? ifTrueThisValue : ifFalseThisValue;
		x = y > 5 ? y * 2 : y * 3;
		System.out.println("y: " + y);
		System.out.println("x: " + x);
		
		int num = 7;
		// if num is even then "java" otherwise "php"
		//             
		String str = num % 2 == 0 ? "java" : "php";
		System.out.println(str); // php
		
		str = num % 2 == 0 || num == 10 ? "apple" : num == 7 || num % 2 == 1 ? "kiwi" : "orange";
		
	}
}
