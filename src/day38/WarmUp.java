package day38;

import java.util.LinkedHashSet;
import java.util.Set;

public class WarmUp {
	public static void main(String[] args) {
		// Set and its implementations
		// What's Set in Java and what are implementations of set do you know?
		// Set is of the data structures in Java collections that doesn't allow duplicates
		// HashSet:
		//  - does not allow duplicates
		//  - it doesn't maintain insertion order
		// LinkedHashSet:
		//  - does not allow duplicates
		//  - it maintains insertion order
		// TreeSet:
		//  - does not allow duplicates
		//  - it keeps elements in sorted order
		
		// Queue
		// FIFO - First In, First Out 
		
		// Stack
		// LIFO - Last In, First Out
		
		System.out.println(remDupSet("aaaaa")); // a
		System.out.println(remDupSet("apple")); // aple
		System.out.println(remDupSet("hello")); // helo
		System.out.println(remDupSet("eeetttte")); // et	
	}
	/*
	 * 1. Create Set
	 * 2. Add each char of String to the Set
	 * 3. Create new String and append each char from set to this String
	 * 4. Return that new string
	 */
	public static String remDupSet(String str) {
		Set<Character> set = new LinkedHashSet<>();

		for (char ch : str.toCharArray()) {
			set.add(ch);
		}
		
		String noDupStr = "";
		for (char ch : set) {
			noDupStr += ch;
		}
		
		return noDupStr;
	}
}



