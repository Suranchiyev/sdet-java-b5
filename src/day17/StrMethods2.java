package day17;

public class StrMethods2 {
	public static void main(String[] args) {
		System.out.println(getFirstTwo("apple")); // ap
		System.out.println(getFirstTwo("Hi")); // Hi
		System.out.println("--------");
		
		System.out.println(getLastTwo("apple")); // le
		System.out.println(getLastTwo("hello")); // lo
		System.out.println(getLastTwo("hi")); // hi
		System.out.println("--------");
		
		System.out.println(switchWords2("apple")); // apple
		System.out.println(switchWords2("hello world")); // world hello
		System.out.println(switchWords2("java cool")); // cool java
		System.out.println(switchWords2("is cool")); // cool is
	}
	/*
	 * switchWords2("apple");      -> apple
	 * switchWords2("hello world") -> world hello
	 * switchWords2("java cool")   -> cool java
	 * switchWords2("is cool")     -> cool is
	 */
	public static String switchWords2(String str) {
		if (str.contains(" ")) {
			String fWord = str.substring(0, str.indexOf(" "));
			String sWord = str.substring(str.indexOf(" ") + 1);
			return sWord + " " + fWord;
		}
		
		return str;
	}
	
	/*
	 * getFirstTwo("apple"); -> ap
	 * getFirstTwo("hello"); -> he
	 * getFirstTwo("John");  -> Jo
	 * getFirstTwo("Hi");    -> Hi
	 */
	public static String getFirstTwo(String str) {
		// return str.substring(0, 2);
		char fCh = str.charAt(0);
		char sCh = str.charAt(1);
		return fCh + "" + sCh;
	}
	
	/*
	 * getLastTwo("apple"); -> le
	 * getLastTwo("hello"); -> lo
	 * getLastTwo("hi");    -> hi
	 */
	public static String getLastTwo(String str) {
		int len = str.length();
		return str.substring(len - 2);
	}
	

	
}
