package day13;

public class Grade {
	public static void main(String[] args) {
		displaScore('A'); // 90 - 100
		displaScore('a'); // 90 - 100
		displaScore('F'); // less than 50
		displaScore('c'); // 50 - 64
	}
	
	/*
	 * if grade is 'A' or 'a' -> "90 - 100"
	 * if grade is 'B' or 'b' -> "65 - 89"
	 * if grade is 'C' or 'c' -> "50 - 64"
	 * if grade is 'F' or 'f' -> "less than 50"
	 * otherwise              -> "invalid input."
	 */
	public static void displaScore(char grade) {
		//      'A'
		switch(grade) {
		case 'A', 'a':
			System.out.println("90 - 100");
			break;
		case 'B':
		case 'b':
			System.out.println("65 - 89");
			break;
			
		case 'C', 'c':
			System.out.println("50 - 64");
			break;
		case 'F', 'f':
			System.out.println("less than 50");
			break;
		default:
			System.out.println("Invalid input.");
			break;
		}
	}
}
