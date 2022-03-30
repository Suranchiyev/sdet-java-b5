package day46;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		String str = sc.next();
		
		try {
			
			int number = Integer.parseInt(str);
			if (number % 2 == 0) {
				System.out.println(number + " is even");
			} else {
				System.out.println(number + " is odd");
			}
		
			// we need to specify exact exception or parent exception
		} catch (NullPointerException e) {
			System.out.println("Invalid input number - cannot be null");
			
		} catch (NumberFormatException e1) {
			System.out.println("Invalid numeric value: " + e1.getMessage());
		}
	}
}	
