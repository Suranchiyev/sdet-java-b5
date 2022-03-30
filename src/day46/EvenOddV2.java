package day46;

import java.util.Scanner;

public class EvenOddV2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number:");

		// TODO change the code handle exception - it should keep asking until we get 
		//      valid input.
		boolean isValidInput = true;
		do {
			String str = sc.next();
		
			try {
				int num = Integer.parseInt(str);
				if (num % 2 == 0) {
					System.out.println("Even number");
				} else {
					System.out.println("Odd number");
				}
				
				isValidInput = false;
				
			} catch(NumberFormatException e) {
				System.out.println("Enter any number:");
			}

		} while (isValidInput);
	
	}
}
