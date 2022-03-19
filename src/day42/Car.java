package day42;

/*
 * What happens when child class will have same variables/static methods?
 * Child class will hide the parent class variables/static methods
 * or we can say variables will shadow the parent's variables.
 */
public class Car extends Vehicle {
	public String name = "car";
	
	public static void printPlateNum() {
		System.out.println("Plate number: 321 in Car class");
	}
	
	@Override
	public int sum(int i, int i2) {
		return (i + i2) * 2;
	}
	
	public void printSum(int i, int i2) {
		// by using super keyword I can refer to parents members
		System.out.println(super.sum(i, i2));
	}
	
	public void printName() {
		System.out.println(super.name);
	}
	
	public static void main(String[] args) {
		Car car = new Car();
		System.out.println(car.name);
		
		Car.printPlateNum();
		
		// The difference between method overriding and hiding.
		// Java will know which method to call only during runtime
		// for overloaded methods. That's the reason overriding 
		// referred as runtime polymorphism.
		
		// Java will know which variable/static method invoke 
		// during the compilation time.
		
		System.out.println(car.sum(5, 5));
		car.printSum(2, 2);
		car.printName();
		
		// this keyword refers to current object's properties/methods
		// super keyword refers to parent class properties/methods
	}
}
