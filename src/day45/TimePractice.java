package day45;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimePractice {
	// LocalDate
	// LocalTime
	// LocalDateTime
	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		System.out.println("Time: " + now);
		
		LocalTime newTime = now.plusMinutes(100);
		System.out.println(newTime);
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("hh:mm");
		String time = f.format(now);
		System.out.println(time);
		
		f = DateTimeFormatter.ofPattern("HH:mm");
		time = f.format(now);
		System.out.println(time);
	}
}
