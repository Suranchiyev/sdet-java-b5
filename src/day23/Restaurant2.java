package day23;

public class Restaurant2 {
	public static void main(String[] args) {
		// TODO 2
		// create an object from Table class
		// assign any values to its properties
		// and print objects details.
		
		Table t = new Table();
		t.type = "2 people";
		t.color = "white";
		t.height = 5;
		t.isReserved = true;
		t.printDetails();
		
		System.out.println("-------");
		Table t2 = new Table();
		t2.color = "red";
		t2.printDetails();
		
		System.out.println("-------");
		Table t3 = new Table("4 people", "white", 3, false);
		t3.printDetails();
		
	}
}
