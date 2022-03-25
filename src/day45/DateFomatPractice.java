package day45;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFomatPractice {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		
		System.out.println(today); // 2022-03-24
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MM/dd/YYYY");
		String fDate = f.format(today);
		System.out.println("Today's date is " + fDate);
		
		f = DateTimeFormatter.ofPattern("MMMM dd, YYYY");
		fDate = f.format(today);
		System.out.println(fDate);
		
		f = DateTimeFormatter.ofPattern("MMM dd YY");
		fDate = f.format(today);
		System.out.println(fDate);
		
		// TODO write a code here to change formatting of the date and print it as 
		// this format March.24.2022
		
		f = DateTimeFormatter.ofPattern("MMMM.dd.YYYY");
		fDate = f.format(today);
		System.out.println(fDate); // March.24.2022
	}
}	
