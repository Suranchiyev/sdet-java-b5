package day43;

public class Ox extends Mammal {
	@Override
	public void eat() {
		System.out.println("Ox is eating");
	}
	
	@Override
	public void drink() {
		System.out.println("Ox is drinking");
	}
	
	public static void main(String[] args) {
		Ox ox = new Ox();
		ox.name = "Ox";
		ox.printName();
	}
}
