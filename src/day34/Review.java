package day34;

public class Review {
	// Vararg
	public static void main(String[] args) {
		int res = multiply(2, 2);
		System.out.println("res: " + res);
		
		System.out.println("res2: " + multiply(1, 2, 3));
		
		int[] input = {1, 2, 3, 4, 5};
		System.out.println("res3: " + multiply(input));
	}
	// 1. Only one vararg per method argument.
	// 2. When vararg is used with other arguments. It should be last one.
	public static int multiply(int... nums) {
		int sum = nums[0];
		for (int i = 1; i < nums.length; i++) {
			sum *= nums[i];
		}
		return sum;
	}
}
