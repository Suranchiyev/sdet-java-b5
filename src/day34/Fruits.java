package day34;

import java.util.ArrayList;

public class Fruits {
	/*
	 * add(value)
	 * get(index)
	 * size() - size of list
	 */
	public static void main(String[] args) {
		// Create an ArrayList<String> fruits
		// add any 4 elements(fruit names)
		// print each value in the new line by using a loop
		
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("pear");
		fruits.add("kiwi");
		fruits.add("orange");
		System.out.println(fruits);
		
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		System.out.println("----------");
		
		// set(index, newValue);
		fruits.set(0, fruits.get(0).toUpperCase());
		System.out.println(fruits); // [APPLE, pear, kiwi, orange]
		
		System.out.println("----------");
		// Write a code to make all elements of list upper case.
		
		for (int i = 0; i < fruits.size(); i++) {
			fruits.set(i, fruits.get(i).toUpperCase());
		}
		
		System.out.println(fruits); // [APPLE, PEAR, KIWI, ORANGE]
	}
}





