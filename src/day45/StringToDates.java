package day45;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringToDates {
	public static void main(String[] args) {
		String str = "Date created: 2023-02-08";
		str = str.substring(str.indexOf(":") + 1).trim();
		System.out.println("srt: " + str);
		
		
		LocalDate dateFromWebsite = LocalDate.parse(str);
		System.out.println("date: " + dateFromWebsite);
		String dayOfWeek = dateFromWebsite.getDayOfWeek().name();
		System.out.println(dayOfWeek);
		
		LocalDate today = LocalDate.now();
		System.out.println("today date: " + today);
		
		if (dateFromWebsite.isBefore(today)) {
			System.out.println("Yes, it was before today");
		} else {
			System.out.println("No, it is after");
		}
		System.out.println("-----------");
		
		String webDateStr = "Deleted date is 03/24/2022";
		// webDateStr = webDateStr.substring(webDateStr.lastIndexOf(" ") + 1);
		String[] parts = webDateStr.split(" ");
		webDateStr = parts[parts.length - 1];
		System.out.println("str: " + webDateStr);
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MM/dd/uuuu");
		LocalDate dateFromWebsite2 = LocalDate.parse(webDateStr, f);
		
		System.out.println(dateFromWebsite2);
		
		LocalDate today2 = LocalDate.now();
		if (today2.equals(dateFromWebsite2)) {
			System.out.println("Yes, it was deleted today");
		} else {
			System.out.println("No, it wasn't");
		}
	}
}
