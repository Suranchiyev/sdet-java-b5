package day33;

public class Varargs1 {
	public static void main(String[] args) {
		System.out.println(join("hello", "world")); // helloworld
		System.out.println(join("apple", "orange", "banana")); // appleorangebanana
		System.out.println(join("one", "two", "three", "four", "five"));
		
		String[] langs = {"java", "python", "js", "ruby", "php"};
		System.out.println(join(langs));
	}
	
	public static String join(String... strs) {
		// vararg works exactly as array inside the method.
		
		String res = "";
		
//		for (String str : strs) {
//			res += str;
//		}
		for (int i = 0; i < strs.length; i++) {
			res += strs[i];
		}
		
		return res;
	}
	
	// 1. Only one vararg per method
//	public static void myMethod(String... words, int... nums) {
//		
//	}
	
	// 2. The vararg argument should be the last one if method has other arguments
	public static void myMethod(String str, double dNum, int... nums) {
		
	}
}
