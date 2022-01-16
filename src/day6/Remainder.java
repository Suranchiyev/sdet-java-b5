package day6;

public class Remainder {
	public static void main(String[] args) {
		// % - remainder operator / mod operator
		
		int num = 10;
		int num1 = 3;
		System.out.println(num / num1); // 3
		
		System.out.println(num % num1); // 1
		
		// 12 / 10 = 1 and 2 remains
		System.out.println(12 % 10); // 2
		
		// 22 / 10 = 2
		// 22 % 10 = 2
		System.out.println(22 % 10); // 2
		
		// 27 / 10 = 2
		System.out.println(27 % 10); // 7
		// 18 % 5
		// 18 / 5 => 3
		// 18 - 15 = 3
		// 18 -> 5 + 5 + 5 => 15 => 3
		System.out.println(18 % 5); // 3
		System.out.println(234 % 100); // 34
		// 23x -> 4
		System.out.println(234 % 10); // 4
		
		// TODO
		System.out.println(45 % 5); // 0
		System.out.println(47 % 5); // 2
		System.out.println(47 % 20); // 7
		System.out.println(1001 % 1000); // 1
		System.out.println(12 % 9); // 3
		System.out.println(117 % 10); // 7
		System.out.println(17 % 10); // 7
		System.out.println(134 % 100); // 34
		System.out.println(4 % 2); // 0
		
		System.out.println("======");
		System.out.println(2 % 4); // 2
		System.out.println(5 % 27); // 5
		System.out.println(4 % 9); // 4
	}
}
