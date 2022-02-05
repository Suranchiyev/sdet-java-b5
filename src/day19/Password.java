package day19;
import java.util.Scanner;

public class Password {
	public static final String PASSWORD = "qwerty1$";
	public static final int LIMIT_OF_ATTEMPTS = 3;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your password:");
		String enteredPassword = sc.next();
		
		int numberOfAttempts = 1; 
                                                  
		while (!PASSWORD.equals(enteredPassword) && numberOfAttempts < LIMIT_OF_ATTEMPTS) {
			System.out.println("Wrong password. Try agian");
			System.out.println("Enter your password:");
			enteredPassword = sc.next();
			numberOfAttempts++;
		}
		
		System.out.println("Number of attemts: " + numberOfAttempts);
		if (PASSWORD.equals(enteredPassword) && numberOfAttempts <= LIMIT_OF_ATTEMPTS) {
			System.out.println("Welcome");
		} else {
			System.out.println("Blocked");
		}
		// BREAK TILL 11:32AM EST
	}
}
