package day14;

public class StrLength {
	public static void main(String[] args) {
		// String is immutable(not changeable) object that
		// holds sequence of characters.
		// String has many useful methods that allow us work
		// with it's value.
		
		String str = "apple";
		
		// length() is used to check the number of characters.
		int numberOfCharacters = str.length();
		System.out.println("My string has " + numberOfCharacters + " chars");
		
		// space also counted as char
		str = "kiwi is good";
		System.out.println(str.length()); // 12
		
		evenOrOddLength("hello"); // odd length
		evenOrOddLength("Java"); // even length
		System.out.println("-----------");
		
		String res = longName("Beknazar");
		System.out.println(res); // long name
		System.out.println(longName("Bek")); // short name
		System.out.println(longName("John")); // regular name
		
	}
	
	public static String longName(String name) {
		// if name length(size) is greater than 7 inclusive, return "long name"
		// if name length(size) is less than 3 inclusive, return "short name"
		// otherwise return "regular name"
		if (name.length() >= 7) {
			return "long name";
			
		} else if (name.length() <= 3) {
			return "short name";
			
		} else {
			return "regular name";
		}
	}
	
	public static void evenOrOddLength(String str) {
		// if argument str's length is even, print "even length"
		// otherwise print "odd length"
		
		int len = str.length();
		
		if (len % 2 == 0) {
			System.out.println("even length");
		} else {
			System.out.println("odd length");
		}
	}
}




