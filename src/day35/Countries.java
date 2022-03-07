package day35;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class Countries {
	public static void main(String[] args) {
		// Arrays.asList(T...) returns fixed-size list backed by specified array
		List<String> countries = Arrays.asList("USA", "Bolivia", "France", "Brazil", "Uzbekistan");
		System.out.println(countries);
		// When we create our list as Arrays.asList(...) it will be fixed-size list.
		// If we will add new elements or remove, it will throw UnsupportedOperation exception.
		// java.lang.UnsupportedOperationException
		// countries.add("Argentina");
		// countries.remove(0);
		
		System.out.println("------------");
		// We can pass asList(...) as argument to ArrayList and it will return regular dynamic-size list.
		List<String> countries2 = new ArrayList<>(Arrays.asList("USA", "Bolivia", "France", "Brazil"));
		System.out.println(countries2);
		
		countries2.add("Argentina");
		System.out.println(countries2);
		System.out.println("------ REGULAR LOOP ------");
		
		// TODO loop over the list countries2 and print each element in new lines by using regular loop
		for (int i = 0; i < countries2.size(); i++) {
			System.out.println(countries2.get(i));
		}
		
		System.out.println("------ FOR EACH ------");
		// TODO loop over the list countries2 and print each element in new lines by using for each loop
		for (String country : countries2) {
			System.out.println(country);
		}
		
		System.out.println("----- ITERATOR -------");
		// TODO loop over the list countries2 and print each element in new lines by using Iterator
		Iterator<String> iterator = countries2.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("------ forEach FUNCTION ------");
		// TODO loop over the list countries2 and print each element in new lines by using forEach stream function
		countries2.forEach(country -> {
			System.out.println(country);
		});
		
		System.out.println("------------");
	}
}
