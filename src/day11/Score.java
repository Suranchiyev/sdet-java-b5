package day11;

public class Score {
	public static void main(String[] args) {
		char grade = 'A';
		String scoreMsg;
		
		// if grade is 'A' then "Your score more than 90"
		// if grade is 'B' then "Your score within 80 - 90"
		// if grade is 'C' then "Your score within 70 - 79"
		// if grade is 'D' then "Your score within 60 - 69"
		// if grade is 'F' then "Your score is less than 60"
		// otherwise "Not valid grade(it can be A,B,C,D,F)"
		
		if (grade == 'A') {
			scoreMsg = "Your score more than 90";
			
		} else if (grade == 'B') {
			scoreMsg = "Your score within 80 - 90";
			
		} else if (grade == 'C') {
			scoreMsg = "Your score within 70 - 79";
			
		} else if (grade == 'D') {
			scoreMsg = "Your score within 60 - 69";
			
		} else if (grade == 'F') {
			scoreMsg = "Your score is less than 60";
			
		} else {
			scoreMsg = "Not valid grade(it can be: A,B,C,D,F)";
		}
		
		System.out.println("Grade: " + grade);
		System.out.println("Message: " + scoreMsg);
	}
}




