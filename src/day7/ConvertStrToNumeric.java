package day7;

public class ConvertStrToNumeric {
	public static void main(String[] args) {
		String strNum = "24";
		System.out.println(strNum); // 24
		
		// Integer.parseInt(strWeWantToConvert) 
		// It converts String to numeric int value
		int num = Integer.parseInt(strNum);
		System.out.println(num + 6); // 30
		
		strNum = "99.9";
		double dNum = Double.parseDouble(strNum);
		System.out.println(dNum);
		
		strNum = "ABC";
		// num = Integer.parseInt(strNum); NumberFormatException
		// The string value should be numeric in order to convert.
	}
}
