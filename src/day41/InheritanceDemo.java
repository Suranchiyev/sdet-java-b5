package day41;

public class InheritanceDemo {
	public static void main(String[] args) {
		Student obj = new Student();
		// student got inherited these properties
		obj.firstName = "John";
		obj.lastName = "Doe";
		obj.age = 28;
		
		obj.studentId = 1;
		obj.course = "Java";
		
		System.out.println(obj.getFullName());
	}
}
