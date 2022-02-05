package day19;
import java.util.Scanner;

public class WhileLoop2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of prints:");
		int numberOfPrints = sc.nextInt();

		if (numberOfPrints > 10) {
			System.out.println("I cannot print more than 10");
			
		} else {
			// our loop is here		
			int count = 0;
			while (count < numberOfPrints) {
				System.out.println("Java is great!");
				count++;
			}
		}
		
	}
}
