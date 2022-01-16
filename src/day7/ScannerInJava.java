package day7;

import java.util.Scanner;

public class ScannerInJava {
	public static void main(String[] args) {
		// Scanner will let us get input from user(from console).
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What's your name?");
		
		String answer = scanner.next();
		System.out.println("Nice to meet you, " + answer + "!");
		
		System.out.println("How old are you?");
		int age = scanner.nextInt();
		System.out.println("Oh, you are " + age + " years old.");
		
		// TODO get input from user on "Where do you live?"
		// and print answer out.
		
		System.out.println("What's your address?");
		
		String address = scanner.next() + scanner.nextLine();
		System.out.println("You address: " + address);
		
		System.out.println("How old are you?");
		age = scanner.nextInt();
		System.out.println("Oh, you are " + age + " years old.");
	}
}






