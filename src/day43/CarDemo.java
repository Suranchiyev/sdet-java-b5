package day43;

public class CarDemo {
	public static void main(String[] args) {
		// Car car = new Car();
		// Abstract class cannot be initialized
		// directly.
		
		
		// We use abstract classes by providing 
		// concrete classes.
		
		Audi car = new Audi();
		// BMW car = new BMW();
		
		car.drive();
		car.stop();
		System.out.println(car.speed());
		
		// drive around
		for (int i = 0; i < 5; i++) {
			car.drive();
		}
		
		// a lot of code..
		car.stop();
		System.out.println(car.speed());
	}
}
