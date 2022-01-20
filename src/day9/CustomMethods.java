package day9;

public class CustomMethods {
	public static void main(String[] args) {
		printExclamation("Apple");
		printExclamation("John");
		
		double res = plus100(5.5);
		System.out.println(res);
		
		System.out.println(plus100(9.0));
	}
	
	public static void printExclamation(String str) {
		System.out.println(str + "!");
	}
	
	public static double plus100(double dNum) {
		return dNum + 100;
	}
}
