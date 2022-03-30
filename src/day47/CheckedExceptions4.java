package day47;

public class CheckedExceptions4 {
	public static void main(String[] args) throws Exception {
		// it is optional to handle all runtime exceptions
		m();
		
		// we must handle checked exceptions
		m1();
		
		System.out.println("in the end of the code");
	}
	
	public static void m() throws RuntimeException {
		System.out.println("Java is awesome!");
	}
	
	public static void m1() throws Exception {
		System.out.println("Java is awesome");
		
		// throw new Exception("test exception");
	}
	
	public static boolean isEven(int num) throws Exception {
		if (num < 0) {
			// if we are throwing checked exception inside the method
			// we have to declare it
			throw new Exception("invalid input");
		}
		
		return num % 2 == 0;
	}
}
