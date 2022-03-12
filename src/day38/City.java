package day38;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class City {
	public static void main(String[] args) {
		// TODO create map of K - String, V - Integer with name cities
		// put these element into the map
		// {Arlington=229164, Leesburg=375629, Manassas=451721, Richmond=210309, Alexandria=147391, Norfolk=245782}
		
		Map<String, Integer> cities = new HashMap<>();
		cities.put("Arlington", 229164);
		cities.put("Leesburg", 375629);
		cities.put("Manassas", 451721);
		cities.put("Richmond", 210309);
		cities.put("Alexandria", 147391);
		cities.put("Norflok", 245782);
		System.out.println(cities);
		
		// TODO print each city in this format by iterating over the map
		// city: Arlington, population: 229164
		// keySet() - returns keys from the map
		
		// Set<String> keys = cities.keySet();
		
		for (String key : cities.keySet()) {
			Integer val = cities.get(key);
			System.out.println("city: " + key + ", population: " + val);
		}
		System.out.println("----------");
		
		// TODO get total population from cities map
		int totalPopulation = 0;
		
		for (String key : cities.keySet()) {
			totalPopulation += cities.get(key);
		}
		System.out.println("Total population: " + totalPopulation);
		System.out.println("----------");
		
		// TODO print city name with population more than 300000 from cities map
		for (String key : cities.keySet()) {
			if (cities.get(key) > 300000) {
				System.out.println(key);
			}
		}
		System.out.println("----------");
		
		String biggestCity = "";
		int maxPopulation = 0;
		
		// TODO find out the biggest city from cities map.
		for (String key : cities.keySet()) {
			if (cities.get(key) > maxPopulation) {
				maxPopulation = cities.get(key);
				biggestCity = key;
			}
		}
		System.out.println("The biggest city is " + biggestCity + " with " + maxPopulation + " population.");
		System.out.println("-----------");
		
		System.out.println(cities); // {Manassas=451721, Leesburg=375629, Norflok=245782, Alexandria=147391, Arlington=229164, Richmond=210309}
		
		// TODO increase population of each city by 999
		
		System.out.println(cities); // each value shoulb be increased by 999
	}
}




