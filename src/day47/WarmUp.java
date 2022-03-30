package day47;

public class WarmUp {
	public static void main(String[] args) {
		int i = 0;
		int i2 = 2;
		
		try {
			 int res = i2 / i;
			 System.out.println(res);
			
//			 String str = null;
//			 str.length();		
			// catch all runtime exception 
		} catch(ArithmeticException e1) {
			System.out.println("arithmetic exception was there.");
		
			// we cannot have parent exception above child exception in the catch blocks.
		} catch(RuntimeException e) {
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
			System.out.println("exception was there but I will just continue");
		} 
		
		
		System.out.println("In the end of the code");
	}
}
