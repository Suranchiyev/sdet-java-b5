package day18;

public class Score {
	enum Grade {A, B, C, F};
	
	public static void main(String[] args) {
		displayScore(Grade.A); // your score: 90 - 100
		displayScore(Grade.C); // your score: 50 - 64
		displayScore(Grade.F); // your score: less than 50
		
		// displayScore(Grade.I);
		
		displayScore2(Grade.A); // 
	}
	
	public static void displayScore2(Grade grade) {
		if (grade == Grade.A) {
			System.out.println("your score: 90 - 100");
		} else if (grade == Grade.B) {
			System.out.println("your score:  65 - 89");
		} else if (grade == Grade.C) {
			System.out.println("your score: 50 - 64");
		} else if (grade == Grade.F) {
			System.out.println("your score: less than 50");
		} else {
			System.out.println("Invalid grade");
		}	
	}
	
	/*
	 * if grade is A then print  "your score: 90 - 100"
	 * if grade is B then print  "your score: 65 - 89"
	 * if grade is C then print  "your score: 50 - 64"
	 * if grade is F then print  "your score: less than 50"
	 */
	public static void displayScore(Grade grade) {
		switch(grade) {
		case A:
			System.out.println("your score: 90 - 100");
			break;
		case B:
			System.out.println("your score: 65 - 89");
			break;
		case C:
			System.out.println("your score: 50 - 64");
			break;
		case F:
			System.out.println("your score: less than 50");
			break;	
		default:
			System.out.println("Invalid grade");
		}
	}
}
