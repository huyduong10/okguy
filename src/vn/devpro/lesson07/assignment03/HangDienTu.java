package vn.devpro.lesson07.assignment03;

public class HangDienTu extends HangHoa{
	
	
	double power;
	
	String manu;
	
	public HangDienTu() {
		
		super();
	}
	
	public HangDienTu(String name, String code, double amount, double price, String manu, double power) {
		
		super(code,name, amount, price);
		this.power = power;
		this.manu = manu;
		
		
	}
	
	@Override
	public void display() {
		
		System.out.printf("%-10s %-10s %-10.0f %-10.0f %-10.0f %-10s %n", 
				this.code,
				this.name,
				this.amount,
				this.price,
				this.power,
				this.manu
				);
	}
}


