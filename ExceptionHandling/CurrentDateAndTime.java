package ExceptionHandling;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateAndTime {
	
	public static void main(String[] args) {
		
		LocalDate myObj=LocalDate.now();
		LocalTime myObj1=LocalTime.now();
		LocalDateTime myObj2=LocalDateTime.now();
		DateTimeFormatter myDate=DateTimeFormatter.ofPattern("dd-mm-yyyy HH:MM:SS");
		String formateDate=myObj2.format(myDate);
		System.out.println(myObj);
		System.out.println(myObj1);
		System.out.println(myObj2);
		System.out.println(formateDate);
	}

}
