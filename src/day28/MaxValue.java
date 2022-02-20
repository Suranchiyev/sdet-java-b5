package day28;

public class MaxValue {
	public static void main(String[] args) {
		int[] inputArr = {100, 43, 235, 3};
		System.out.println(max(inputArr)); // 235
		System.out.println(max2(inputArr)); // 235
		

	}
	
	public static int max2(int[] arrNum) {	
		// assume first element is biggest
		int biggest = arrNum[0]; // 100
		
		// check assumption
		for (int num : arrNum) {
			// if we found bigger number update biggest
			if (biggest < num) {
				biggest = num;
			}
		}
		
		return biggest;
	}
	
	/*
	 * Brute force solution
	 * return biggest value from array arrNum
	 * max([100, 43, 235, 3]) -> 235
	 * max([4, 2, 1, 29, 7])  -> 29 
	 */
	public static int max(int[] arrNum) {

		for (int i = 0; i < arrNum.length; i++) {						
			boolean isBiggest = true;
			
			for (int j = i + 1; j < arrNum.length; j++) {
				if (arrNum[i] < arrNum[j]) {
					isBiggest = false;
				}
			}
			
			if (isBiggest) {
				return arrNum[i];
			}
		}
		
		return 0;
	}
}
