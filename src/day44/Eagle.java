package day44;

public class Eagle extends Bird implements CanFly, Animal {	
	// We can implement many interfaces at the same time.	
	// we can extends and implement other interfaces as well.
	
	
	public static void main(String[] args) {
		Eagle obj = new Eagle();
		obj.fly();
		obj.takeoff();
		obj.dive();
	}

	@Override
	public void fly() {
		System.out.println("Eagle is flying.");
	}

	@Override
	public void takeoff() {
		System.out.println("Eagle is takingoff");
	}

	@Override
	public void dive() {
		System.out.println("Eagle is diving.");
	}
	
	@Override
	public void eat() {
		System.out.println("Eagle is eating");
	}

	@Override
	public void drink() {
		System.out.println("Eagle is drinking");
	}
}
