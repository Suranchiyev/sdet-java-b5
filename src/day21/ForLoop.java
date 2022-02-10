package day21;

public class ForLoop {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {		
			if (i == 3) {
				break; // it will exit from the loop.
			}
			
			System.out.print(i + " ");
		}
		System.out.println();
		
		// print numbers from 1 to 100
		// but by skipping 7, 13, 99
		for (int i = 1; i <= 100; i++) {
			
			if (i == 7 || i == 13 || i == 99) {
				continue; // it will skip rest of the code for this iteration
			}
			
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("--------");
		
		String str = "J%oh$$n D%o$e%";
		// TODO print each char of str one by one in new lines.
		// skip special chars - %, $
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if (ch == '%' || ch == '$') {
				continue;
			}
			System.out.println(ch);
		}
	}
}






