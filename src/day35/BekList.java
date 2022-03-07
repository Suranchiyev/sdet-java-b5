package day35;

import java.util.Arrays;

public class BekList {
	private int[] arr = new int[10];
	private int index = 0;
	
	public void add(int num) {
		if (index > arr.length - 1) {
			int[] arrCopy = arr;
			arr = new int[arr.length * 2];
			
			for (int i = 0; i < arrCopy.length; i++) {
				arr[i] = arrCopy[i];
			}
			
		} else {
			arr[index++] = num;
		}
	}
	
	public int get(int i) {
		return arr[i];
	}
	
	public int size() {
		return arr.length;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < index; i++) {
			
			sb.append(arr[i]).append(", ");
		}
		return sb.substring(0, sb.length() - 2) +"]";
		
	}
}
