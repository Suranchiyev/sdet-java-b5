package day41;

import java.util.ArrayList;
import java.util.List;

public class Pizza2 {
	private double price;
	private List<String> toppings = new ArrayList<>();

	private final String[] availableToppings = {
			"cheese", "pepperoni", "chicken", "bacon"
	};
	
	public void setPrice(double price) {
		if (price < 0) {
			throw new IllegalArgumentException("Price cannot be negative");
		} else {
			this.price = price;
		}	
	}
	
	public void addTopping(String topping) {
		for (String el : availableToppings) {
			if (topping.equals(el)) {
				toppings.add(topping);
				return;
			}
		}
		
		System.out.println("Invalid topping: " + topping);
	}
	
	public double getPrice() {
		return price;
	}
	
	public List<String> getToppings() {
		return new ArrayList<>(toppings);
	}
	
//	public void setToppings(List<String> toppings) {
//		this.toppings = new ArrayList<>(toppings);
//	}
}




