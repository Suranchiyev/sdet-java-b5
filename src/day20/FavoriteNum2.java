package day20;
import java.util.Scanner;

public class FavoriteNum2 {
	public static void main(String[] args) {
		final int myFavoriteNumber = 7;
		
		Scanner sc = new Scanner(System.in);
		
		int enteredNumber;
		
		do {
			System.out.println("Can you guess my number?");
			enteredNumber = sc.nextInt();
			
			if (myFavoriteNumber != enteredNumber) {
				System.out.println("No, it is not!");
			}
			
		} while(myFavoriteNumber != enteredNumber);
		
		System.out.println("Yes, you got it!");
	}
}
