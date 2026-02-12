package vn.devpro.lesson07.assignment05;

import java.time.LocalDate;

public class Date {
	
	int day;
	int month;
	int year;
	
	
	public Date() {
		
		super();
	}
	
	public Date(String date) {
		
		super();
		LocalDate local = LocalDate.parse(date);
	}
//	public Date(int day, int month, int year) {
//		
//		
//		this.day = day;
//		this.month = month;
//		this.year = year;
//		
//	}

}
