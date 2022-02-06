package day20;

public class InfiniteLoops {
	public static void main(String[] args) {
		
//		while (true) {
//			System.out.println("Hello, World!");
//		}
		
		int i = 0;
		//     0
		while (i < 100) {
			System.out.println("Hello, World!");
			i++;
		}
		
		System.out.println("The end");
	}
}
