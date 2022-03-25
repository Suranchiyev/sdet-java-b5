package day45;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// LocalDate
// LacalTime
// LocalDateTime
// they are all immutable
public class DateTimePractice {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		// in order to change LocalDateTime we need to reassign
		now = now.minusHours(500);
		System.out.println(now);
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MM/dd/YY, hh:mm");
		String dateTime = f.format(now);
		System.out.println(dateTime);
	}
}
