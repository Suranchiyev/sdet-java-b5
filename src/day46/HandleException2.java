package day46;

public class HandleException2 {
	public static void main(String[] args) {
		String str = null;
		
		try {
			System.out.println(str);
			System.out.println(str.toUpperCase());
		} catch (NullPointerException e) {
			System.out.println("Exception is handled!");
		}

		// TODO
		// handle exception that comes from line 7 and print "Exception is handled!"
	}
}
