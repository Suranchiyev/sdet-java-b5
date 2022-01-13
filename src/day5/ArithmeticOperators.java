package day5;

public class ArithmeticOperators {
	public static void main(String[] args) {
		// +, -, *, /
		// %
		
		int i = 7;
		int j = 2;
		
		int result = i + j;
		System.out.println(result);
		//       7 - 2
		result = i - j;
		System.out.println(result); // 5
		
		result = i * j;
		System.out.println(result); // 14
		
		//      int / int = int
		result = i / j;
		//       7 / 2 => 3.5 -> 3
		System.out.println(result); // 3
		// whole numbers are only for whole numbers.
		// if both operands in math expression is whole number types, 
		// then output always will whole number. if result supposed to
		// a floating number then it will truncated.
		
		double d = 7.0;
		int i2 = 2;
		//          double / int => double
		double dRes =    d / i2;
		System.out.println(dRes); // 3.5
		
		System.out.println(7 / 2); // 3
		System.out.println(7.0 / 2); // 3.5
		System.out.println(7 / 2.0); // 3.5
		
		String str = "Result: ";
		int num = 299;
		int num2 = 1;
		//                "Result: 2991" 
		System.out.println(str + num + num2); // Result: 2991
		System.out.println(str + (num + num2)); // Result: 300
	}
}
