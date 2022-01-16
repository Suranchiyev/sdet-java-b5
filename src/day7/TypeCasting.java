package day7;

public class TypeCasting {
	public static void main(String[] args) {
		// byte -> short -> int -> long -> float -> double
		
		// auto boxing
		byte b = 10;
		short shN = b;
		
		short shNum = 299;
		long lNum = shNum;

		long lNum2 = 100000000;
		float fNum = lNum2;
		double dNum = lNum2;
		
		// explicit type casting 
		int i = 100;
		byte bN = (byte)i;
		System.out.println(bN);
		
		double dN = 9.99;
		int i2 = (int)dN;
		System.out.println(i2); // 9
		
		// output from expressions
		// byte -> short -> int -> long -> float -> double
		byte n1 = 10;
		short n2 = 12;
		int res = n1 + n2;
		
		int i1 = 100;
		long l1 = 200;
		long res2 = i1 + l1;
		
		long l2 = 1000;
		float f2 = 200.5F;
		double d2 = 400.1;
		double res3 = l2 + f2 + d2;

	}
}
