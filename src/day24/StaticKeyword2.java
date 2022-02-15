package day24;

public class StaticKeyword2 {
	// - inside static methods we can call/use only static methods and variables
	
	// - inside non static methods we can use static variables and methods directly.
	
	public static String str;
	public int num;
	
	public static void m() {
		System.out.println("inside m()");
		m2();
		// m3(); non static methods cannot be called from static method directly
//		StaticKeyword2 obj = new StaticKeyword2();
// 		obj.m3(); // if you really want to do then you have to create object and call.
		
		System.out.println(str);
		// System.out.println(num);
	}
	
	public static void m2() {
		System.out.println("inside m2()");
	}
	
	public void m3() {
		System.out.println("inside m3()");
		m2();
		System.out.println(str);
		System.out.println(num);
	}
}
