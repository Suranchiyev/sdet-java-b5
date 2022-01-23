package day11;

public class WarmUp {
	public static void main(String[] args) {
//		System.out.println(evenOddAndTen(9)); // odd
//		System.out.println(evenOddAndTen(20)); // even
//		System.out.println(evenOddAndTen(10)); // 10
		
		String res = evenOddAndTen(9); // odd
		System.out.println(res);
	}
	
	public static String evenOddAndTen(int num) {   
		if (num % 2 == 0 && num != 10) {		
			return "even"; // return will exit from the method
		}
		
		if (num == 10) {
			return "ten";
		} 
		
		return "odd";
	}
	

}
