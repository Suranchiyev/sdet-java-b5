package day17;

public class StrMethods1 {
	public static void main(String[] args) {
		printFirstAndLast("apple"); //ae
		System.out.println("----------");
		
		System.out.println(isUpperCase("HELLO")); // true
		System.out.println(isUpperCase("Hello")); // false
		System.out.println("----------");
		
		System.out.println(lengthWS("apple")); // 5
		System.out.println(lengthWS("Hi John")); // 6
		System.out.println(lengthWS("ora nge  ")); // 6
	}
	
	/*
	 * lengthWS("apple"); -> 5
	 * lengthWS("Hi John"); -> 6
	 * lengthWS("ora nge  "); -> 6
	 */
	public static int lengthWS(String str) {
		// 1. use replace method to remove the spaces replace(" ", "");
		// 2. use length() and return length.
	
		return str.replace(" ", "").length();
	}
	
	/*
	 * printFirstAndLast("apple"); -> ae
	 * printFirstAndLast("hello"); -> ho
	 * printFirstAndLast("John"); -> Jn
	 */
	public static void printFirstAndLast(String str) {
		char firstChar = str.charAt(0);
		char lastChar = str.charAt(str.length() - 1);

		// char + char => int
		System.out.println(firstChar + "" + lastChar);
	}
	
	/*
	 * isUpperCase("HELLO"); -> true
	 * isUpperCase("Hello"); -> false
	 */
	public static boolean isUpperCase(String str) {
		String upperStr = str.toUpperCase();
		return str.equals(upperStr);
	}
}
