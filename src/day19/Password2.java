package day19;
import java.util.Scanner;

public class Password2 {
	public static final String PASSWORD = "qwerty1$";
	public static final int LIMIT = 5;
	
	public static void main(String[] args) {
		// break -> break the loop and exit
		// continue -> skip current iteration
		
		Scanner sc = new Scanner(System.in);
		String enteredPassword = ""; 
		
		int numberOfAttemts = 0;
		while (numberOfAttemts < LIMIT) {
			
			System.out.println("Enter password:");
			enteredPassword = sc.next();
			
			if (PASSWORD.equals(enteredPassword)) {
				System.out.println("Welcome to your dashboard");
				break; // it used to exit the loop.
			}
			
			numberOfAttemts++;
		}
		
		if (numberOfAttemts >= LIMIT) {
			System.out.println("Your account is blocked. Number of attemts: " + numberOfAttemts);
		}
		
		
	}
}
