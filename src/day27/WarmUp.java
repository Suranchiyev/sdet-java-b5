package day27;

public class WarmUp {
	public static void main(String[] args) {
		// What's array?
		// Array is a collection of data of the same type.
		// Array is fixed size collection.
		
		String[] javaClass = new String[5];
		
		
		javaClass[0] = "Tigran";
		javaClass[4] = "Derek";
		// If do not assign any values for array element, they will have default values.
		System.out.println(javaClass[1]);
		// Objects(String)      -> null
		// Numeric(int, double) -> 0
		// boolean              -> false  
		
		//              0  1  2  3  4  5
		int[] arrNum = {4, 5, 6, 9, 3, 10}; // create array with values in the same line.
		System.out.println(arrNum[0]); // 4
		System.out.println(arrNum[4]); // 3
		
		// How do we get the size of array?
		// .length will return size of array
		int size = arrNum.length;
		System.out.println("Size: " + size);
		
		for (int i = 0; i < arrNum.length; i++) {
			System.out.println(arrNum[i]);
		}
	}
}





