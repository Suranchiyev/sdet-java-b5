package day7;

public class NumericToStr {
	public static void main(String[] args) {
		int num = 7;
		String str = "" + num; 
		// when we concatenate string to any type the output is string
		System.out.println(str); // 7
		
		String str1 = String.valueOf(num);
		System.out.println(str1); // 7
	}
}
