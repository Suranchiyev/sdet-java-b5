package day40;

public class DogDemo {
	public static void main(String[] args) {
		Dog dog = new Dog();
		// dog.name = "Tuzik";
		// dog.age = -5;
		
		dog.setName("Tuzik");
		dog.setAge(2);
		
		System.out.println(dog.getName());
		System.out.println(dog.getAge());
	}
}
