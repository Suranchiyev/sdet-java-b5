package day34;
import java.util.ArrayList;

public class Car {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<>();
		cars.add("bmw");
		cars.add("audi");
		cars.add("honda");
		cars.add("tesla");
		System.out.println(cars);
		
		int s = cars.size(); // size() returns number of elements
		System.out.println("Size: " + s);
		
		cars.add("ford");
		System.out.println("Size: " + cars.size());
		System.out.println(cars);
		
		// remove(index), remove(value)
		cars.remove(0);
		System.out.println(cars);
		System.out.println("Size: " + cars.size());
		
		cars.remove("honda");
		System.out.println(cars);
		
		// clear() - it will remove all elements from ArrayList
		cars.clear();
		System.out.println(cars); // []
		
		cars.add("bmw");
		cars.add("tesla");
		cars.add("honda");
		System.out.println(cars);
		System.out.println("----------");
		
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(i + " " + cars.get(i));
		}
		System.out.println("----------");
		
		for (String str : cars) {
			System.out.println(str);
		}
	}
}




