package day21;

public class WarmUp {
	public static void main(String[] args) {
		//              10 < 10; i++
		for (int i = 0; i < 10; i++) {
			//                 9. Tue class.
			System.out.println(i + ". Tue class.");
		}
		System.out.println("--------");
		
		int count = 0;

		for (; count < 5; count+=2) {
			System.out.println("hello");
		}
		
		System.out.println("----------");
		//                 98 <= 122
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(ch + " ");
		}
		System.out.println();
		
	}
}
