package day31;

import java.util.Arrays;

public class WarmUp {
	public static void main(String[] args) {
		// given this array
		String[] arrayOne = {"One", "Two", "Three", "Four", "Five"};
		System.out.println(Arrays.toString(arrayOne)); // [One, Two, Three, Four, Five]
		
		// TODO reverse each element of arrayOne without using StringBuilder
		
		// read each element from array and update each element
		for (int i = 0; i < arrayOne.length; i++) {
			// "Two"              1
			String str = arrayOne[i];
			
			String rev = "";	
			for (int j = str.length() - 1; j >= 0; j--) {
				rev = rev + str.charAt(j);
			}
			// rev = "owT";
			
			// update array element with reverse version
			//       1  = "owT"
			arrayOne[i] = rev;
		}
		
		System.out.println(Arrays.toString(arrayOne)); // [enO, owT, eerhT, ruoF, eviF]
	}
	
}
