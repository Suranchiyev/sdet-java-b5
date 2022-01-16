package day6;

public class InstanceVariables {
	private String firstName;
	private String lastName;
	private int age;
	
	public static void main(String[] args) {
		/*
		 * Instance variables are variables created under the class.
		 * - They are properties of the object of that class.
		 * - They have default values.
		 * - They can have access modifiers.
		 */
		
		// System.out.println(firstName); we cannot use instance variables 
		// in the main method directly.
		
		InstanceVariables obj = new InstanceVariables();
		obj.firstName = "John";	
		System.out.println(obj.firstName);		
	}
}	
