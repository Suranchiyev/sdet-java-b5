package day16;

public class StrCharAt2 {
	public static void main(String[] args) {
		System.out.println(getLastChar("apple")); // e
		
		System.out.println(getLastChar("John")); // n
		System.out.println(getLastChar("kiwi")); // i
		System.out.println(getLastChar("hello")); // o
		System.out.println(getLastChar("Bek")); // k
		
		//            01234
		String str = "apple";
		System.out.println(str.charAt(4)); // e
		
		//     012
		str = "Bek";
		System.out.println(str.charAt(2)); // k
		
	}
	
	public static char getLastChar(String str) {
		char lastChar = str.charAt(str.length() - 1);
		return lastChar;
		
	}
}
