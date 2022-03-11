package day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetChallenge {
	public static void main(String[] args) {
		int[] numArr = {6, 3, 2, 7, 3, 3, 2, 1};
		System.out.println(Arrays.toString(numArr)); // [6, 3, 2, 7, 3, 3, 2, 1]
		
		//TODO
		// numArr = removeDup(numArr);
		numArr = removeDupSet(numArr);
		System.out.println(Arrays.toString(numArr)); // [6, 3, 2, 7, 1]
	}
	
	public static int[] removeDup(int[] arr) {
		List<Integer> listWithoutDup = new ArrayList<>();
		
		// iterate over the array and add unique elements to the list
		for (int el : arr) {
			// if list doesn't contain the element then add
			if (!listWithoutDup.contains(el)) {
				listWithoutDup.add(el);
			}
		}
		
		// create new array with same size as list and copy all data 
		// from the list.
		int[] arrNoDup = new int[listWithoutDup.size()];
		
		for (int i = 0; i < listWithoutDup.size(); i++) {
			arrNoDup[i] = listWithoutDup.get(i);
		}
		return arrNoDup;
	}
	
	public static int[] removeDupSet(int[] arr) {
		// 1. add all elements from arr to the Set
		// 2. create new array of set size and copy all elements
		
		// add all elements to set to remove duplicates
		Set<Integer> set = new LinkedHashSet<>();
		for (int el : arr) {
			set.add(el);
		}
		
		// create new array and get unique elements from set
		int[] arrNoDup = new int[set.size()];
		// maintain i var as index to add elements to arrNoDup array.
		int i = 0;
		
		for (int el : set) {
			arrNoDup[i++] = el;
		}
		
		return arrNoDup;
	}
}



