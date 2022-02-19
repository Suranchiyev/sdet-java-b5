package day27;

import java.util.Arrays;

public class ArrayTask {
	public static void main(String[] args) {
		String[] name = {"Isla", "Alex", "Olivia", "Aurora", "Cora", "Ang"};
		// TODO print all names in upper case in the new lines using loop
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i].toUpperCase());
		}
			
		System.out.println("----------------");
		
		byte[] score = {9, 8, 7, 5, 5, 6, 9, 10};
		// TODO find out and print average value from score array using loop.
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		System.out.println("Average value of score: " + (sum / score.length));
		
		System.out.println("----------------");
		
		//                     0    1    2    3
		double[] coordinate = {3.5, 5.9, 2.1, 1.9};
		// TODO print numbers from coordinate array in reverse order in the same line separated by comma
		// ex output: 1.9, 2.1, 5.9, 3.5
		for (int i = coordinate.length - 1; i >= 0; i--) {
			if (i == 0) {
				System.out.print(coordinate[i]);
			} else {
				System.out.print(coordinate[i] + ", ");
			}
		}
		
		System.out.println("\n----------------");
		
		int[] number = new int[100];
		// TODO assign values to array from 1 to 100 using loop
		
		for (int i = 0; i < 100; i++) {
			number[i] = i + 1;
		}
		
		System.out.println(Arrays.toString(number)); // [1, 2, 3, 4, 5, 6 ...]
		
		double[] arrNums = {1, 2, 3, 4, 5, 6};
		System.out.println(Arrays.toString(arrNums));
		System.out.println(Arrays.toString(getRevArr(arrNums)));
	}
	
	public static double[] getRevArr(double[] arr) {
		double[] revArr = new double[arr.length];
		int start = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			revArr[start++] = arr[i];
		}
		return revArr;
	}
}




