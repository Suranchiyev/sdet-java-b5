package day45;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringToDates2 {
	public static void main(String[] args) {
		String str = "March 8, 2022";
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM d, uuuu");
		LocalDate date = LocalDate.parse(str, f);
		
		System.out.println(date);
		System.out.println(date.getDayOfWeek()); // TUESDAY
	}
}
