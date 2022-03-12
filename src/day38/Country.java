package day38;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Country {
	public static void main(String[] args) {
		Map<String, String> countries = new HashMap<>();
		
		countries.put("USA", "washington");
		countries.put("Canada", "ottawa");
		countries.put("Brazil", "brasilia");
		
		System.out.println(countries);
		
		// keySet() it returns all keys of the map as Set
		Set<String> keys = countries.keySet();
		System.out.println("Keys:");
		for (String key : keys) {
			System.out.println(key);
		}
		System.out.println("----------");
		// Country: Name, capital: Capital name
		for (String key: countries.keySet()) {
			System.out.println("Country: " + key + ", capital: " + countries.get(key));
		}
		System.out.println("----------");
		System.out.println(countries); // {Canada=ottawa, USA=washington, Brazil=brasilia}
		
		// loop over the keys
		for (String key : countries.keySet()) {
			// get original value for each key
			String value = countries.get(key);
			
			// change original value by making it first letter to upper case.
			value = value.substring(0, 1).toUpperCase() + value.substring(1);
			
			// put new value in the same key(it overrides old value)
			countries.put(key, value);
		}
		
		System.out.println(countries); // {Canada=Ottawa, USA=Washington, Brazil=Brasilia}
	}
}
