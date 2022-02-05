package day19;

public class WarmpUp {
	public static void main(String[] args) {
		System.out.println(isLastUpper("hello")); // false
		System.out.println(isLastUpper("hellO")); // true
		System.out.println(isLastUpper("JAVA")); // true
		System.out.println(isLastUpper("Apple")); // false
	}
	
	/*
	 * if last char of str is upper case letter return true, otherwise false
	 * isLastUpper("Hello"); -> false
	 * isLastUpper("hellO";  -> true
	 */
	public static boolean isLastUpper(String str) {         
		String lastCharUpper = str.substring(str.length() - 1).toUpperCase();
		String lastCharOriginal = str.substring(str.length() - 1);
		return lastCharUpper.equals(lastCharOriginal);
	}
	
	public static boolean isLastUpper2(String str) {
		char lastChar = str.charAt(str.length() - 1);
		// We use wrapper class method here Character.isUpperCase(char);
		// Wrapper classes are object representation of primitives
		return Character.isUpperCase(lastChar);
	}
	
	public static boolean isLastUpper3(String str) {
		char lastChar = str.charAt(str.length() - 1);             
		char lastCharUpper = String.valueOf(lastChar).toUpperCase().charAt(0);
		return lastChar == lastCharUpper;
	}
}



