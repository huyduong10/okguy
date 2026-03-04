package vn.devpro.lesson07.assignment05;

public class CongNhan extends NhanSu{
	
	CongViec work = new CongViec();
	double salaryLevel;
	double workDay;
	
	
//	CongViec work;
//	String firstName;
//	String lastName;
//	Date dateOfBirth;
	
	public CongNhan() {
		

		
		super();
	}
	public CongNhan(String staffCode, String firstName, String lastName, Date dateOfBirth, String workCode, String workName, double salaryLevel, double workDay) {
		
		
		
		super(staffCode, firstName, lastName, dateOfBirth);
		
		this.work.workCode = workCode;
		this.work.workName = workName;
		this.salaryLevel = salaryLevel;
		this.workDay = workDay;
		
	}
	
	public double salary() {
		
		
		return (this.salaryLevel * 3500000 + this.workDay * 60000);
	}
	
	
	public void display() {
		

		
		System.out.printf("%-10s %-20s %-15s %-15s %-15s %-15s%n", this.staffCode, this.firstName + " "+ this.lastName, this.dateOfBirth.displayDate(), 
				this.salaryLevel, this.workDay, this.salary());
	}
	

}
