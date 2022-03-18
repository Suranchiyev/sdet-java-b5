package day41;

public class Employee extends Person {
	// Employee is child/subclass class for Person
	// Person is parent/super class for Employee
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.firstName = "George";
		emp.lastName = "Costanzo";
		emp.age = 36;
		emp.address = "101 Main st";
		
		// What instance variables and methods will
		// be inherited?
		// Visible instance variables and method will be
		// inherited.		
	}
}
