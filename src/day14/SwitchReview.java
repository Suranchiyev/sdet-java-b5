package day14;

public class SwitchReview {
	public static void main(String[] args) {
		String valueForSwitch = "apple";
		
		//        "apple"
		switch(valueForSwitch) {
		case "orange":
			System.out.println("Let's eat orange!");
			break;
			
		case "apple":
			System.out.println("Let's eat apple!");
			break;
			
		case "kiwi":
			System.out.println("Let's eat kiwi!");
			break;
			
		default:
			System.out.println("I cannot it that.");		
		}
	}
	
	public static String breakfast(String str) {
		String res;
		switch(str) {
		case "orange":
			res = "Let's eat orange";
			break;
		case "apple":
			res = "Let's eat apple";
			break;
		case "kiwi":
			res = "Let's eat kiwi";
			break;
		default:
			res = "I cannot it that.";
		}
		
		return res;
	}
}
