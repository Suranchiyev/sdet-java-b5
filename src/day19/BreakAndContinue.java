package day19;

public class BreakAndContinue {
	public static void main(String[] args) {
		int count = 0;

		while (count < 10) {		
			System.out.println(count);
			count++;
			if (count == 7) {
				break;
			}
		}
		System.out.println("-----");
		int i = 0;
		//     1 < 10
		while (i < 10) {
			i++;
			
			if (i % 2 == 1) {	
				continue; // it skips rest of the code of loop body and goes to 
				// next iteration.
			}
			
			System.out.println(i);
		}
		
	}
}
