package day21;

public class ForLoopStr {
	public static void main(String[] args) {
		printChars("Java"); 	
		System.out.println("----");
		printChars("Apple");
		System.out.println("----");
		printChars("Hello World");
		
		System.out.println("-----");
		printCharsReverse("Java");
		System.out.println("-----");
		
		System.out.println(countA("Java")); // 2
		System.out.println(countA("Argentina")); // 2
		System.out.println(countA("apple")); // 1
		System.out.println(countA("kiwi")); // 0
		System.out.println(countA("AAAaaA")); // 6
	}
	
	/*
	 * Let's say 'a' and 'A' is special char
	 * Find out how many 'a' and 'A' in the str argument
	 * and return that number
	 * 
	 * 1. Create a numeric variable that should hold the count
	 * 2. Loop over str string and check if char is 'A' or 'a'
	 * 3. if yes increase your count by one
	 * 4. if not just go to the next char
	 * 5. After the loop return result count.
	 * 
	 */
	public static int countA(String str) {
		// variable for storing count of 'A' and 'a'
		int count = 0;
		
		// go over the str and get each char one by one
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'A' || ch == 'a') {
				count++;
			}			
		}
		
		return count;
	}
	
	/*
	 * print each char of str argument in reverse order in the new lines
	 */
	public static void printCharsReverse(String str) {
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.println(str.charAt(i));
		}
	}
	
	/*
	 * print each char of str argument in the new line
	 * for loop
	 * charAt(i)
	 */
	public static void printChars(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}
}
