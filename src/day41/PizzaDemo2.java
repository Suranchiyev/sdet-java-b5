package day41;

import java.util.List;

public class PizzaDemo2 {
	public static void main(String[] args) {
		Pizza2 pizza = new Pizza2();
		
		pizza.setPrice(9.99);
		
		pizza.addTopping("cheese");
		
		pizza.addTopping("cucumber");
		pizza.addTopping("abc");
		
		System.out.println("Price: " + pizza.getPrice());
		System.out.println("Toppings: " + pizza.getToppings());
		
		List<String> myToppings = pizza.getToppings();
		myToppings.add("cucumber");
		myToppings.add("abc");
		System.out.println("--------");
		
		System.out.println("Price: " + pizza.getPrice());
		System.out.println("Toppings: " + pizza.getToppings());
	}
}
