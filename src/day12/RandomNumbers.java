package day12;

import java.util.Random;

public class RandomNumbers {
	public static void main(String[] args) {
		Random r = new Random();
		
		int randomNum = r.nextInt();
		System.out.println("random number: " + randomNum);
		
		// print random name from class
		// it will generate random number from 0-5 
		int rNumberForClass = r.nextInt(11);
		System.out.println("Random number for class: " + rNumberForClass);
		
		if (rNumberForClass == 0) {
			System.out.println("Anna");
			
		} else if (rNumberForClass == 1) {
			System.out.println("Antonio");
			
		} else if (rNumberForClass == 2) {
			System.out.println("Banditphak");
			
		} else if (rNumberForClass == 3) {
			System.out.println("Daniela");
			
		} else if (rNumberForClass == 4) {
			System.out.println("Davor");
			
		} else {
			System.out.println("Dorel");
		}
	}
}
