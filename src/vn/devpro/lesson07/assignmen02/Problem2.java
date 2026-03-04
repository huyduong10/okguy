package vn.devpro.lesson07.assignmen02;


import java.util.Scanner;
public class Problem2 {
	

	public static void minPrice(HangDienTu[] hang) {
		
		double min = hang[0].price;
		
		for(HangDienTu ha : hang) {
<<<<<<< HEAD
=======
			
>>>>>>> 061b547accffbdf2f39b1016820fb06477c53037
			if(min > ha.price) {
				
				min = ha.price;
			}
		}
		
		
		for(HangDienTu ha : hang) {
			
			if(ha.price == min) {
				
<<<<<<< HEAD
				System.out.printf("%-10s %-10s %-10s %-10s %-10s %n", ha.code, ha.name, ha.date, ha.power, ha.price);
=======
				System.out.printf("%-15s %-15s %-15s %-15s %-15s %n", ha.code, ha.name, ha.date, ha.power, ha.price);
>>>>>>> 061b547accffbdf2f39b1016820fb06477c53037
			}
		}
		
	}

	
<<<<<<< HEAD
=======
	public static void input(HangDienTu[] hang, int n) {

		
		for(int i = 0; i < n;i++) {
			
			System.out.printf("Nhap san pham thu %d %n", i+1);
			
			hang[i] = new HangDienTu();
			hang[i].nhap();
		}
		

		
	}
>>>>>>> 061b547accffbdf2f39b1016820fb06477c53037
	

	public static void main(String[] args) {
		
		
		System.out.println("Nhap so luong san pham (n): ");
		Scanner sc = new Scanner(System.in);
		
<<<<<<< HEAD
		int n = Integer.parseInt(sc.nextLine());
		HangDienTu[] hang = new HangDienTu[n];
		
		
		for(int i = 0; i < n; i ++) {
			hang[i] = new HangDienTu();
=======
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
>>>>>>> 061b547accffbdf2f39b1016820fb06477c53037
			
			System.out.printf("Nhap thong tin san pham thu %d%n", i+1);
			
			hang[i].nhap();
		}
		
		while(true);
		
		
		
		
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
