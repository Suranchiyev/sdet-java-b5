package day22;

public class WarmUp {
	public static void main(String[] args) {
		System.out.println(reverseStr("john"));  // nhoj
		System.out.println(reverseStr("test"));  // tset
		System.out.println(reverseStr("apple")); // elppa
		System.out.println("---------");
		
		System.out.println(isPalindrome("civic")); // true
		System.out.println(isPalindrome("Anna"));  // true
		System.out.println(isPalindrome("level")); // true
		System.out.println(isPalindrome("hello")); // false
	
	}
	
	/*
	 * Palindrome word is when we read same from the left to right and from right to left
	 * 1. Get reverse version of str argument
	 * 2. Compare reverse version with original str
	 *    if they are equal then it is palindrome(return true), 
	 *    otherwise it is not(return false)
	 *  
	 * isPalindrome("civic") -> true
	 * isPalindrome("anna")  -> true
	 * isPalindrome("level") -> true
	 * isPalindrome("hello") -> false
	 * isPalindrome("john")  -> false
	 */
	public static boolean isPalindrome(String str) {
		str = str.toLowerCase();
		
		String rev = "";
		
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		
		return rev.equals(str);
	}
	
	/*
	 * Return reverse version of argument str
	 * reverseStr("john")  -> "nhoj"
	 * reverseStr("test")  -> "tset"
	 * reverseStr("apple") -> "elppa"
	 */
	public static String reverseStr(String str) {
		String revRes = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revRes += str.charAt(i);
		}
		return revRes;
	}
}
