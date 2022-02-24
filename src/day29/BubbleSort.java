package day29;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] num = {6, 3, 2, 10, 0, 7, 5};
		System.out.println(Arrays.toString(num)); // [6, 3, 2, 10, 0, 7, 5]
		
		sortArray(num);
		System.out.println(Arrays.toString(num)); // [0, 2, 3, 5, 6, 7, 10]
	}
	
	public static void sortArray(int[] num) {	
		int swapCount = -1;
		int len = num.length;

		while (swapCount != 0) {
			swapCount = 0;
			len--;

			for (int i = 0; i < len; i++) {
				if (num[i] > num[i + 1]) {
					
					int tmp = num[i];
					num[i] = num[i + 1];
					num[i + 1] = tmp;
					
					swapCount++;
				}
			}			
		}
	}
}
