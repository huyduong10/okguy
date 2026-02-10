package vn.devpro.lesson07.assignmen01;

public class DoanThang {

	
	Diem diemA;
	Diem diemB;
	
	
	double ab;

	
	
	public DoanThang() {
		
		super();
	}
	
	public DoanThang(Diem diemA, Diem diemB) {
		
		this.diemA = diemA;
		this.diemB = diemB;
		
	}
	
	
	
	
	public static double tinhDoDai(Diem diemA, Diem diemB) {
		
		return Math.sqrt(Math.pow((diemA.x -diemB.x),2) + Math.pow((diemA.y-diemB.y),2));
	
	}
	

}
