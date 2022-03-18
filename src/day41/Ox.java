package day41;

// - we cannot extends multiple classes at the same time
// - Java supports only single inheritance
// - Why Java doesn't support multiple inheritance?
// - Diamond problem
public class Ox extends Mammal {
	
	public static void main(String[] args) {
		Ox obj = new Ox();
		obj.age = 4;
		obj.drinkMilk();
	}
}
