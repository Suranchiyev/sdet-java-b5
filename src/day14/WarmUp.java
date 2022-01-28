package day14;

public class WarmUp {
	public static void main(String[] args) {
		System.out.println(getNumStr(1)); // One
		System.out.println(getNumStr(3)); // Three
		System.out.println(getNumStr(5)); // Five
		System.out.println(getNumStr(6)); // Not supported
		
	}
	
	/* 
	 * Return string version of number from 1-5 inclusive.
	 * getNumStr(1) -> "One"
	 * getNumStr(3) -> "Three"
	 * getNumStr(5) -> "Five"
	 * getNumStr(6) -> "Not supported"
	 */
	public static String getNumStr(int number) {
		switch (number) {
		case 1:
			return "One";
		case 2:
			return "Two";
		case 3:
			return "Three";
		case 4:
			return "Four";
		case 5:
			return "Five";
		default:	
			return "Not supported";
		}
	}
}
