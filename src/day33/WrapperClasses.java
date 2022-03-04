package day33;

public class WrapperClasses {
	public static void main(String[] args) {
		/*
		 * byte      -> Byte
		 * short     -> Short
		 * int       -> Integer
		 * long      -> Long
		 * float     -> Float
		 * double    -> Double
		 * boolean   -> Boolean
		 * char      -> Character
		 */
		
		byte bNum = 5;
		System.out.println(bNum);
		
		Byte bNum2 = 5;
		System.out.println(bNum2);
		
		Short shNum = 100;
		
		Integer num = 2300;
		Integer num2 = 1000;
		Integer res = num + num2;
		System.out.println("Res: " + res);
		
		Double dNum = 9.9;
		Float fNum = 1.5f;
		Boolean b = false;
		Character ch = 'a';
		
		int num3 = Integer.parseInt("123");
		Integer num4 = Integer.valueOf("123");
		System.out.println(num3);
		System.out.println(num4);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
	}
}
