package day26;

public class Fruit {
	public static void main(String[] args) {
		// int[] score = new int[5];
		
		String[] fruit = new String[4];
		fruit[0] = "orange";
		fruit[1] = "kiwi";
		fruit[2] = "banana";
		fruit[3] = "apple";
		//      0          1        2         3
		// {["orange"] ["kiwi"] ["banana"] ["apple"]}
		
		String str = fruit[2];
		System.out.println(str); // banana
		// [String] [String] [String] [String]
		// we can treat each element as single variable of array type.
		
		// reassign third element with "cherries"
		fruit[2] = "cherries";
		System.out.println(fruit[2]); // cherries
		
		// TODO 
		// reassign first element to upper case version of it.
		fruit[0] = fruit[0].toUpperCase();
		
		System.out.println(fruit[0]); // ORANGE
	}
}











