package day43;

public class Audi extends Car {
	
	// Audi must implement Car's abstract methods
	// implement - override
	
	@Override
	public void drive() {
		System.out.println("Audi is driving");
	}
	
	@Override
	public void stop() {
		System.out.println("Audi is stopped");
	}
	
	@Override
	public double speed() {
		return 90.5;
	}
}
