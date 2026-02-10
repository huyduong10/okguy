package vn.devpro.lesson07.assignmen02;


import java.util.Scanner;
public class Problem2 {
	

	
	public static void minPrice(HangDienTu[] hang) {
		
		double min = hang[0].price;
		for(HangDienTu ha : hang) {
			
			if(min < ha.price) {
				
				min = ha.price;
			}
		}
		for(HangDienTu ha : hang) {
			
			if(ha.price == min) {
				
				System.out.printf("%-10S %-10S %-10s %-10s %-10s %n", ha.code, ha.name, ha.date, ha.power, ha.price);
			}
		}
	}
	
	public static void input(HangDienTu[] hang, int n) {

		
		for(int i = 0; i < n; i++) {
			
			hang[i] = new HangDienTu();
			System.out.printf("Nhap thong tin san pham thu %d:", i+1);
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
		
		HangDienTu[] hang;
		
		
		int choose = Integer.parseInt(sc.nextLine());
		
		switch(choose) {
		
		
		case 1:
			System.out.println("Nhap so luong hang hoa: (n)");
			int n = Integer.parseInt(sc.nextLine());
			
			hang = new HangDienTu[n];
			input(hang,n);
		
		break;
			
		case 2:
		output(hang);
		break;
			
		case 3:
			
		break;
			
			
		}
		
		
		
	}

}
