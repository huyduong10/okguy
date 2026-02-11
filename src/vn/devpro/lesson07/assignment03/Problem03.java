package vn.devpro.lesson07.assignment03;

import java.util.Scanner;
public class Problem03 {

	
	
	public static void display(HangDienTu[] hang) {
		
		
		for(HangDienTu ha: hang) {
			
			ha.display();
			}
		
	}
	
	public static void displayTv(HangDienTu[] hang) {
		
		for(HangDienTu ha: hang) {
			
			if(ha instanceof TiVi) {
				ha.display();
			}
		}
	}
	
	public static void displayMayTinh(HangDienTu[] hang) {
		
		for(HangDienTu ha : hang) {
			
			if(ha instanceof MayTinh) {
				
				ha.display();
			}
		}
	}
	
	
	public static void main(String[] args) {

		HangDienTu[] hang = new HangDienTu[7];
//		public TiVi(String code, String name, double amount, double price, String manu, double power, String brand, double inchs) {
			
		hang[0] = new TiVi("SONE-321", "Television", 3, 1900000 ,"SamSung",123, "Samsung", 55);
		hang[1] = new TiVi("SSIS-321", "Television", 4, 00000 ,"XiaoMi",43, "Samsung", 60);
		hang[2] = new TiVi("JUR-321", "Television", 7, 2100000 ,"Apple",23, "Samsung", 65);
//		public MayTinh(String code, String name, double amount, double price, String manu, double power, double ram, double cpu, double hdd) {
			
		hang[3] = new MayTinh("SONE-321", "Computer", 4, 10000000,"Thinklap", 43, 16, 3,128 );
		hang[4] = new MayTinh("Think", "Computer", 5, 53000000,"lenovo", 43, 16, 3,128 );
		hang[5] = new MayTinh("JUR123", "Computer", 8, 10000000,"acer", 43, 64, 3,256 );
		hang[6] = new MayTinh("SSIS321", "Computer", 6, 10000000,"intel", 43, 32, 2,512 );
		Scanner sc =new Scanner(System.in);
		
		do {
			

			System.out.println("1.Hien thi tat ca danh sach");
			System.out.println("2.Hien thi danh sach ti vi");
			System.out.println("3.Hien thi danh sach may tinh");
			System.out.println("Chon 1-3: ");
			
			int n = Integer.parseInt(sc.nextLine());
			
			switch(n) {
			
			case 1:
				display(hang);
				break;
				
			case 2:
				displayTv(hang);
				break;
				
			case 3:
				
				displayMayTinh(hang);
				break;
			case 0:
				System.exit(0);
				
			default:
				System.out.println("Lua chon khong hop le, nhap lai");
			}
			
			
		}
		
		while(true);
		
	
		
	}	

	 
	     
	     
}
