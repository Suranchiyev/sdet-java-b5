package day37;

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetExample {
	public static void main(String[] args) {
		// Set does not allow duplicates
		// HashSet does not maintain insertion order
		
		// we are using Set with HashSet implementation
		Set<Integer> numbers = new HashSet<>();
		numbers.add(3);
		numbers.add(4);
		numbers.add(3);
		numbers.add(2);
		numbers.add(1);
		numbers.add(2);
		numbers.add(0);
		numbers.add(-99);
		numbers.add(900);
		
		System.out.println(numbers);
		System.out.println("----------");
		
		// HashSet doesn't maintain insertion order. It maintains order of elements based its hashing 
		// algorithm.
		// duplicates didn't show up
		
		// System.out.println(numbers.get(0)); // Set doesn't have get(index) method
		
		// we cannot use regular loop with indexes to go over the set elements
		// we have to use for each loop or iterator.
		for (int num : numbers) {
			System.out.println(num);
		}
		
		Set<String> names = new HashSet<>();
		names.add("John");
		names.add("Alex");
		names.add("Kuba");
		names.add("Alex");
		names.add("john");
		
		if (names.contains("Alex")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		System.out.println(names);
		names.remove("john");
		System.out.println(names);
	}
}







