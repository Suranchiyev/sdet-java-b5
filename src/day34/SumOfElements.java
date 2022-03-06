package day34;

import java.util.ArrayList;
import java.util.Random;

public class SumOfElements {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		// generate the data for our list
		for (int i = 0; i < 1000; i++) {
			int rNum = new Random().nextInt(100);
			list.add(rNum);
		}
		
		System.out.println(list);
		
		int sum = 0;
		int average = 0;		
		
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		
		average = sum / list.size();
		
		System.out.println("The sum: " + sum);
		System.out.println("Average: " + average);
	}
}
