package vn.devpro.lesson07.assignmen01;

import java.util.Scanner;
public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Diem a = new Diem();
		Diem b = new Diem();
		Diem c = new Diem();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap toa do dinh A: ");
		System.out.println("Nhap xA: ");
		a.x = Double.parseDouble(sc.nextLine());
		System.out.println("Nhap yA: ");
		a.y = Double.parseDouble(sc.nextLine());
		
		System.out.println("Nhap toa do dinh A: ");
		System.out.println("Nhap xB: ");
		b.x = Double.parseDouble(sc.nextLine());
		System.out.println("Nhap yB: ");
		b.y = Double.parseDouble(sc.nextLine());
		
		System.out.println("Nhap toa do dinh A: ");
		System.out.println("Nhap xC: ");
		c.x = Double.parseDouble(sc.nextLine());
		System.out.println("Nhap yC: ");
		c.y = Double.parseDouble(sc.nextLine());
		
		TamGiac tamgiac = new TamGiac(a,b,c);
		
		
		tamgiac.tinh3Canh();

		
		tamgiac.chuvi();
		tamgiac.dientich();
		
		System.out.printf("Dien tich cua tam giac la: %.2f", tamgiac.dientich);
		
		
	}

}
