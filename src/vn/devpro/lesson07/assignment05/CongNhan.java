package vn.devpro.lesson07.assignment05;

public class CongNhan extends NhanSu{
	
	CongViec work;
	double salaryLevel;
	double workDay;
	
	
//	CongViec work;
//	String firstName;
//	String lastName;
//	Date dateOfBirth;
	
	public CongNhan() {
		
		super();
	}
	public CongNhan(String staffCode, String firstName, String lastName, Date dateOfBirth, String workCode, String workName) {
		
		
		
		super(staffCode, firstName, lastName, dateOfBirth);
		
		
		this.work.workCode = workCode;
		this.work.workName  = workName;
		
		
	}
	
	public double salary() {
		
		
		return (this.salaryLevel * 3500000 + this.workDay * 60000);
	}
	
	
	public void display() {
		
		
		System.out.printf("%-10s %-20s %-15s %-15s %-15s %-15s ", 
				"Ma CN", 
				"Ho Ten", 
				"Ngay sinh", 
				"Bac luong", 
				"So ngay cong", 
				"Luong");
	}
	

}
