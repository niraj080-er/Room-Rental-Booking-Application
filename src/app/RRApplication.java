package app;

import java.util.Scanner;

import com.service.RRSserviceinterface;

public class RRApplication {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		RRSserviceinterface r=new serviceimpl.RRSservice();
		System.out.println("---------WELCOME TO ROOM RENTAL SYSTEM----------");
		while(true) {
			System.out.println("-------------Menu------------");
			System.out.println("1.Room Information\n2.Room Available");
			System.out.println("3.Chekn-In\n4.Chek-out\n5.Find Customer\n6.Find All Customer\n7.Exit");
			System.out.println("-------Enter your Option-------");
			int op=sc.nextInt();
			switch (op) {
			case 1: r.roomInfo(); break;
			case 2:r.checkAvailability();break;
			case 3: r.checkIn(); break;
			case 4:r.checkOut();break;
			case 5: r.customerInfo();
			case 6:r.findallcustomer();
			case 7:System.out.println("-------Thank you visit again");
				System.exit(0);break;
			default:System.out.println("------Invalid Option----------");
			
			}
		}
	}
}
