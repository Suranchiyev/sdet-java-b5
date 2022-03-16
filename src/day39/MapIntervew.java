package day39;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapIntervew {
	public static void main(String[] args) {
		System.out.println(getLetterCount("hello")); // {h=1, e=1, l=2, o=1}
		System.out.println(getLetterCount("aaarrroooo")); // {a=3, r=3, o=4}
		System.out.println(getLetterCount("apple")); // {a=1, p=2, l=1, e=1}
		System.out.println("----------");
		
		
		System.out.println(getStrLetterCount("hello")); // h1e1l2o1
		System.out.println(getStrLetterCount("aaarrroooo")); // a3r3o4
		System.out.println(getStrLetterCount("apple")); // a1p2l1e1
		System.out.println(getStrLetterCount("qqwwqq")); // q4w2
	}
	
	/*
	 * getStrLetterCount("hello");      -> h1e1l2o1
	 * getStrLetterCount("aaarrroooo"); -> a3r3o4
	 * getStrLetterCount("apple");      -> a1p2l1e1
	 * getStrLetterCount("qqwwqq");     -> q4w2
	 * 
	 */
	public static String getStrLetterCount(String str) {
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if (map.containsKey(ch)) {
				int oldValue = map.get(ch);
				map.put(ch, oldValue + 1);
			} else {
				map.put(ch, 1);
			}
		}
		
		String res = "";
		for (Character key : map.keySet()) {   
			res += String.valueOf(key) + map.get(key);
		}
		
		return res;
	}
	
	/*
	 * getLetterCount("hello");      -> {h=1, e=1, l=2, o=1}
	 * getLetterCount("aaarrroooo"); -> {a=3, r=3, o=4}
	 * getLetterCount("apple");      -> {a=1, p=2, l=1, e=1}
	 */
	public static Map getLetterCount(String str) {
		Map<Character, Integer> map = new LinkedHashMap<>();	
		//           : [a,a,a,r,r,r,o,o,o,o]
		for (char ch : str.toCharArray()) {
            //{a=3, r=3, o=4}   'o'
			if (map.containsKey(ch)) {
				//     1          
				int oldCount = map.get(ch);
				//      'r',   1 + 1
				map.put(ch, oldCount + 1);
				
			} else {
				//     'o', 1
				map.put(ch, 1);
			}
		}
		
		return map;
	}
}




