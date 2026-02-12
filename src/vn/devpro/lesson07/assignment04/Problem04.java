package vn.devpro.lesson07.assignment04;




import java.time.LocalDate;
import java.time.temporal.ChronoUnit;





public class Problem04 {
	


	public static void main(String[] args) {
		
		
		Staff[] staffs = new Staff[10];
		
		staffs[0] = new ProductStaff("20215059", "Duong duc Huy", "2026-02-12", 32);
		staffs[1] = new ProductStaff("20215054", "Nguyen tien do", "2023-03-12", 52);
		staffs[2] = new ProductStaff("20215051", "quach ngoc cuc", "2024-04-12", 12);
		staffs[3] = new ProductStaff("20215052", "nguyen cuong doanh", "2021-06-12", 42);
		staffs[4] = new ProductStaff("20215053", "nguyen tiep tai", "2022-02-17", 36);
		
		staffs[5] = new OfficeStaff("20215053", "nguyen tiep tai", "2021-02-20", 1500000, 12);
		staffs[6] = new OfficeStaff("20225053", "nguyen tien tai", "2020-02-21", 2500000, 0);
		staffs[7] = new OfficeStaff("20235053", "nguyen tuan thanh", "2019-05-12", 3500000, 1);
		staffs[8] = new OfficeStaff("20245053", "nguyen tien thanh", "2013-07-23", 2500000, 2);
		staffs[9] = new OfficeStaff("20216053", "nguyen vinh khanh", "2014-04-25", 3500000, 3);
		
		        
		        
		                          

				
				
				
				
		
//		
		String dayNowString =   "2026-02-12";
//		String date = "2025-02-12";
		
		LocalDate dayNow = LocalDate.parse(dayNowString);
//		LocalDate day2 = LocalDate.parse(date);
		
		
//		long day =   ChronoUnit.DAYS.between(day1,day2);
//		
//		System.out.println("ngay " + day);
		
		double countSalary = 0;
		
		for(Staff staff : staffs) {
			
			staff.display();
			staff.countSalary(dayNowString);
			
			countSalary += staff.salary;
		}
		
		System.out.printf("Tong so tien phai tra moi thang: %.2f", countSalary);

	}

}
