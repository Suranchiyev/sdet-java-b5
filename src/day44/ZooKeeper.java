package day44;

public class ZooKeeper {
	public static void main(String[] args) {
		Reptile obj = new Crocodile();
		// Crocodile obj1 = new Reptile();
		
		Reptile obj2 = new Alligator();
		
		// Reptile obj2 - reference type
		// Reference type will decide what method/properties 
		// available to call.
		
		// new Alligator() - actual object
		// if method was overridden the overridden method
		// will be executed. (NOT FOR HIDING)
		
		obj2.run();
		System.out.println(obj2.name); // John
		
		// new code here
		Alligator aObj = (Alligator) obj2;
		System.out.println(aObj.name); // Abc

		// OR if you want to have shorted code(it is same as above)
		System.out.println(((Alligator) obj2).name); // Abc
		System.out.println("-------");
		
		// Type casting
		Alligator alligator = new Alligator();
		Reptile reptile = alligator;
		
		Reptile r = new Reptile();
		// Alligator a = r; // doesn't compile
		// Alligator a2 = (Alligator)r; // throws runtime exception
		
		Reptile r2 = new Alligator();
		Alligator a = (Alligator)r2; // type casting
		
		feed(r);
		feed(alligator);
		feed(new Crocodile());
	}
	
	public static void feed(Reptile r) {
		System.out.println(r.getClass());
	}
}






