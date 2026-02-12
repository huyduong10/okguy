package vn.devpro.lesson07.assignment04;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class ProductStaff extends Staff{
	
	
	double products;
	
	
	public ProductStaff() {
		
		super();
	}
	
	public ProductStaff(String code, String name, String date,  double products) {
		
		this.code = code;
		this.name = name;
		this.dateInString = date;
		this.products = products;
		

		
	}
	
	@Override
	public void countSalary(String dayNowString) {
	
		LocalDate dateIn = LocalDate.parse(this.dateInString);
		LocalDate dateNow = LocalDate.parse(dayNowString);
		
		long dayIn = ChronoUnit.DAYS.between(dateIn, dateNow);
		
		
		 dayIn = dayIn / 365;
		 
		this.salary =  products * 35000 + 150000 + 500000 * dayIn;
		
	}
	
	
	@Override
	public void display() {
		System.out.printf("%-15s %-20s %-15s %n", this.code, this.name, this.dateInString);

	}
		
}
