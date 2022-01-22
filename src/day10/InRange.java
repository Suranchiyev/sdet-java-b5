package day10;

public class InRange {
	public static void main(String[] args) {
		System.out.println(inRange(12)); // true
		System.out.println(inRange(7)); // false
		System.out.println(inRange(20)); // true
		System.out.println(inRange(22)); // false
	}
	
	public static boolean inRange2(int num) {
		//      true       true
		//   12 >= 10 AND 12 <= 20
//		if (num >= 10 && num <= 20) {
//			return true;
//		} else {
//			return false;
//		}
		
		return num >= 10 && num <= 20;
	}
	
	/*
	 * - Create a method that accepts one int argument and return boolean
	 * - If method argument within the range from 10 to 20 inclusive
	 *   return true
	 * - Otherwise return false
	 *    
	 * inRange(12) -> true
	 * inRange(7)  -> false
	 * inRange(20) -> true
	 * inRange(22) -> false
	 */
	public static boolean inRange(int num) {
		if (num >= 10) {
			if (num <= 20) {
				return true;
			} else {
				return false;
			} 
			
		} else {
			return false;
		}
	}
}
