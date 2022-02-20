package day28;

import java.util.Arrays;

public class ArrRef2 {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4};
		int[] numbers2 = numbers;
		
		
		numbers[0] = 100;
		
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(numbers2));
		
		int[] iArr = {7, 7, 7};
		chArr(iArr);
		System.out.println(Arrays.toString(iArr));
	}
	
	public static void chArr(int[] arr) {
		// arr = iArr;
		arr[0] = -999;
	}
}
