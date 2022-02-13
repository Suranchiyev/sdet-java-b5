package day23;

public class NullValues {
	
	
	
	
	public static void main(String[] args) {
		// What's null?
		// The object reference can have null value.
		// It means that it doesn't point to any object.
		
		String name = "John";	
		String str = null; // str doesn't point to any object
		
		
		Person person = new Person();
		Person person2 = null;
		
		// NullPointerException?
		// When you use properties or methods of reference that points to null, you
		// will get NullPointerException
		
		System.out.println(person2); // null
		// person2.name = "Kuba";  // NullPointerException here
		
		// Garbage Collector
		// The main role of GC to clean up unused objects.
		// It is 100% automatic process so we developers do not touch it.
		// You cannot call GC, it is automatic process, but you can suggest.
		// System.runFinalization(); 
		
		Person obj1 = new Person("John", 28);
		Person obj2 = new Person("Alex", 34);
		
			
		// obj1 will point where the obj2 is pointing 
		// and new Person("John", 28); is eligible for GC
		obj1 = obj2;
		
		obj1 = null;
		obj2 = null;
	}
}

class Person {
	public String name;
	public int age;
	
	public Person() {
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
