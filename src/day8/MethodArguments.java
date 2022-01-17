package day8;

public class MethodArguments {
	public static void main(String[] args) {
		sayHello("Alex");
		
		System.out.println("-----");
		sayHello("Bek");
		
		System.out.println("-----");
		String str = "John";
		sayHello(str); // Hello John
		//   4
		int res = minusFive(9);
		System.out.println("res: " + res);
		
		res = minusFive(99);
		System.out.println("res: " + res); // 94
		
		res = minusFive(10);
		System.out.println("res: " + res); // 5
		
		String joinRes = join("apple", "orange");
		System.out.println(joinRes); // appleorange
	}
	
	public static void sayHello(String name) {
		System.out.println("Hello " + name);
	}
	
	public static int minusFive(int num) {
		num -= 5;
		return num;
	}
	
	public static String join(String str, String str2) {
		String res = str + str2;
		return res;
	}
}
