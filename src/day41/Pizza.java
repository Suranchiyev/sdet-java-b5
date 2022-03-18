package day41;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pizza {
	private final String[] availableToppings = {"cheese", "pepperoni", "chicken", "bacon"};
	private List<String> toppings;
	
	public Pizza() {
		toppings = new ArrayList<>();
	}
	
	public void addTopping(String topping) {
		if (Arrays.asList(availableToppings).contains(topping.toLowerCase())) {
			toppings.add(topping);
		} else {
			System.out.println("This topping is not available: " + topping);
		}
	}
	
	// when we are encapsulating mutable objects and arrays.
	// we always need to return the copy of the object in the getter.
	public List<String> getToppings() {
		// return toppings; // we shouldn't return original reference
		return new ArrayList(toppings);
	}
}
