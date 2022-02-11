package day22;

public class CountChars {
	 public static void main(String[] args) {
		 System.out.println(coutnCh("apple", 'a'));  // 1
		 System.out.println(coutnCh("oooopps", 'o')); // 4
		 System.out.println(coutnCh("john", 'x')); // 0
	 }
	 
	 /*
	  * return number ch in str
	  * 
	  * countChar("apple", 'a')   -> 1
	  * countChar("apple", 'p')   -> 2
	  * countChar("hello", 'l')   -> 2
	  * countChar("oooopps", 'o') -> 4
	  * 
	  */
	 public static int coutnCh(String str, char ch) {
		 int counter = 0;
		 for (int i = 0; i < str.length(); i++) {
			 char singleChar = str.charAt(i);
			 if (singleChar == ch) {
				 counter++;
			 }
		 }
		 
		 return counter;
	 }
	 
	 
}
