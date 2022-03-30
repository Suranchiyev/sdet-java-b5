package day46;

public class IsNumericOnly {
	public static void main(String[] args) {
		System.out.println(isNumericOnly("1234"));
		System.out.println(isNumericOnly("1234a"));
		System.out.println(isNumericOnly("12a34"));
		System.out.println("---------");
		System.out.println(isNumericOnly2("1234"));
		System.out.println(isNumericOnly2("1234a"));
		System.out.println(isNumericOnly2("12a34"));
	}
	
	public static boolean isNumericOnly(String str) {
		for (char ch : str.toCharArray()) {
			if (!Character.isDigit(ch)) {
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean isNumericOnly2(String str) {
		try {
			Integer.parseInt(str); 
			return true;
			
		} catch(NumberFormatException e) {
			return false;
		}
	}
}
