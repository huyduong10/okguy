package vn.devpro.lesson07.assignmen02;
import java.util.Scanner;
public class HangDienTu extends SanPham {
	
	double price;
	double power;
	Scanner sc = new Scanner(System.in);
	
	public double getPrice() {
		
		return price;
		
		
	}
	
	void nhap() {
		
		System.out.println("Enter code of product: ");
		this.code = sc.nextLine();
		System.out.println("Enter name of product: ");
		this.name = sc.nextLine();
		
		System.out.println("Enter date of product: ");
		this.date = sc.nextLine();
		System.out.println("Enter power of product: ");
		this.power = Double.parseDouble(sc.nextLine());
		System.out.println("Enter price of product: ");
		this.price = Double.parseDouble(sc.nextLine());
		
		
		
		
		
	}
	
	void xuat() {
		
		System.out.printf("%-15s %-15s %-15s %-15s %-15s %n", this.code, this.name, this.date, this.power, this.price);
		
		
		
		
	}
}
