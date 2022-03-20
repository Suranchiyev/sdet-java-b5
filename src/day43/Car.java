package day43;

public abstract class Car {
	// 1. Abstraction lets us focus on what object does instead of how it does.
	// 2. abstract classes can have abstract methods. Abstract methods don't have bodies.
	
	public abstract void drive();
	
	public abstract void stop();
	
	public abstract double speed();
}
