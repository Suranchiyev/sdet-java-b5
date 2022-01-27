package day13;

public class GroceryStore {
	public static void main(String[] args) {
		double itemPrice = getItemPrice("apple");
		System.out.println("Apple is " + itemPrice + "$");
	}
	
	/*
	 * bread 	-> 4.99
	 * water 	-> 2.99
	 * apple 	-> 1.50
	 * red bull -> 2.59
	 * kiwi     -> 1.50
	 * grape    -> 2.99
	 */
	public static double getItemPrice(String item) {
		double price;
		
		switch(item) {
		case "bread":
			price = 4.99;
			break;
			
		case "water":
		case "grape":	
			price = 2.99;
			break;
			
		case "apple", "kiwi":
			price = 1.50;
			break;
			
		case "red bull":
			price = 2.59;
			break;
		default:
			price = -1;
			System.out.println("Invalid item: " + item);
		}
		
		return price;
	}
}
