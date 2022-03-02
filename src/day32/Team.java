package day32;

import java.util.Arrays;

public class Team {
	public static void main(String[] args) {
		String[][] rows = {
				{"apple", "orange"}, 
				{"kiwi", "banana"}, 
				{"blueberry", "pineapple", "berry"}}; 
		
		System.out.println(rows.length); // 3
		System.out.println(rows[0].length); // 2
		System.out.println(rows[1].length); // 2
		System.out.println(rows[2].length); // 3
		
		// print each element of two dimensional array on new lines
		// We can label our loops and while using break or continue, 
		// we can specify by label which loop to break/continue.
		outerLoop:
		for (int i = 0; i < rows.length; i++) {
			innerLoop:
			for (int j = 0; j < rows[i].length; j++) {
				if (rows[i][j].equals("banana")) {
					System.out.println("Banana is here!");
					// break innerLoop;
					break outerLoop;
				}
				
				// rows[i][j] = rows[i][j].toUpperCase();
				System.out.println(rows[i][j]);
			}
		}
		
		// System.out.println(Arrays.deepToString(rows));
		System.out.println("---------");
		// this is label for outer loop
		forOuterLoop:
		for (String[] arr : rows) {
			for (String str : arr) {
				System.out.println(str);
			}
		}
		
	}
}




