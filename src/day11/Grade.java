package day11;

public class Grade {
	public static void main(String[] args) {
		printGrade(99); // Your score is A.
		printGrade(90); // Your score is A.
		printGrade(85); // Your score is B.
		printGrade(55); // Your score is F.

		printGrade(300); // Invalid score value.

		printGrade(-9); // Invalid score value.

	}

	// if score within 90 and 100, print "Your score is A."
	// if score within 80 and 89, print "Your score is B."
	// if score within 70 and 79, print "Your score is C."
	// if score within 60 and 69, print "Your score is D."
	// if score within 0 and 60, print "Your score is F."
	// for any other values of score, print "Invalid score value."
	public static void printGrade(int score) {
		if (score >= 90 && score <= 100) {
			System.out.println("Your score is A.");

		} else if (score >= 80 && score <= 89) {
			System.out.println("Your score is B.");
		} else if (score >= 70 && score <= 79) {
			System.out.println("Your score is C.");

		} else if (score >= 60 && score <= 69) {
			System.out.println("Your score is D.");

		} else if (score >= 0 && score < 60) {
			System.out.println("Your score is F.");

		} else {
			System.out.println("Invalid score value.");
		}
	}
}
