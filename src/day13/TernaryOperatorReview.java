package day13;

import java.util.Random;

public class TernaryOperatorReview {
	public static void main(String[] args) {
		int i = 5;
		int i2 = 3;
		//        condition ? valueIfTrue : valueIfFalse
		String str = i > i2 ?     "apple" : "banana";
		
		System.out.println("str: " + str);
		
		int res = false ? 100 : 1;
		System.out.println("res: " + res); // res: 1
		
		//        generates random numbers from 0 till 100
		int num = new Random().nextInt(101);
		String isEven = num % 2 == 0 ? "Yes" : "No";
		System.out.println(num + " is even: " + isEven);
	}
}
