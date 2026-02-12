package vn.devpro.lesson07.assignment04;

public abstract class Staff {
	
	String code;
	String name;
	String dateInString;
	
	double salary;
	
	
	public Staff() {
		
		super();
	}
	
//	public Staff(String code, String name, String dateInString, double salary) {
//		
//		super();
//		this.code = code;
//		this.name = name;
//		this.dateInString = dateInString;
//		this.salary = salary;
//		
//	}
	
	public abstract void countSalary(String dayNowString);
	public abstract void display() ;

}
