package day20;

public class ForLoop2 {
	public static void main(String[] args) {
		// TODO
		// can you write the program that will print 5 times
		// "Java is awesome!" by using for loop.
		for (int i = 0; i < 5; i++) {
			System.out.println("Java is awesome!");
		}
		System.out.println("-------");
		
		// TODO
		// write the program that will print number from 1 to 100 inclusive 
		// in the same line by using for loop
		// 1 2 3 4 5 6 7 8 9 10 11
		// System.out.print(i + " ");
		
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("---------");
		
		// TODO 
		// write the program that will print numbers from 100 to 1 inclusive
		// in the same line by using for loop.
		// 100 99 98 97 96 95 ...
		for (int i = 100; i >= 1; i--) {
			System.out.print(i + " ");
		}
		
	}
}
