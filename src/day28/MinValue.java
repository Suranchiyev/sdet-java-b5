package day28;

public class MinValue {
	public static void main(String[] args) {
		int[] arrInput = {100, 1, 43, 235, 3};
		System.out.println(min(arrInput));
	}
	
	/*
	 * Return smallest value from arrNum
	 * min([100, 43, 235, 3]) -> 3
	 * min([100, 1, 43, 235, 3]) -> 1
	 */
	public static int min(int[] arrNum) {
		int smallest = arrNum[0];
		  
		for (int num : arrNum) {
			if(smallest > num) {
				smallest = num;
			}
		}
		
		return smallest;
	}
}
