package day13;

public class ConstantsReview {
	// constant variables in java usually tagged as static final.
	// you cannot change value of constants.
	// usually their name all in upper cases.
	public static final String KEY = "my secret key";
	
	public static void main(String[] args) {
		// What does it mean when we tag our variables, or arguments as final.
		// We cannot change their values.
		
		// KEY = "new secret"; // compilation error here because we cannot change value of final
		
		// we can have final local variables as well.
		final String name = "John";
		
		// name = "Alex"; // it does not compile because we cannot change value of final.
	
		printValue("ABC");
		printValue("Java");
		printValue("Apple");
	}
	
	// we can tag our arguments as final.
	// we cannot change the value of it.
	public static void printValue(final String str) {
		// str = "new value"; // does not compile
		
		System.out.println("str: " + str);
	}
}
