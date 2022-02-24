package day29;

import java.util.Arrays;

public class StrSplit {
	public static void main(String[] args) {
		// split(by) it will split String into the array based on splitter
		
		String str = "Java 101 for SDET 2022";
		
		String[] words = str.split(" ");
		
		System.out.println(Arrays.toString(words));
		System.out.println(words[0]); // Java
		System.out.println(words[words.length - 1]); // 2022
		
		String[] parts = str.split("for");
		System.out.println(parts.length); // 2
		System.out.println(parts[0]); // Java 101
		System.out.println(parts[1]); //  SDET 2022
		
		str = "Java, python, php, python, abc"; 
		
		String[] arr = str.split(",");
		System.out.println(arr[2]);
		System.out.println(Arrays.toString(arr));
		
		String[] arr2 = str.split(", python, ");
		System.out.println(arr2.length); // 3
		System.out.println(arr2[0]); // Java, 
		System.out.println(arr2[1]); // , php,
		
		String[] arr3 = str.split(":");
		// if string does not contain the splitter the whole string 
		// will assigned as first element of array.
		System.out.println(arr3.length);
		System.out.println(Arrays.toString(arr3));
		System.out.println(arr3[0]);
	}
}
