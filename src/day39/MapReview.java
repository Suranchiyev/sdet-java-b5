package day39;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapReview {
	public static void main(String[] args) {
		// Map is key value data structure where keys are unique
		// Map<K,V>
		
		Map<String, Double> students = new HashMap<>();
		
		students.put("John", 90.5);
		students.put("Smith", 60.0);
		students.put("Alex", 95.5);
		students.put("Misha", 100.0);
		
		System.out.println(students);
		
		// get(K) it returns value by key
		Double score = students.get("Alex");
		System.out.println("Aelx's score: " + score);
		
		// remove(K) it removes element from the map by key
		students.remove("John");
		System.out.println(students);
		
		// containsKey(K)
		System.out.println("Is Misha in the map: " + students.containsKey("Misha"));
		// containsValue(V) 
		System.out.println("Do we have 100.0 as score(value): " + students.containsValue(100.0));
		
		System.out.println(students); // {Alex=95.5, Smith=60.0, Misha=100.0}
		
		// map's keys are unique
		// when we try to put existing key with new value, it overrides the old elements value
		students.put("Smith", 70.0); 
		
		System.out.println(students); // {Alex=95.5, Smith=70.0, Misha=100.0}
		
		Set<String> keys = students.keySet();
		for (String key : keys) {
			System.out.println(key);
		}
		System.out.println("--------------");
		// values() will return all values inside map as Collection
		Collection<Double> values = students.values();		
		System.out.println(values.size());

		for (Double val : values) {
			System.out.println(val);
		}
		System.out.println("--------------");
		
		// How to iterate over the map?
		for (String key : students.keySet()) {
			System.out.println("Student: " + key +", score: " + students.get(key));
		}
	}
}
