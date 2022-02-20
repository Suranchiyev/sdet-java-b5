package day28;

public class WarmUp {
	public static void main(String[] args) {
		int[] inputArr = {1, 2, 3, 4, 5, 6};
		System.out.println(sumOfEven(inputArr)); // 12
		
		int[] inputArr2 = {1, 2};
		System.out.println(sumOfEven(inputArr2)); // 2
		
		int[] inputArr3 = {1, 3, 5};
		System.out.println(sumOfEven(inputArr3)); // 0	
	}
	
	/*
	 * return sum of even numbers from arrNum
	 * sumOfEven([1, 2, 3, 4, 5, 6]) -> 12
	 * sumOfEven([1, 2]) -> 2
	 * sumOfEven([1, 3, 5]) -> 0
	 */
	public static int sumOfEven(int[] arrNum) {
		int sumOfEven = 0;

		for(int num : arrNum) {
			if (num % 2 == 0) {
				sumOfEven += num;
			}
		}
		
		return sumOfEven;
	}
}





