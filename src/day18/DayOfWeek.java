package day18;

public class DayOfWeek {
	enum Day {Mon, Tue, Wed, Thur, Fri, Sat, Sun, NextDay};
	
	public static void main(String[] args) {
		myWeek(Day.Mon); // Homework day!
		myWeek(Day.Sat); // Java day!
		myWeek(Day.Tue); // Study day!
		
		myWeek(Day.NextDay); // Invalid day
		System.out.println("-------------------");
		
		myWeek2(Day.Tue); // 
	}

	public static void myWeek2(Day day) {
		switch(day) {
		case Mon:
			System.out.println("Homework day!");
			break;
		case Tue:
		case Thur:
			System.out.println("Study day!");		
			break;
		case Wed:
			System.out.println("Free day!");
			break;
		case Fri:
			System.out.println("Coding day!");
			break;
		case Sat:
		case Sun:
			System.out.println("Java day!");
			break;
		default:
			System.out.println("Invalid day");
		}
	}
	
	/*
	 * Mon       -> Homework day!
	 * Tue, Thur -> Study day!
	 * Wed       -> Free day!
	 * Fri       -> Coding day!
	 * Sat, Sun  -> Java day!
	 */
	public static void myWeek(Day dayArg) {
		if (dayArg == Day.Mon) {
			System.out.println("Homework day!");
			
		} else if (dayArg == Day.Tue || dayArg == Day.Thur) {
			System.out.println("Study day!");
			
		} else if (dayArg == Day.Wed) {
			System.out.println("Free day!");
			
		} else if (dayArg == Day.Fri) {
			System.out.println("Coding day!");
			
		} else if (dayArg == Day.Sat || dayArg == Day.Sun) {
			System.out.println("Java day!");
			
		} else {
			System.out.println("Invalid day");
		}
	}
}
