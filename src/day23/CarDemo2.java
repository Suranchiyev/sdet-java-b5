package day23;

import day24.Car;

public class CarDemo2 {
	public static void main(String[] args) {
		Car car = new Car();
		car.model = "BMW";
		// car.year = 2021; // not visible
		// car.price = 35000; // not visible
		// car.color = "black"; // not visible
		car.printDetails();
	}
}
