package day29;

import java.util.Arrays;

public class StrAndChars {
	public static void main(String[] args) {
		String str = "hello";
		
		// [h] [e] [l] [l] [o]
		char[] chArr = new char[5];
		
		for (int i = 0; i < str.length(); i++) {
			chArr[i] = str.charAt(i);
		}
		System.out.println(Arrays.toString(chArr));
		System.out.println("-----------");
		
		// for each loop iterates over the array by getting each element
		for (char ch : chArr) {
			System.out.println(ch);
		}
		System.out.println("----------");
		
		String str2 = "John Doe";
		char[] chArr2 = str2.toCharArray();
		
		System.out.println(str2); // John Doe
		System.out.println(Arrays.toString(chArr2)); // [J, o, h, n,  , D, o, e]
		
		System.out.println(chArr2[5]); // D
	}
}
