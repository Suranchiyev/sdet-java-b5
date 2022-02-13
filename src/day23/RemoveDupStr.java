package day23;

public class RemoveDupStr {
	public static void main(String[] args) {
		System.out.println(removeDup("apple")); // aple
		System.out.println(removeDup("hello")); // helo
		System.out.println(removeDup("jjjaavvaa")); // jav	
	}
	
	/*
	 * return str without duplicates
	 * 1. using contains method
	 * 2. using Set collection.
	 * 
	 */
	public static String removeDup(String str) {
		// create variable to store no dup version
		String noDupStr = "";
		
		// loop over the str
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			// if noDupStr does not contain ch then append ch to noDupStr
			if (!noDupStr.contains(ch + "")) {
				noDupStr += ch;
			}
		}
		
		return noDupStr;
	}
}	
