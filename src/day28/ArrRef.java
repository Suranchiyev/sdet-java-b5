package day28;

import java.util.Arrays;

public class ArrRef {
	public static void main(String[] args) {
		String[] arrStr = {"a", "b", "c"};
		String[] arrStr2 = arrStr;
		
		arrStr2[0] = "e";
		
		System.out.println(Arrays.toString(arrStr)); // e, b, c
		System.out.println(Arrays.toString(arrStr2));  // e, b, c
		
		System.out.println(arrStr);
		System.out.println(arrStr2);
		
		arrStr[2] = "x";
		System.out.println(Arrays.toString(arrStr)); // [e, b, x]
		System.out.println(Arrays.toString(arrStr2));  // [e, b, x]
		System.out.println("----------");
		
		int num = 17;
		changeNum(num);
		System.out.println(num); // 17
		
		String str = "apple";
		changeStr(str);
		System.out.println(str); // apple
		
		System.out.println("-----------");
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(arr));
		changeArr(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void changeArr(int[] numArr) {
		// numArr = arr;
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = 7;
		}
	}
	
	public static void changeNum(int i) {
		i = 10;
	}
	
	public static void changeStr(String str) {
		// str = str
		str = "orange";
	}
	
}
