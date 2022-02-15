package day24;

public class Car {
	// Access Modifiers
	// public - the member accessible from anywhere in the project.
	// protected - accessible within the same package and subclasses.
	// default(empty) - accessible within the same package only.
	// private - accessible within the same class only.
	
	public String model;
	protected int year;
	double price;
	private String color;
	
	public void printDetails() {
		System.out.println("Model: " + model);
		System.out.println("Year: " + year);
		System.out.println("Price: " + price);
		System.out.println("Color: " + color);
	}
}
