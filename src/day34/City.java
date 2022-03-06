package day34;
import java.util.ArrayList;

public class City {
	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();
		cities.add("Aldie");
		cities.add("Chantilly");
		cities.add("Tysons");
		cities.add("DC");
		cities.add("Hyannis");
		
		// contains
		if (cities.contains("Aldie")) {
			System.out.println("Aldie is in the cities list");
		} else {
			System.out.println("Aldie is not in the cities list");
		}
		
		boolean isThere = cities.contains("Paris");
		System.out.println(isThere);
		                            //    0       1         2     3     4
		System.out.println(cities); // [Aldie, Chantilly, Tysons, DC, Hyannis]
		// indexOf
		int i = cities.indexOf("DC");
		System.out.println("DC: " + i); // DC: 3 
		System.out.println(cities.indexOf("Aldie")); // 0
		System.out.println(cities.indexOf("Paris")); // -1
		System.out.println(cities.indexOf("Tysons")); // 2
		
		System.out.println(cities.indexOf("dc")); // -1
		System.out.println(indexOfIgnoreCase(cities, "dc"));
		
		System.out.println("---------");
		
		// TODO
		// print elements from cities list in the new lines 
		// if element length is even
		
		for (String city : cities) {
			if (city.length() % 2 == 0) {
				System.out.println(city);
			}
		}
		System.out.println("-----------");
		
		for (int j = 0; j < cities.size(); j++) {
			if (cities.get(j).length() % 2 == 0) {
				System.out.println(cities.get(j));
			}
		}
		
	}
	
	public static int indexOfIgnoreCase(ArrayList<String> list, String target) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equalsIgnoreCase(target)) {
				return i;
			}
		}
		
		return -1;
	}
}
