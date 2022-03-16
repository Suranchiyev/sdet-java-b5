package day40;

public class Superhero {
	public String name;
	public int powerLevel;
	
	// What's constructor in Java?
	
	// It is a special method that helps to create objects.
	// - constructor name is the same name as class name
	// - it doesn't have return type
	// - we call our constructor when we create an object.
	// - if we don't define custom constructor, the default constructor will be provided by java.
	// - we can have overloaded constructors.
	
	public Superhero() {
		System.out.println("Inside empty constructor");
	}
	
	public Superhero(String name) {
		// this(); // it will call empty constructor inside this constructor
		System.out.println("Inside 1 argument constructor");
		this.name = name;
	}
	
	public Superhero(String name, int powerLevel) {
		// this("Abc"); it will call constructor with one argument
		System.out.println("Inside 2 arguemnts constructor");
		this.name = name;
		this.powerLevel = powerLevel;
	}
	
	// Can we call constructor inside another constructor?
	// Yes, we can
	// we need to use this() keyword do so.
	// it should the first statement inside the constructor.
}
