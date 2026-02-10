package vn.devpro.lesson07.assignmen01;

public class TamGiac extends DoanThang{
	
	double ac;
	double bc;
	
	double chuvi;
	double dientich;
	
	Diem diemC;
	
	public TamGiac() {
		
		super();
		
	}
	
	public TamGiac(Diem diemA, Diem diemB, Diem diemC) {
		super();
		this.diemA = diemA;
		this.diemB = diemB;
		this.diemC = diemC;
		
		
	}
	
	public void tinh3Canh() {
		
		this.ab = tinhDoDai(this.diemA, this.diemB);
		this.ac = tinhDoDai(this.diemA, this.diemC);
		this.bc = tinhDoDai(this.diemB, this.diemC);
		
	}


	
	

	public void chuvi() {
		this.chuvi = (this.ab + this.ac + this.bc)/2;
	}
	
	
	public void dientich() {
		
		
		this.dientich = Math.sqrt(this.chuvi*(this.chuvi-this.ab) * (this.chuvi-this.ac) * (this.chuvi-this.bc));
	}
}