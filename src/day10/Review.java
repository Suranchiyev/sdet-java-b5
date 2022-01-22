package day10;

public class Review {
	public static void main(String[] args) {
		// ==, !=, >, >=, <, <=
		
		// == operator is used to compare primitives on equality.
		//    For objects it will check if two references are pointing to the 
		//    same object or not.
		
		// != operator is used to compare primitives if the are NOT EQUAL.
		
		// >= greater or equal.
		// <= less or equal.
		
		int i = 9;
		int j = 7;
		// (9 equal to 7) -> false
		if (i == j) {
			System.out.println("Line 20");
		} else {
			System.out.println("Line 22"); 
		}
		//  9 NOT EQUAL 7 -> true
		if (i != j) {
			System.out.println("Line 26"); 
		} else {
			System.out.println("Line 28");
		}
		//  9 GREATER OR EQUAL to 7 -> true
		if (i >= j) {
			System.out.println("Line 32"); 
		} else {
			System.out.println("Line 34");
		}
	}
}
