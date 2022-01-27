package day13;

public class DayOfWeek2 {
	public static void main(String[] args) {
		printNumOfDay("Mon"); // Mon: 1
		printNumOfDay("Sun"); // Sun: 0
		printNumOfDay("Fri"); // Fri: 5
		printNumOfDay("apple"); // Invalid input
	}
	
	/*
	 * "Sun" -> Sun: 0
	 * "Mon" -> Mon: 1
	 * "Tue" -> Tue: 2
	 * "Wed" -> Wed: 3
	 * "Thur"-> Thur: 4
	 * "Fri" -> Fri: 5
	 * "Sat" -> Sat: 6
	 * otherwise invalid input.
	 */
	public static void printNumOfDay(String day) {
		switch(day) {
		case "Sun":
			System.out.println("Sun: 0");
			break;
		case "Mon":
			System.out.println("Mon: 1");
			break;
		case "Tue":
			System.out.println("Tue: 2");
			break;
		case "Wed":
			System.out.println("Wed: 3");
			break;
		case "Thur":
			System.out.println("Thur: 4");
			break;
		case "Fri":
			System.out.println("Fri: 5");
			break;
		case "Sat":
			System.out.println("Sat: 6");
			break;
		default:
			System.out.println("Invalid input.");
		}
	}
}
