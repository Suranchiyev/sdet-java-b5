package day47;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyKeyword {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter some number:");
			int num = sc.nextInt();
			System.out.println("Provided number was: " + num);
			
			
			System.out.println("My code here");
			
		} catch(InputMismatchException e) {
			System.out.println("Exception is handled");
			// throw new RuntimeException(e.getMessage());
			
		} finally {
			System.out.println("In the finally block");
			sc.close();
		}
		
		// finally block is optional
		// finally block will always run if there is exception or there no.
		// Most of the time we use to close used resources(files, db connections)
	}
}
