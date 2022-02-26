package day31;

import java.util.Arrays;

public class MArray {
	public static void main(String[] args) {
		int[][] numArr = new int[2][3];
		// [2] - size of outer array
		// [3] - size of inner array
		
		// {[0, 0, 0], [0, 0, 0]}
		
		//      0                 1
		// [[4], [3], [7]] , [[9], [11], [17]]
		//   0    1    2       0    1     2
		
		numArr[0][0] = 4;
		numArr[0][1] = 3;
		numArr[0][2] = 7;
		
		numArr[1][0] = 9;
		numArr[1][1] = 11;
		numArr[1][2] = 17;
		//    
		// {{4, 3, 7}, {9, 11, 17}}
		System.out.println(Arrays.toString(numArr)); // [[I@1dbd16a6, [I@7ad041f3]
		
		// loop over each element of 2 dimensional array
		for(int i = 0; i < numArr.length; i++) {
			// System.out.println(numArr[i]);
			for (int j = 0; j < numArr[i].length; j++) {
				System.out.print(numArr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("---------");		
		for(int[] num : numArr) {
			// System.out.println(Arrays.toString(num));
			for (int innerNum : num) {
				System.out.print(innerNum + " ");
			}
			System.out.println();
		}
		
		System.out.println("----------");	
		System.out.println(Arrays.deepToString(numArr));
		
		// the size for inner arrays is optional, if do not put anything there array will be created with null values
		// and we need to create inner arrays by ourself.
		int[][] numArr2 = new int[3][]; // {{null}, {null}, {null}}
		
		System.out.println(Arrays.toString(numArr2));
		// [[0, 0], [0, 0, 0, 0, 5], [7]]
		numArr2[0] = new int[2];
		numArr2[1] = new int[5];
		numArr2[2] = new int[1];
		// {{0, 0}, {0, 0, 0, 0, 0} {0}}
		System.out.println(Arrays.toString(numArr2));
		System.out.println(Arrays.deepToString(numArr2));
		
		numArr2[2][0] = 7;
		numArr2[1][4] = 5;
		System.out.println(Arrays.deepToString(numArr2));
		System.out.println("----------");
		
		int[][] arr = {new int[2], new int[5], new int[2]};
		System.out.println(Arrays.deepToString(arr));
		
		int[][] numArr3 = {{2, 3, 4}, {1, 9, 8, 34, 99}, {7}};
		System.out.println(Arrays.deepToString(numArr3));
		// TODO
		System.out.println(numArr3[0][2]); // 4
		System.out.println(numArr3[1][3]); // 34
		System.out.println(numArr3[2][0]); // 7
		System.out.println(numArr3[1][2]); // 8
		System.out.println(numArr3[1][0]); // 1
		System.out.println(numArr3[0][0]); // 2
		
		// [[5, 5], [1, 2, 3], [2], [9, 8, 7, 6, 5, 4, 3]]
		// TODO create 2 dimensional array numArr4 of type int with above values and print it out.
		int[][] numArr4 = {{5, 5}, {1, 2, 3}, {2}, {9, 8, 7, 6, 5, 4, 3}};
		System.out.println(Arrays.deepToString(numArr4));
 	}
}
