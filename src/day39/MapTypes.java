package day39;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTypes {
	public static void main(String[] args) {
		// HashMap does not maintain insertion order
		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(4, "four");
		hashMap.put(3, "three");
		hashMap.put(1, "one");
		hashMap.put(2, "two");
		hashMap.put(0, "zero");
		hashMap.put(-7, "seven");
		hashMap.put(null, "ten");
		hashMap.put(10, null);
		hashMap.put(11, null);
		System.out.println(hashMap);
		System.out.println("------------");
		
		// Hashtable is less popular(older) version of HashMap
		// HashMap vs Hashtable:
		// 1. HashMap is not synchronized(not thread safe) and Hashtable is synchronized(thread safe)
		// 2. HashMap map allows one null key and mulitiple null values. 
		//    Hashtable does not allow null keys and values
		
		Map<Integer, String> hashTable = new Hashtable<>();
		// hashTable.put(null, "abc"); // Exception here, no null keys allowed in Hashtable
		// hashTable.put(1, null); // Exception here, no null values allowed in Hashtable
		hashTable.put(1, "one");
		hashTable.put(2, "two");
		System.out.println(hashTable);
		System.out.println("------------");
		
		// LinkedHashMap does maintain insertion order
		// it is not synchronized
		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(4, "four");
		linkedHashMap.put(3, "three");
		linkedHashMap.put(1, "one");
		linkedHashMap.put(2, "two");
		linkedHashMap.put(0, "zero");
		linkedHashMap.put(null, "ten");
		linkedHashMap.put(10, null);
		linkedHashMap.put(11, null);
		System.out.println(linkedHashMap);
		
		// TreeMap - it keeps elements sorted by the key
		// it is not synchronized
		Map<Integer, String> treeMap = new TreeMap<>();
		// No null key for TreeMap
		// treeMap.put(null, "ten");
		treeMap.put(4, "four");
		treeMap.put(3, "three");
		treeMap.put(1, "one");
		treeMap.put(2, "two");
		treeMap.put(0, "zero");
		treeMap.put(-7, "seven"); 
		treeMap.put(10, null);
		treeMap.put(11, null);
		System.out.println(treeMap);
	}
}
