package day34;

import java.util.Arrays;
import java.util.ArrayList;

public class Numbers {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(arr));
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		
		ArrayList<Character> listChars = new ArrayList<>();
		listChars.add('a');
		listChars.add('b');
		listChars.add('c');
		System.out.println(listChars);
	}
}
