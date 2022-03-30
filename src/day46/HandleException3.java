package day46;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandleException3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number from 1-5: ");
		int num = 0;
		
		try {
			num = sc.nextInt();
			
		} catch(InputMismatchException e) {
			System.out.println("Numeric values only");
			return; // exit from void method
			// System.exit(0); // shutdown the thread.
		}
		
		switch(num) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		default:
			System.out.println("Numbers from 1-5 only.");
		}
		// TODO handle exception for non numeric values and print "Numeric values only"
	}
}
