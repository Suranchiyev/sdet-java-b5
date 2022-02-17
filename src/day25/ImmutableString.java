package day25;

public class ImmutableString {
	public static void main(String[] args) {
		// String is immutable object.
		// Once we create String object, we cannot change it.
		
		String str = "apple";
		
		// reassignment
		str = str + ", orange";
		
		
		String str2 = "";
		for (int i = 0; i < 50; i++) {
			//      "01"
			str2 = str2 + i;
		}
		System.out.println(str2);
		// 51 String objects were created from line 14
	}
}
