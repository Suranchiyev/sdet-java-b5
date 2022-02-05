package day19;

import java.util.Scanner;

public class Password3 {
	public static final String PASSWORD = "qwerty1$";
	public static final int LIMIT_OF_ATTEMPTS = 3;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your password: ");
		String enteredPassword = sc.next();

		int numberOfAttmepts = 1;
		boolean isLimitOver = false;

		while (!PASSWORD.equals(enteredPassword) && numberOfAttmepts < LIMIT_OF_ATTEMPTS) {
			System.out.println("Wrong password. Try again");
			System.out.println("Enter your password:");
			enteredPassword = sc.next();

			numberOfAttmepts++;

			if (numberOfAttmepts >= LIMIT_OF_ATTEMPTS && !PASSWORD.equals(enteredPassword)) {
				isLimitOver = true;
			}
		}
		if (isLimitOver) {
			System.out.println("Your account is blocked. Contact support team.");
		} else {
			System.out.println("Welcome to your dashboard.");
		}
	}
}
