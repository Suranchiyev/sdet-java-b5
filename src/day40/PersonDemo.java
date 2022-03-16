package day40;

public class PersonDemo {
	public static void main(String[] args) {
		Person person = new Person();
		person.firstName = "Alex";
		person.lastName = "Rodriguez";
		person.age = 35;
		
		String name = person.getFullName();
		System.out.println(name); // Alex Rodriguez
		
		Person person2 = new Person();
		name = person2.getFullName();
		System.out.println(name);  // null null
		System.out.println("-----------");
		
		Person obj = new Person();
		obj.firstName = "Kuba";
		obj.lastName = "Zhaanbaev";
		obj.age = 36;
		
		System.out.println(obj.getFullName()); // Kuba Zhaanbaev
		System.out.println(obj.age); // 36
		
		Person obj2 = obj; 
		System.out.println(obj2.getFullName()); // Kuba Zhaanbaev
		
		obj2.firstName = "John";
		obj2.lastName = "Doe";
		
		System.out.println(obj2.getFullName()); // John Doe
		System.out.println(obj.getFullName()); // John Doe
	}
}
