package day38;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Country2 {
	public static void main(String[] args) {
		Map<String, String> countries = new HashMap<>();
		
		countries.put("USA", "washington");
		countries.put("Canada", "ottawa");
		countries.put("Brazil", "brasilia");
		
		System.out.println(countries);
		
		Set<String> keys = new HashSet<>(countries.keySet());
		for (String key : keys) {
			String val = countries.get(key);
			
			countries.remove(key);
			countries.put(key.toUpperCase(), val);
		}
		
		System.out.println(countries);
		
	}
}
