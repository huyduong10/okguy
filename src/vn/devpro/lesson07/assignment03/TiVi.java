package vn.devpro.lesson07.assignment03;

public class TiVi extends HangDienTu{

	
	String brand;
	double inchs;
	
	public TiVi() {
		
		super();
	}
	public TiVi( String code, String name, double amount, double price, String manu, double power, String brand, double inchs) {
		
		super(code, name, amount, price, manu,power);
		this.brand = brand;
		this.inchs = inchs;
	}
	
	@Override
	public void display() {
		
		System.out.printf("%-10s %-10s %-10.0f %-10.0f %-10.0f %-10s %-10s %-10.0f %n",
				
				this.code,
				this.name,
				this.amount,
				this.price,
				this.power,
				this.manu,
				this.brand,
				this.inchs);
	}
}
