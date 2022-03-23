package day44;

public class CarDemo {
	public static void main(String[] args) {
		// Car car = new Car();
		TeslaModelS tesla = new TeslaModelS();
		tesla.drive();
		tesla.m();
		// Car car = new Car();
		System.out.println("---------");
		// Polymorphism
		
		Car car = new TeslaModelS();
		car.drive();
		car.m();
		car.stop();
		// car.driveFast();
		
		// Car car - reference type
		// and it decides what methods/properties
		// are available.
		
		// new TeslaModeS() - actual object
		car.drive(); // runtime polymorphism because java will get to know about 
		             // overridden method during the runtime and it will call it.		
	}
}
