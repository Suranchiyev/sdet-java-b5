package day9;

public class MethodOverloading {
	public static void main(String[] args) {
		// Method Overloading is when we have in the same class
		// more than one method with same name but different arguments:
		// 1. Different number of arguments.
		// 2. Different type of arguments.
		// 3. Order of arguments.
		
		System.out.println(sum(5, 6));	
		System.out.println(sum(1, 3, 5));
		
		double d = 9.9, d2 = 11.7;
		double res = sum(d, d2);
		System.out.println(res);
	}

	public static double sum(double i, double i2) {
		return i + i2;
	}
	
	public static int sum(int num, int num2) {
		return num + num2;
	}
	
	public static int sum(int num, int num2, int num3) {
		return num + num2 + num3;
	}
}
