package day21;

public class ReverseStr {
	public static void main(String[] args) {
		//            01234
		String str = "apple";
		String strRev = "";
		
		// write code here so strRev will have reverse version of str
		
		//       4                     -1 >= 0 -> false
		for (int i = str.length() - 1; i >= 0; i--) {
			//   a               0
			char ch = str.charAt(i);
			
			//"elppa" = 
			strRev = strRev + ch;
		}
		
		System.out.println(str); // apple
		System.out.println(strRev); // elppa
		System.out.println("------------------");
		
		System.out.println(revStr("apple")); // elppa
		System.out.println(revStr("hello")); // olleh
		
	}
	
	/*
	 * write code that will return reverse version of str
	 * 1. Create empty variable to store reverse version of str
	 * 2. Go over your str from the back inside the loop
	 * 3. Assign each char inside the loop to new variable for rev version
	 * 4. Return reverse version.
	 */
	public static String revStr(String str) {
		// Create empty variable to store reverse version of str
		String revStr = "";
		
		// Go over your str from the back inside the loop
		for (int i = str.length() - 1; i >= 0; i--) {
	
			// Assign each char inside the loop to new variable for rev version
			revStr += str.charAt(i);
		}
		
		// Return reverse version.
		return revStr;
	}
}
