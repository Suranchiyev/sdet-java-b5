package day30;

public class LinearSearch {
	public static void main(String[] args) {
		//                       0      1       2       3        4
		String[] arrNumbers = {"one", "two", "three", "four", "five"};
		
		System.out.println(lSearch(arrNumbers, "two")); // 1
		System.out.println(lSearch(arrNumbers, "five")); // 4
		System.out.println(lSearch(arrNumbers, "six")); // -1
	}
	
	public static int lSearch(String[] arr, String target) {
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(target)) {
				return i;
			}
		}
		
		return -1;
	}
}
