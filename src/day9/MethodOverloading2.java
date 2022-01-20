package day9;

public class MethodOverloading2 {
	public static void main(String[] args) {
		short number = 20;
		print(number);
		
		print("Apple");
		print(7);
	}
	
	// #1
	public static void print(String str) {
		System.out.println(str + "!");
	}
	
	// #2
	public static void print(int num) {
		System.out.println(num + "!");
	}
	
	// #3
	public static void print(short num) {
		System.out.println(num + "!");
	}
}
