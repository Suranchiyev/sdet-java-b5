package day41;

import java.util.List;

public class PizzaDemo {
	public static void main(String[] args) {
		Pizza pizza = new Pizza();
		
		pizza.addTopping("Cheese");
		pizza.addTopping("cucumber");
		
		System.out.println(pizza.getToppings());
		
		List<String> myToppings = pizza.getToppings();
		System.out.println(myToppings);
		
		myToppings.add("cucumber");
		myToppings.add("tomato");
		
		System.out.println(pizza.getToppings());
	}
}
