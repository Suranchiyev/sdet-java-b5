package day12;

public class ShapesFormula {
	// constants
	public static final double PI = 3.14;
	
	// C = 2*PI*radius
	public static double getCOfCircle(int radius) {
		// PI = 4.3; the final variables are not reassignable.
		return 2 * PI * radius;
	}
	
	// A = 4 * PI * radius^2
	public static double getAreaOfCircle(int radius) {
		return 4 * PI * (radius * radius);
	}
	
	public static void main(String[] args) {
		System.out.println("C: " + getCOfCircle(7));
		System.out.println("A: " + getAreaOfCircle(7));
	}
}
