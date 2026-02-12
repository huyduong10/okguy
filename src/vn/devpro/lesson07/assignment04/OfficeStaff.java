package vn.devpro.lesson07.assignment04;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class OfficeStaff extends Staff {
	
	double ofDay;
	
	public OfficeStaff(String code, String name, String date, double salary, double ofDay) {
		
		this.code = code;
		this.name = name;
		this.dateInString = date;
		this.salary = salary;
		this.ofDay = ofDay;
		 
		
	}
	
	

	
	@Override
	public void countSalary(String dayNowString) {
		

		LocalDate dateIn = LocalDate.parse(this.dateInString);
		LocalDate dateNow = LocalDate.parse(dayNowString);
		
		long dayIn = ChronoUnit.DAYS.between(dateIn, dateNow);
		
		
		 dayIn = dayIn / 365;
		
		
		this.salary = this.salary - this.ofDay * 25000  + 150000 + dayIn*50000;
		
		
		
		
		
		
		
	}
	
	@Override
	public void display() {
		
		System.out.printf("%-15s %-20s %-15s %n", this.code, this.name, this.dateInString);
		
		
		
		
	}

}
