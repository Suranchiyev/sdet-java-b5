package day47;

public class CheckedExceptions2 {
	
	// Thread.sleep(1000); // 'throws' exception
	// and in the main method we are saying main method also 'throws' this 
	// exception
	public static void main(String[] args) throws InterruptedException {
		// We can declare exceptions only for methods.
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
	
}
