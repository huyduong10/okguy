package vn.devpro.lesson07.assignment05;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.Scanner;
public class Problem05 {
	
	
	public static CongNhan[] insertK(int k, CongNhan[] stuffs, CongNhan stuff) {
		
	CongNhan[] temp = new CongNhan[stuffs.length + 1];
		
	for(int i = 0; i < stuffs.length; i++) {
		
		
			
		if(i < k -1) {
			
			temp[i] = stuffs[i];
		} else 
		if(i == k -1) {
			temp[i] = stuff;
		} else
		 {
			temp[i] = stuffs[i-1];
		}
		
		
		
		
	}
	
	return temp;
		

		
	}
	
	public static void main(String[] args) {
		
	
        
		
		int m = 0;
        CongNhan[] stuffs = new CongNhan[10];
        
        Scanner sc = new Scanner(System.in);
        
        do {
        	
        	System.out.println("Menu");
            System.out.println("0.Texing infomation employee");
            System.out.println("1.Display employee list");
            System.out.println("2.Display employee list have salary low 5 million");
            System.out.println("3.Addition a employee in list with index = k & re-display list");
            System.out.println("4. Calculate count salary of all employee & re-display");
            System.out.println("5.Moving all employee havenot ");
            int n = Integer.parseInt(sc.nextLine());
            switch(n) {
            
            
            case 0: 
            System.out.println("Enter the number employee want texing information:  ");
            m = Integer.parseInt(sc.nextLine());
            
            for(int i=0; i < m; i++) {
        	   
               System.out.println("\t\tInformation of employee " + (i+1));
        	   
        	   System.out.println(" Enter code stuff: ");
        	   String stuffCode = sc.nextLine();
        	   
        	   System.out.println("Enter first name: ");
        	   String firstName = sc.nextLine();
        	   
        	   System.out.println("Enter last name: ");
        	   String lastName = sc.nextLine();
        	   
        	   System.out.println("Enter date of birth(dd mm yyyy): ");
        	   
        	   int day = sc.nextInt();
        	   int month = sc.nextInt();
        	   int year = sc.nextInt();
        	   sc.nextLine();
        	   Date date = new Date(day, month, year);
        	   
        	   System.out.println("Enter work code: ");
        	   String workCode = sc.nextLine();
        	   
        	   System.out.println("Enter work name: ");
        	   String workName = sc.nextLine();
        	   
        	   
        	   
        	   System.out.println("Enter code salary level: ");
        	   double salaryLevel = Double.parseDouble(sc.nextLine());
        	   
        	   System.out.println("Enter work day: ");
        	   double workDay = Double.parseDouble(sc.nextLine());
        	   
        	   stuffs[i] = new CongNhan(stuffCode, firstName, lastName, date, workCode, workName, salaryLevel,workDay);

           }
            
            break;
            
            case 1:
            	for(int i = 0; i < m; i++) {
            		
            		stuffs[i].display();
            	}
            	
            case 2:
            	for(int i = 0; i < m; i++) {
            		
            		if(stuffs[i].salary() < 5000000 ){
            			stuffs[i].display();
            			
            		}
            		
            	}
            break;
            case 3:
            	
            	System.out.println("Enter k position want addition");
            	int k = Integer.parseInt(sc.nextLine());
            	
            	System.out.println(" Enter code stuff: ");
         	   String stuffCode = sc.nextLine();
         	   
         	   System.out.println("Enter first name: ");
         	   String firstName = sc.nextLine();
         	   
         	   System.out.println("Enter last name: ");
         	   String lastName = sc.nextLine();
         	   
         	   System.out.println("Enter date of birth(dd mm yyyy): ");
         	   
         	   int day = sc.nextInt();
         	   int month = sc.nextInt();
         	   int year = sc.nextInt();
         	   sc.nextLine();
         	   Date date = new Date(day, month, year);
         	   
         	   System.out.println("Enter work code: ");
         	   String workCode = sc.nextLine();
         	   
         	   System.out.println("Enter work name: ");
         	   String workName = sc.nextLine();
         	   
         	   
         	   
         	   System.out.println("Enter code salary level: ");
         	   double salaryLevel = Double.parseDouble(sc.nextLine());
         	   
         	   System.out.println("Enter work day: ");
         	   double workDay = Double.parseDouble(sc.nextLine());
         	   
         	   CongNhan addStuff = new CongNhan(stuffCode, firstName, lastName, date, workCode, workName, salaryLevel,workDay);
         	   
         	   
         	   stuffs = insertK(k,stuffs, addStuff);
         	   
         	  for(int i = 0; i < stuffs.length; i++) {
          		
          		stuffs[i].display();
          	}
         	   
         	   
            	
           
         }
        	
        }
        
        while(true);
        
        

        
    }
}


