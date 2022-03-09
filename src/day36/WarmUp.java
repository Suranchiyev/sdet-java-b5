package day36;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WarmUp {
	public static void main(String[] args) {
		System.out.println(reverseEach(Arrays.asList("abc", "apple", "spoon"))); //["cba", "elppa", "noops"]
		System.out.println(reverseEach(Arrays.asList("car", "java", "red"))); // ["rac", "avaj", "der"]
		System.out.println(reverseEach(Arrays.asList("bmw", "audi", "honda", "tesla"))); // ["wmb", "idua", "adnoh", "alset"]
		
	}
	
	/*
	 * return new list that has reversed version of each element of argument list
	 * 
	 * reverseEach(["abc", "apple", "spoon"]) -> ["cba", "elppa", "noops"]
	 * reverseEach(["car", "java", "red"])    -> ["rac", "avaj", "der"]
	 * reverseEach(["bmw", "audi", "honda", "tesla"]) -> ["wmb", "idua", "adnoh", "alset"]
	 */
	public static List<String> reverseEach(List<String> list) {
		// 1. Create new revList
		// 2. loop over the list argument
		// 3. reverse each element and add to revList
		// 4. return revList
		
		List<String> revList = new ArrayList<>();
		for (int j = 0; j < list.size(); j++) {
			
			String str = list.get(j);
			
			String revStr = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				revStr += str.charAt(i);
			}
			
			revList.add(revStr);
			
		}
		
		return revList;
	}
}











