package day4;

public class Var2 {
	public static void main(String[] args) {
		String firstName = "John";
		String lastName = "Doe";
		
		System.out.println(firstName); // John
		System.out.println(lastName); // Doe
		// "John Doe"
		System.out.println(firstName + " " + lastName); // John Doe
		// We can join two String values together by using '+' operator
		// We call it 'String concatenation'
		
		String fullName = "Full name: " + firstName + " " + lastName;
		System.out.println(fullName); // Full name: John Doe
		
		firstName = "Ramesh";
		lastName = "Kanery";
		System.out.println(firstName + " " + lastName); // Ramesh Kanery
		//          "Ramesh" + "Kanery";
		fullName = firstName + lastName;
		System.out.println(fullName); // RameshKanery
	}
}
