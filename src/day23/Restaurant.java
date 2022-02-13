package day23;

public class Restaurant {
	// class is a blueprint for its objects.
	// object is implementation of the class.
	// we use new keyword to create an object.
	
	public static void main(String[] args) {
		// numeric (int, double, long ...)
		// String
		// char & boolean
		
		Table table1 = new Table();
		// table1 - reference
		System.out.println(table1);		
		table1.type = "4 people";
		table1.color = "black";
		table1.height = 3;
		table1.isReserved = false;
		
		System.out.println(table1.type);
		System.out.println(table1.color);
		System.out.println(table1.height);
		System.out.println(table1.isReserved);
		System.out.println("------");
		
		Table table2 = new Table();
		System.out.println(table2.type);
		System.out.println(table2.color);
		System.out.println(table2.height);
		System.out.println(table2.isReserved);
		// the properties of objects have default values:
		// Object - null
		// numerics(and char) - 0
		// boolean - false		
	}
}
