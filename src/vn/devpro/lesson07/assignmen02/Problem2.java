package vn.devpro.lesson07.assignmen02;


import java.util.Scanner;
public class Problem2 {
	

	
	public static void minPrice(HangDienTu[] hang) {
		
		double min = hang[0].price;
		for(HangDienTu ha : hang) {
			
			if(min > ha.price) {
				
				min = ha.price;
			}
		}
		for(HangDienTu ha : hang) {
			
			if(ha.price == min) {
				
				System.out.printf("%-15s %-15s %-15s %-15s %-15s %n", ha.code, ha.name, ha.date, ha.power, ha.price);
			}
		}
	}
	
	public static void input(HangDienTu[] hang, int n) {

		
		for(int i = 0; i < n;i++) {
			
			System.out.printf("Nhap san pham thu %d %n", i+1);
			
			hang[i] = new HangDienTu();
			hang[i].nhap();
		}
		

		
	}
	
	public static void output(HangDienTu[] hang) {
		
		for(HangDienTu ha : hang) {
			
			ha.xuat();
		}
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap so luong hang hoa (n): ");
		int n = Integer.parseInt(sc.nextLine());
		HangDienTu[] hang = new HangDienTu[n];
		
		input(hang, n);
		
		
		
		
		do {
			
			System.out.println("\t\t\t Chon chuc nang: ");
			System.out.println("1.In danh sach hang");
			System.out.println("2.In hang co gia tien thap nhat");
			System.out.println("Lua chon cua ban: ");
			
			int choose = Integer.parseInt(sc.nextLine());
			
			switch(choose) {
			
			
			case 1:
				System.out.printf("%-15s %-15s %-15s %-15s %-15s %n", "Ma" , "Ten", "Ngay sx", "Cong suat", "Gia");
				output(hang);
			
			break;
				
			case 2:
				minPrice(hang);
			break;
				
			case 0:
				System.exit(0);
			default: 
				System.out.println("Lua chon sai vui long nhap lai");
				
			
				
				
			}
			
			
		}
		
		while(true);
		
		
		
		
	}

}
