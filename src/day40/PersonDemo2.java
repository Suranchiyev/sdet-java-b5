package day40;

public class PersonDemo2 {
	public static void main(String[] args) {
		// What's static keyword in Java?
		// - static variables and method are belong to class, and not to specific object
		// - the correct way of using static members is by class name without
		//   creating object.
		
		// Person.address = "101 main st";
		// Person.sayHello();
		
		Person person = new Person();
		person.firstName = "Vijay";
		person.lastName = "Kumar";
		person.age = 45;
		
		Person.address = "101 main st";
		// person.address = "123 North Street";
				
		System.out.println(person.getFullName()); // Vijay Kumar
		System.out.println(person.age); //  45
		System.out.println(Person.address);
		// System.out.println(person.address); // 123 North Street
		
		System.out.println("--------");
		
		Person person2 = new Person();
		System.out.println(person2.getFullName()); // null null 
		System.out.println(person2.age); // 0 
		System.out.println(person2.address); // 123 North Street
		
		Person person3 = new Person();
		System.out.println(person3.address);
	}
}
