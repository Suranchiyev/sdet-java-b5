package day35;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LoopOverList {
	public static void main(String[] args) {
		List<String> customers = new ArrayList<>();
		customers.add("Oliver");
		customers.add("James");
		customers.add("Anna");
		customers.add("Alex");
		customers.add("Tomas");
		customers.add("John");

		// 1. by using regular loop
		// System.out.println(customers.get(0));
		for (int i = 0; i < customers.size(); i++) {
			System.out.println(customers.get(i));
		}
		
		System.out.println("--------------");
		
		// 2. by using for each loop
		for (String customer : customers) {
			System.out.println(customer);
		}
		System.out.println("--------------");
		
		// 3. iterate over by using Iterator		
		Iterator<String> iterator = customers.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("--------------");
		
		// 4. iterate over the list by using streams forEach function
		customers.forEach(element -> {
			System.out.println(element);
		});	
	}
}
