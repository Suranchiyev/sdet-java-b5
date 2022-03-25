package day45;

import java.time.LocalDate;
import java.time.Period;

public class DatePractice {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("Current date: " + today); // 2022-03-24
		
		//                   LocalDate.of(year, month, day);
		LocalDate birthday = LocalDate.of(1996, 03, 26);
		System.out.println("Birthday: " + birthday);
		
		System.out.println("Day of week: " + birthday.getDayOfWeek());
		System.out.println("Is leap yeap: " + birthday.isLeapYear());
		
		Period lifetime = Period.between(birthday, today);
		System.out.println("Number of months from my birthday: " + lifetime.toTotalMonths());
		
		LocalDate afterThreeMonth = today.plusMonths(3);
		System.out.println(afterThreeMonth.getYear());
		System.out.println(afterThreeMonth.getMonth());
		System.out.println(afterThreeMonth.getDayOfMonth());
		
		// LocalDate class is immutable
		System.out.println(today);
	}
}
