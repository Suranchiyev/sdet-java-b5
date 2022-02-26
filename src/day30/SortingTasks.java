package day30;

import java.util.Arrays;

public class SortingTasks {
	public static void main(String[] args) {
		System.out.println(isAnagram("abc", "bca")); // true
		System.out.println(isAnagram("triangle", "integral")); // true
		System.out.println(isAnagram("hello", "heelo")); // false
		System.out.println(isAnagram("aaa", "a")); // false
		System.out.println(isAnagram("a", "aa")); // false
		System.out.println("--------------");
		
		int[] numArr = {4, 3, 2, 8, 9, 5};
		System.out.println(maxN(numArr, 1)); // 9
		System.out.println(maxN(numArr, 2)); // 8
		System.out.println(maxN(numArr, 3)); // 5
		System.out.println(maxN(numArr, 100)); // 0
	}
	
	/*
	 * maxN([4, 3, 2, 8, 9, 5], 1);   -> 9
	 * maxN([4, 3, 2, 8, 9, 5], 2);   -> 8
	 * maxN([4, 3, 2, 8, 9, 5], 3);   -> 5
	 * maxN([4, 3, 2, 8, 9, 5], 100); -> 0
	 * 1. handle negative case
	 * 2. sort array
	 * 3. return n biggest by using array length and n
	 */
	public static int maxN(int[] arr, int n) {
		if (n > arr.length || n < 1) {
			return 0;
		}
		
		Arrays.sort(arr);
		
		//  0  1  2  3  4  5
		// [2, 3, 4, 5, 8, 9]
		return arr[arr.length - n];
	}
	
	/*
	 * isAnagram("abc", "bca"); -> true
	 * isAnagram("triangle", "integral"); -> true
	 * isAnagram("hello", "heelo"); -> false
	 * isAnagram("aaa", "a"); -> false
	 * isAnagram("a", "aa"); -> false
	 * 
	 * 1. sort both strings
	 * 2. compare them
	 */
	public static boolean isAnagram(String str, String str1) {
		if (str.length() != str1.length()) {
			return false;
		}
		
		char[] strArr = str.toCharArray(); // [a, b, c]
		char[] strArr1 = str1.toCharArray(); // [b, c, a]
		
		Arrays.sort(strArr); // [a, b, c]
		Arrays.sort(strArr1); // [a, b, c]
		
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i] != strArr1[i]) {
				return false;
			}
		}
		return true;
	}
 }
