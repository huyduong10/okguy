package vn.devpro.lesson07.assignment03;

public class HangHoa {
	
	String code;
	String name;
	double amount;
	double price;
	
	public HangHoa() {
		
		super();
	}
	public HangHoa(String code, String name, double amount, double price) {
		
		this.code = code;
		this.name = name;
		this.amount = amount;
		this.price = price;
		
	}
	
	public void display() {
		System.out.printf("%-10s %-10s %-10.0f %-10.0f %n", 
				this.code,
				this.name,
				this.amount,
				this.price);
	}

}
