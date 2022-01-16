package day8;

public class Review {
	public static void main(String[] args) {
		// primitives compatibility + type casting
		// byte -> short -> int -> long -> float -> double		
		int num = 99;
		long lNum = num;
		double dNum = lNum;
		
		// type casting
		long lNum2 = 10000;
		int num2 = (int)lNum2;
		
		double dNum2 = 129.999;
		int num3 = (int)dNum2; 
		// all decimal points after the whole number will get 
		// truncated.
		System.out.println(num3); // 129
		System.out.println("-------------");
		
		int age = 10;
		System.out.println(age); // 10
		//  =  10 + 5
		age = age + 5;
		
		System.out.println(age); // 15
		
		age += 5;
		System.out.println(age); // 20
		
		age += 2;
		age -= 7;
		
		age *= 3;
		age = age * 3;
		System.out.println("---------");
		
		// increment and decrement
		age = 2;
		age++;
		System.out.println(age); // 3
		
		age--;
		System.out.println(age); // 2
		
		++age;
		System.out.println(age); // 3
		
		--age;
		System.out.println(age); // 2
		
		System.out.println("-----------");
		age = 2;
		System.out.println(age++); // 2
		System.out.println(age); // 3
		
		System.out.println(++age); // 4
	}
}

