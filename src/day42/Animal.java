package day42;

public class Animal {
	public String name = "Animal";
	public int age;
	
	public void eat() {
		System.out.println("Animal is eating");
	}
	
	public void run() {
		System.out.println("Animal is running");
	}
	
	public String getName() {
		return "Animal's name: " + name;
	}
}
