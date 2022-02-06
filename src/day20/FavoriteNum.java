package day20;
import java.util.Scanner;

public class FavoriteNum {
	public static void main(String[] args) {
		final int myFavoriteNumber = 7;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Can you guess my favorite number?");
		int enteredNumber = sc.nextInt();

		while (myFavoriteNumber != enteredNumber) {
			System.out.println("No, " + enteredNumber + " is not my favorite number.");
			System.out.println("Can you guess my favorite number?");
			enteredNumber = sc.nextInt();
		}
		
		System.out.println("You got it! My favorite number is " + myFavoriteNumber);
	}
}
