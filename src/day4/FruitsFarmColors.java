package day4;

public class FruitsFarmColors {
	public static void main(String[] args) {
		String apple = "red";
		String banana = "yellow";
		String orange = "orange";
		String kiwi = "green";
		String pear = "yellow";
		
		System.out.println(apple); // red
		System.out.println(banana); // yellow
		System.out.println(orange); // orange
		System.out.println(kiwi); // green
		System.out.println(pear); // yellow
		
		//                 "red, yellow, orange, green, yellow"
		String allFruits = apple + ", " + banana + ", " + orange + ", " + kiwi + ", " + pear;
		//                 "Fruits: red, yellow, orange, green, yellow"
		System.out.println("Fruits: " + allFruits);
	}
}
