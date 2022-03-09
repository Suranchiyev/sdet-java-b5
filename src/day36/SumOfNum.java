package day36;

public class SumOfNum {
	public static void main(String[] args) {
		int num = 12345;
		// Find sum of that number 1+2+3+4+5= 15 -> output is 15
		
		// Option #1: 
		// 0. create empty sum variable that will hold actual sum
		// 1. convert to string and 
		// 2. loop over string by getting each char
		// 3. convert each char to int and add to the sum variable 
		
		int sum = 0;    
		//    "12345"
		String strNum = String.valueOf(num);
		//           : ['1','2','3','4','5']
		for (char ch : strNum.toCharArray()) {
			// 15 +=  
			sum +=  Integer.parseInt(String.valueOf(ch));
		}
		System.out.println("sum 1: " + sum);
		
		// Option #2:
		// % and /
		// any number you % 10 will give you last digit
		// any number you / 10 will remove last digit
		int num2 = 12345;
		int sum2 = 0;
		while (num2 > 0) {
			sum2 += num2 % 10;
			num2 = num2 / 10;
		}
		System.out.println("sum 2: " + sum2);
	}
}
