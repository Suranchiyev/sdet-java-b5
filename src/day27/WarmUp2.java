package day27;

public class WarmUp2 {
	public static void main(String[] args) {
		int[] nums = {1, 3, 4, 5, 9};
		System.out.println(isSevenThere(nums)); // false
		
		nums = new int[] {2, 5, 7, 8, 10, 11};
		System.out.println(isSevenThere(nums)); // true
		
		nums = new int[] {7, 2, 3};
		System.out.println(isSevenThere(nums)); // true
	}
	
	/*
	 * return true if argument arrNum has 7
	 * isSevenThere([1, 3, 4, 5, 9])      -> false
	 * isSevenThere([2, 5, 7, 8, 10, 11]) -> true
	 * isSevenThere([7, 2, 3])            -> true
	 */
	public static boolean isSevenThere(int[] arrNum) {
		// your code goes here
		// 1. Using for loop go over each element of array
		// 2. Check if element is 7, if yes return true otherwise keep checking next
		//    elements.
		// 3. After the loop if seven wasn't there return false.
		
		for (int i = 0; i < arrNum.length; i++) {
			if (arrNum[i] == 7) {
				return true;
			}
		}
		
		return false;
	}
}
