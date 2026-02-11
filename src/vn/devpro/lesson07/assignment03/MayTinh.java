package vn.devpro.lesson07.assignment03;




public class MayTinh extends HangDienTu{

	double hdd;
	double ram;
	double cpu;
	
	
	public MayTinh() {
		
		super();
	}
	public MayTinh(String code, String name, double amount, double price,  String manu ,double power, double ram, double cpu, double hdd) {
		
		super(code, name, amount, price, manu,power);
		
		this.hdd = hdd;
		this.ram = ram;
		this.cpu = cpu;
	}
	
	@Override
	public void display() {
System.out.printf("%-10s %-10s %-10.0f %-10.0f %-10.0f %-10s %-10.0f %-10.0f %-10.0f %n",
				
				this.code,
				this.name,
				this.amount,
				this.price,
				this.power,
				this.manu,
				this.hdd,
				this.ram,
				this.cpu);
		
	}

}
