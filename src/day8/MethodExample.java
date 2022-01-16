package day8;

public class MethodExample {
	
	public static void main(String[] args) {
		welcomeMessage();
		
		// ===== some other code =====
		System.out.println("-------");
		
		welcomeMessage();
	}
	
	public static void welcomeMessage() {
		System.out.println("Hello, class!");
		System.out.println("Welcome to another java day!");
		System.out.println("Today we will learn java");
	}
}
