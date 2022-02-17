package day25;

public class StringPool2 {
	public static void main(String[] args) {
		String str = "john";
		String str1 = "john";
		String str2 = new String("john");
		
		// What's the output from this program? Why?
		System.out.println(str == str1); // true.
		// They are pointing to the same object in the String Pool.
		// String Pool will try to reuse same objects.
		
		System.out.println(str == str2); // false. 
		// They are not pointing to the same object because 
		// of str2 was created by new keyword. It means it will not use
		// String Pool. 
		
		System.out.println(str.equals(str2)); // true
		// Because .equals method compares actual content of String on equality.
		
	}
}

