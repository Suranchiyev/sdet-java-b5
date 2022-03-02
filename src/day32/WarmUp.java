package day32;

import java.util.Arrays;

public class WarmUp {
	public static void main(String[] args) {
		int[] res = sumOfTwo(new int [] {1, 2, 3, 4, 5}, 4);
		System.out.println(Arrays.toString(res)); // [1, 3]
		
		res = sumOfTwo(new int [] {7, 7, 4, 3, 8}, 7);
		System.out.println(Arrays.toString(res)); // [4, 3]
		
		res = sumOfTwo(new int [] {9, 8, 12, 3}, 12);
		System.out.println(Arrays.toString(res)); // [9, 3]
		
		res = sumOfTwo(new int [] {1, 2, 2, 1}, 5);
		System.out.println(Arrays.toString(res)); // [0, 0]
		// BREAK TILL 8:10PM EST
	}
	
	/* 
	 * sumOfTwo([1, 2, 3, 4, 5], 4); -> [1, 3]
	 * sumOfTwo([7, 7, 4, 3, 8], 7); -> [4, 3]
	 * sumOfTwo([9, 8, 12, 3], 12); -> [9, 3]
	 * sumOfTwo([1, 2, 2, 1], 5); -> [0, 0]
	 */
	public static int[] sumOfTwo(int[] arr, int target) {
		//        0  1  2  3  4
		// arr = [7, 7, 4, 3, 8]
		// target = 7
		// 4 + 3 => 7 == 7
		
		int[] res = new int[2]; // [4, 3]
		
		//              2 < 5
		for (int i = 0; i < arr.length; i++) {
			//       3          3 < 5
			for (int j = i + 1; j < arr.length; j++) {
				
				//   arr[2] + arr[3] == 7
				if ((arr[i] + arr[j]) == target) {
					// 
					res[0] = arr[i];
					res[1] = arr[j];
					return res;
				}
			}
		}
		
		return res;
	}
}





