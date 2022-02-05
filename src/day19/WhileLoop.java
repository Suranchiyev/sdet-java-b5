package day19;

public class WhileLoop {
	public static void main(String[] args) {
		// print 30 times "Java is great!"
		
		// it will keep looping while condition is true 
		// when it is false it will exit.
		
		int count = 0;
		//        30 < 30 
		while (count < 30) {			
			System.out.println(count + ". Java is great!");
			count++;
		}
	}
}
