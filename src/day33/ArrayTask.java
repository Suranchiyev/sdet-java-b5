package day33;

import java.util.Arrays;

public class ArrayTask {
	public static void main(String[] args) {
		String[] input = {"one", "two", "three"};
		System.out.println(Arrays.toString(getLength(input))); // [3, 3, 5]
		
		input = new String[]{"apple", "java", "abc", "e"};
		System.out.println(Arrays.toString(getLength(input))); // [5, 4, 3, 1]
		
		input = new String[]{"a","b"};
		System.out.println(Arrays.toString(getLength(input))); // [1, 1]
	}
	
	/*
	 * getLength(["one", "two", "three"]) -> [3, 3, 5]
	 * getLength(["apple", "java", "abc", "e"]) -> [5, 4, 3, 1]
	 * getLength(["a","b"]) -> [1, 1]
	 */
	public static int[] getLength(String[] arr) {
		int[] res = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			res[i] = arr[i].length();
		}
		
		return res;
	}
}




