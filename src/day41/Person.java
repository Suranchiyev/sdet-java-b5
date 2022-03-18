package day41;

public class Person {
	public String firstName;
	public String lastName;
	public int age;
	
	// accessible within the same package
	// or in the subclass.
	protected String address;
	
	// accessible within the same package only
	String car;
	
	public String getFullName() {
		return firstName + " " + lastName;
	}
}
