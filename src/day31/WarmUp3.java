package day31;

import java.util.Arrays;

public class WarmUp3 {
	public static void main(String[] args) {
		// given these two arrays
		String[] arrayOne = {"One", "Two", "Three", "Four", "Five"};
		System.out.println("Array one: " + Arrays.toString(arrayOne));
		
		String[] arrayTwo = {"Six", "Seven", "Eight", "Nine"};
		System.out.println("Array two: " + Arrays.toString(arrayTwo));
		
		// TODO
		// We have two array. Can you create another array that will hold values of above two arrays?	
		// 1. Create new array that can hold elements from both arrays.
		// 2. Assign values from two array to the new array.
		String[] arrayThree = new String[arrayOne.length + arrayTwo.length];
		
		// [One, Two, Three, Four, Five]
		//   0    1       2     3
		// [Six, Seven, Eight, Nine]
		//  0     1    2      3      4    5    6      7     8
		// [One, Two, Three, Four, Five, Six, Seven, Eight, Nine]
		int fillUpIndex = 0;
		//              5 < 5
		for (int i = 0; i < arrayOne.length; i++) {
			//             4        =          4 
			arrayThree[fillUpIndex] = arrayOne[i];
			fillUpIndex++;
		}
		System.out.println(fillUpIndex); // 5
		
		//              4 < 4
		for (int i = 0; i < arrayTwo.length; i++) {
			//              9                  4
			arrayThree[fillUpIndex] = arrayTwo[i];
			fillUpIndex++;
		}
		
		// [One, Two, Three, Four, Five, Six, Seven, Eight, Nine]
		System.out.println("Array three: "+ Arrays.toString(arrayThree));
	}
}
