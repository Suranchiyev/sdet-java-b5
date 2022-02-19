package day27;

public class Temp {
	public static void main(String[] args) {
		double[] temp = {32, 30, 25.7, 26,34, 31.5, 29};
		
		// find out sum from temp
		double sum = 0.0;
		
		// loop to go over the array
		for (int i = 0; i < temp.length; i++) {
			// keep adding element value to sum
			sum += temp[i];
		}
		
		System.out.println("Sum is " + sum); // 208.2
		
		
		// find out average value from temp
		double averageTemp = sum / temp.length;
		System.out.println("Average tem is " + averageTemp);
		
		// TODO print value from temp array that greater than average value		
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] > averageTemp) {
				System.out.println(temp[i]);
			}
		}
	}
}
