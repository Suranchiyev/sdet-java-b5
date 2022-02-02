package day17;

public class StrTrim {
	public static void main(String[] args) {
		// strim() - it removes white spaces around the string value and returns it.
		String str = "   orange              ";
		System.out.println(str);
		System.out.println(str.length());
		
		str = str.trim();
		System.out.println(str);
		System.out.println(str.length());
		
		if (str.equals("orange")) {
			System.out.println("test pass");
		} else {
			System.out.println("test failed");
		}
	}
}
