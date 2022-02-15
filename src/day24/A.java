package day24;

public class A {
	public static void main(String[] args) {
		B obj = new B();
		obj.str = "Apple";
		obj.num = 1;
		obj.res = "wooden spoon";
		obj.printDetails();
		System.out.println("--------");
		
		B obj2 = new B();
		obj2.printDetails();
		
		obj.res = "iron spoon";
		
		System.out.println(obj.res); // iron spoon
		System.out.println(obj2.res); // null
	}
}
