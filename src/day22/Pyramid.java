package day22;

import java.util.Scanner;

public class Pyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int number = sc.nextInt();
		
		String pyramid = "#";	
		for (int i = 0; i < number; i++) {
			System.out.println(pyramid);
			pyramid = pyramid + "#";
		}
		
		pyramid = pyramid.substring(0, pyramid.length() - 2);
		
		for (int i = 0; i < number - 1; i++) {
			System.out.println(pyramid);
			pyramid = pyramid.substring(0, pyramid.length() - 1);
		}
		
		// TODO 
		// that will add half decreasing pyramid
		// 2
		// #
		// ##
		// #
		
		// 3
		// #
		// ##
		// ###
		// ##
		// #
		
	}
}
