package day28;

import java.util.Arrays;

public class SwapValues {
	public static void main(String[] args) {
		String[] city = {"Aldie", "Arlington", "Tysons", "DC"};
		System.out.println(Arrays.toString(city)); // [Aldie, Arlington, Tysons, DC]
		
		swapFirstAndLast(city);
		System.out.println(Arrays.toString(city)); // [DC, Arlington, Tysons, Aldie]	
	}
	
	/*
	 * method swaps first and last element of array
	 */
	public static void swapFirstAndLast(String[] arrStr) {
		String tmp = arrStr[0];
		arrStr[0] = arrStr[arrStr.length - 1];
		arrStr[arrStr.length - 1] = tmp;
	}
}
