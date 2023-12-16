package com.java.date;

import java.time.LocalDate;

public class DateExample {

public static void main(String[] args) {
	
	LocalDate date=LocalDate.now();
	System.out.println(date);
	
	String stringDate= "12-JUN-1983";
	
	LocalDate parsedDate=LocalDate.parse(stringDate);
	System.out.println(parsedDate);
	
}
}
