package day45;

public class Chocolate {
	public static String chocolate;
	public String str;
	public String str1;
	
	// this is static block, it will get executed when we use this class in any way.
	// it executes only once.
	static {
		System.out.println("in static block");
		// str = "asdf";
		chocolate = "Str";
	}
	
	// this is initializer block
	// It will get executed before each object creation.
	{
		System.out.println("in initilizer block");
	}
	
	
	public Chocolate() {
		System.out.println("in empty constructor");
	}
	
}
