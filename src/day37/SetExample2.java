package day37;

import java.util.Set;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample2 {
	public static void main(String[] args) {
		// LinkedHashSet
		// it doesn't allow duplicates
		// It does maintain insertion order
		
		Set<Integer> numbers = new LinkedHashSet<>();
		numbers.add(5);
		numbers.add(3);
		numbers.add(2);
		numbers.add(5); // duplicate
		numbers.add(3); // duplicate
		numbers.add(9); 
		
		System.out.println(numbers); // [5, 3, 2, 9]
		
		Set<String> names = new LinkedHashSet<>();
		names.add("Alex");
		names.add("Kuba");
		names.add("John");
		names.add("Bek");
		names.add("Ramesh");
		names.add("Kuba");
		System.out.println(names); // [Alex, Kuba, John, Bek, Ramesh]
		
		System.out.println("---- TREE SET ----");
		// TreeSet
		// it doesn't allow duplicates.
		// it keeps elements in the sorted order.
		Set<Integer> numbers2 = new TreeSet<>();
		numbers2.add(8);
		numbers2.add(4);
		numbers2.add(1);
		numbers2.add(-99);
		numbers2.add(5);
		numbers2.add(100);
		System.out.println(numbers2);
		
		Set<String> names2 = new TreeSet<>();
		names2.add("Ramesh");
		names2.add("Kuba");
		names2.add("Alex");
		names2.add("Bek");
		names2.add("Azamat");
		names2.add("Kuba");
		System.out.println(names2);		
	}
}





