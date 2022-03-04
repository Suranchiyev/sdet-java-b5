package day33;

public class Varargs {
	public static void main(String[] args) {
		System.out.println("Sum 1: " + sum(5, 6));
		
		System.out.println("Sum 2: " + sum(5, 6, 7));
		
		int[] inputArr = {5, 6, 7, 8};
		System.out.println("Sum 3: " + sum(inputArr));
		
		System.out.println("Sum 4: " + sum(1, 5, 4, 3));
	}
	
	public static int sum(int... nums) {
		// we work with varars exactly as with arrays
		// System.out.println("Varargs size: " + nums.length);
		// System.out.println("Print first: " + nums[0]);
		int s = 0;
		for (int num : nums) {
			s += num;
		}
		return s;
	}
	
//	public static int sum(int i, int i2) {
//		return i + i2;
//	}
//	
//	public static int sum(int i, int i2, int i3) {
//		return i + i2 + i3;
//	}
//	
//	public static int sum(int[] arr) {
//		int s = 0;
//		for (int num : arr) {
//			s += num;
//		}
//		return s;
//	}
}
