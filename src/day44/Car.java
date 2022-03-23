package day44;

public abstract interface Car {
	public static final double MAX_SPEED = 250.0;
	public static final String MAKE = "Tesla";
	
	public abstract void drive();
	public abstract void stop();
	public abstract double getSpeed();
	public abstract void turn(String way);
	
	/*
	 * 1. Interface can have abstract methods. 
	 *    public abstract keywords are assumed(java will inject them if we don't write)
	 * 2. all variables in the interface are public static final.
	 * 3. Interface cannot be instantiated directly
	 *    (cannot create object out of Interface).
	 *    
	 * 4. In the interface we cannot create regular method with bodies.
	 *    Only static and default methods can have bodies in the interface.
	 */
	
	public static void printDetails() {
		System.out.println("MAX SPEED: " + MAX_SPEED);
		System.out.println("MAKE: " + MAKE);
	}
	
	public default void m() {
		System.out.println("Inside m method.");
	}
}
