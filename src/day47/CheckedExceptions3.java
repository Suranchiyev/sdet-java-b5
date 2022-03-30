package day47;

public class CheckedExceptions3 {
	public static void main(String[] args) {
		print10();
		
		try {
			print102();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		// print102();
		
		// it works fine, we don't required to handle runtime exceptions.
		printHello(); 
	}
	
	public static void print10() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch(Exception e) {	
				e.printStackTrace();
			} 
		}
	}
	
	// exception declaration is the way to say - "this method potentially can throw exception"
	// we must handle check exception
	public static void print102() throws InterruptedException {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
	
	public static void printHello() throws NullPointerException {
		System.out.println("Hello, world!");
	}
}
