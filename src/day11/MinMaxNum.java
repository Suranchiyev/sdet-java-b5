package day11;

public class MinMaxNum {
	public static void main(String[] args) {
		System.out.println(min(2, 4)); // 2
		System.out.println(min(5, 1, 8)); // 1
		
		System.out.println(min(4, 5, 6, 42)); // 4
		System.out.println(min(5, 7, -6, 2)); // -6
		System.out.println(min(4, 4, 4, 4)); // 4
		
		
	}
	
	public static int min(int num, int num2, int num3, int num4) {
		int fSmall = min(num, num2);
		int sSmall = min(num3, num4);
		int res = min(fSmall, sSmall);
		return res;
	}
	
	public static int min(int num, int num2) {
		if (num < num2) {
			return num;
		} else {
			return num2;
		}
	}
	
	public static int min(int num, int num2, int num3) {
		if (num < num2 && num < num3) {
			return num;
			
		} else if (num2 < num && num2 < num3) {
			return num2;
			
		} else {
			return num3;
		}
	}
	

}
