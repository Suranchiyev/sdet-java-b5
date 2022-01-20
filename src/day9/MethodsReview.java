package day9;

public class MethodsReview {
	// Method is block of code that can be used by it's name
	// Methods are used for reusability.
	
	// void methods - they do something and they don't return any data
	// return methods - they do something but they must return the data.
	
	// Method arguments/parameters - method can get input from the user
	// by it's arguments.
	
	public static void main(String[] args) {
		String input = "Java";
		printThree(input);
		
		printThree("Python");
		
		int res = sumOfTwo(5, 8);
		System.out.println(res); // 13
		
		String name = "John";
		int age = 27;
		String course = "Java";
		
		printInfo(name, age, course);
		
		System.out.println("------");
		
		printInfo("Alex", 37, "Selenium");
	}
	
	public static void printInfo(String name, int age, String course) {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Course: " + course);
	}
	
	// - method return int 
	// - method accepts two int arguments
	public static int sumOfTwo(int i, int i2) {
		int sum = i + i2;
		return sum;
	}
	
	// What you can tell about this method?
	// - void method - no return 
	// - it accepts one String argument
	// - it prints it's argument three times
	public static void printThree(String str) {
		System.out.println(str);
		System.out.println(str);
		System.out.println(str);
	}
	

}
