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
				
				System.out.printf("%-10s %-10s %-10s %-10s %-10s %n", ha.code, ha.name, ha.date, ha.power, ha.price);
			}
		}
		
	}

	
	

	public static void main(String[] args) {
		
		
		System.out.println("Nhap so luong san pham (n): ");
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		HangDienTu[] hang = new HangDienTu[n];
		
		
		for(int i = 0; i < n; i ++) {
			hang[i] = new HangDienTu();
			
			System.out.printf("Nhap thong tin san pham thu %d%n", i+1);
			
			hang[i].nhap();
		}
		
		
		
		do {
			

			System.out.println("\t\t\t Chon chuc nang");
			System.out.println("1.In danh sach ra man hinh");
			System.out.println("2.In ra cac hang dien tu co gia tien thap nhat");

			int choose = Integer.parseInt(sc.nextLine());
			
		
			switch(choose) {
			
			case 1:
				
				System.out.println("\t\t\t Danh sach san pham");
				System.out.printf("%-15s %-15s %-15s %-15s %-15s %n", "Ma", "Ten", "Ngay sx", "Cong suat", "Gia");
				for(HangDienTu ha : hang) {
					
					System.out.printf("%-15s %-15s %-15s %-15s %-15s %n", ha.code, ha.name, ha.date,ha.power, ha.price);
				}
				break;
				
			case 2:
				System.out.println("San pham co gia tri thap nhat: %n");
				minPrice(hang);
				
				
			}
			
			
		}
		
		while(true);
		
		
		
	}
}
