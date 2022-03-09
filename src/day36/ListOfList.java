package day36;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ListOfList {
	public static void main(String[] args) {
		List<List<Integer>> numbers = new ArrayList<>();
		
		List<Integer> l = new ArrayList<>(Arrays.asList(432, 2, 1, 5, 54));
		numbers.add(l);
	
		numbers.add(new ArrayList<>(Arrays.asList(7, 8, 9, 10)));
		numbers.add(new ArrayList<>(Arrays.asList(0, 5, 7)));
		
		System.out.println(numbers);
		
		System.out.println("-----");
		for (List<Integer> number : numbers) {
			System.out.println(number);
		}
		
		System.out.println("-----");
		
		int sum = 0;
		
		// [[432, 2, 1, 5, 54], [7, 8, 9, 10], [0, 5, 7]]
		
		//       0      3 < 3
		for (int i = 0; i < numbers.size(); i++) {
			//              0 < 4
			for (int j = 0; j < numbers.get(i).size(); j++) {
				//                             1      3     
				System.out.println(numbers.get(i).get(j));
				sum += numbers.get(i).get(j);
			}
		}
		System.out.println("Sum: " + sum);
		
		for (Integer num : numbers.get(0)) {
			System.out.println(num);
		}
	}
}
