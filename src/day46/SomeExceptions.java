package day46;

import java.util.Random;

public class SomeExceptions {
	public static void main(String[] args) {
		// NullPointerException.
		// When do you get null pointer exception?
		// we get null pointer exception when our object is null(reference pointing
		// to null) and we are trying to use some property or method of this object.
		
		String str = null;
		System.out.println(str);
		System.out.println(str == null);
		
		// System.out.println(str.toUpperCase()); // java.lang.NullPointerException:
		
		System.out.println("Hello, World!");
		System.out.println("Hello, World!");
		System.out.println("Hello, World!");
		System.out.println("---------");
		
		Car car = null;
		System.out.println(car); // null
		// car.model = "Audi"; // java.lang.NullPointerException
		
		String val = getValue();
		if ("apple".equals(val)) {
			System.out.println("Yes, they are equal.");
		} else {
			System.out.println("No, they are not equal.");
		}
	}
	
	public static String getValue() {
		if (new Random(11).nextInt() % 2 == 0) {
			return null;
		}
		
		return "apple";
	}
}

class Car {
	public String model;
	public String color;
}



