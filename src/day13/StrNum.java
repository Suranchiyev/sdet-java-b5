package day13;

public class StrNum {
	public static void main(String[] args) {		
		// Supported Data types by switch:
		// byte and Byte
		// short and Short
		// int and Integer
		// char and Character
		// String
		// enum
		String res = getStrVal(3);
		System.out.println(res);
	}
	
	/*
	 * 1 - "one"
	 * 2 - "two"
	 * 3 - "three"
	 * 4 - "four"
	 * others "We dont's support yet."
	 */
	public static String getStrVal(int num) {
		switch(num) {
		case 1:
			return "one";
		
		case 2:
			return "two";
			
		case 3:
			return "three";
			
		case 4:
			return "four";
			
		default:
			return "We dont't support yet.";
		}
	}
}





