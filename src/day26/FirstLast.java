package day26;
import java.util.Arrays;

public class FirstLast {
	public static void main(String[] args) {
//		int[] num = new int[9];
//		num[0] = 12;
//		num[1] = 14;
		
		String[] team = {"Tomas", "Ramesh", "Milena"};
		// ["Tomas"] ["Ramesh"] ["Milena"]
		System.out.println(team[0]);
		System.out.println(team[1]);
		System.out.println(team[2]);
		// team[3] = "Bek";
		
		String[] team2 = new String[3];
		team2[0] = "Tomas";
		team2[1] = "Ramesh";
		team2[2] = "Milena";
		// team2[3] = "Bek";
		
		System.out.println(team); // [Ljava.lang.String;@1dbd16a6
		// Array works the same way as objects do.
		System.out.println(Arrays.toString(team)); // [Tomas, Ramesh, Milena]
		
		// we can use .length to find out size of array
		int arrSize = team.length;
		System.out.println("Size of array: " + arrSize);
		
		//                  0     1    2     3     4     5     6
		double[] tmpWeek = {32, 35.5, 25.7, 26.9, 31.5, 29.9, 28.1};
		System.out.println("Size: " + tmpWeek.length);
		// TODO print first and last element of array without knowing the size of array
		System.out.println("First: " + tmpWeek[0]);
		System.out.println("Last: " + tmpWeek[tmpWeek.length - 1]);
		
	}
}





