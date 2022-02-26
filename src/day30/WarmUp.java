package day30;

public class WarmUp {
	public static void main(String[] args) {
		// toCharArray()
		String str = "hello";
		
		// [h, e, l, l, o]
		char[] chArr = str.toCharArray();
		
		for (char letter : chArr) {
			System.out.println(letter);
		}
		System.out.println("-----------");
		
		String strNum = "John Doe 25";
		//   0     1   2
		// [John, Doe, 25]
		String[] arr = strNum.split(" ");
				
		String firstName = arr[0];
		String lastName = arr[1];
		int age = Integer.parseInt(arr[2]);
		
		System.out.println("First name: " + firstName);
		System.out.println("Last name: " + lastName);
		System.out.println("Age: " + age);
	}
}
