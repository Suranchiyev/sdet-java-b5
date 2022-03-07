package day35;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AList {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>(10000);
	
		// Internally ArrayList is based on array
		// new ArrayList<>(50); we can specify the initial size of our list
		// By default ArrayList allocates array with size 10
		// and when we will keep adding new elements ArrayList will grow the size 
		// of internal array automatically.
		
		List<Integer> l2 = new ArrayList<>(Arrays.asList(5, 3, 2, 1));
		List<Integer> l3 = new ArrayList<>(l2);
		
		System.out.println(l2); // [5, 3, 2, 1]
		System.out.println(l3); // [5, 3, 2, 1]
		
		l3.add(7);
		
		System.out.println(l2); // [5, 3, 2, 1]
		System.out.println(l3); // [5, 3, 2, 1, 7]
	}
}
