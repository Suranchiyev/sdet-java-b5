package day41;

public class Parrot extends Bird {

	public void talk() {
		System.out.println("Parrot is taling");
	}
	

	
	public static void main(String[] args) {
		Parrot obj = new Parrot();
		obj.name = "Alice";
		obj.fly();
		
		
	}
}
