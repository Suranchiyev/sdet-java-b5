package day16;

public class StrCharAt {
	public static void main(String[] args) {
		// charAt(index) -> it return single character from given index
		//            0123
		String str = "home";
		char ch = str.charAt(1);
		
		System.out.println(str); // home
		System.out.println(ch); // o
		
		//             012345
		String str2 = "public";
		char ch2 = str2.charAt(4);
		System.out.println(ch2); // i
		
		//             01234
		String str3 = "ap ple";
		char ch3 = str3.charAt(2);
		System.out.println("space: " + ch3);
		System.out.println("---------------");
		
		char ch4 = getFirstChar("hello"); 
		System.out.println(ch4); // h

		System.out.println(getFirstChar("Apple")); // A
		System.out.println(getFirstChar("Java")); // J
	}
	
	// String str - argument. 
	// We give value for our argument when we call our method.
	// char - return type. 
	// Basically, we are telling this method must return char.
	public static char getFirstChar(String str) {		
		char ch = str.charAt(0);
		return ch;
	}	
}





