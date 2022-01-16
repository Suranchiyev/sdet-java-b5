package day8;

public class ReturnMethods {
	public static void main(String[] args) {
		sayHi();
		
		String res = getHi();
		System.out.println(res); // hey
		
		getHi();
	}
	
	// String - return type of this method.
	// If we specify our return type(String), it must return it
	public static String getHi() {
		System.out.println("Inside getHi method");
		
		return "hey";
	}
	
	// void - return type of this method
	// when it's void method will not return anything.
	public static void sayHi() {
		System.out.println("Hi");
	}
	// BREAK TILL 11:25 AM EST
}
