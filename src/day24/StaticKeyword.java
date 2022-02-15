package day24;

public class StaticKeyword {
	public static void main(String[] args) {
		School obj = new School();
		obj.name = "TLA";
		
		School.year = 2018;

		System.out.println(obj.name);
		// static members should be used via class name
		System.out.println(School.year);
		
		System.out.println("------");
		
		School obj2 = new School();
		obj2.year = 2020;
		System.out.println(obj2.name); // null
		
		System.out.println(obj2.year); // 2020 
		System.out.println(obj.year); // 2020
	}
}
