package serviceimpl;

import java.util.LinkedHashMap;
import app.*;
import java.util.Scanner;

import module.com.entity.*;

public class RRSservice implements com.service.RRSserviceinterface  {
	Scanner sc=new Scanner(System.in);
	
// <<<< ------ ROOM NUMBER ALLOCATION ----->>>>
	{
		for(int i=101; i<=108; i++) {
			ac.put(i,null);
		}
	}
	{
		for(int i=201; i<=208; i++) {
			nonAc.put(i,null);
		}
	}
	{
		for(int i=301; i<=308; i++) {
			deulx.put(i,null);
		}
	}
	
// <<<< ------ CHECK IN ----->>>>
	@Override
	public void checkIn() {
		System.out.println("-------------Chek In-------------");
		System.out.println("-----------Room Details--------------");
		System.out.println("1.Ac\n2.Non-AC\n3.Delux");
		System.out.println("Enter your option :-");
		int op=sc.nextInt();
		System.out.println("Please enter the room number");
		int roomno=sc.nextInt();
		switch (op) {
		case 1: 
			if(ac.containsKey(roomno) && ac.get(roomno)==null ) {
				allocate(ac, 2500, "AC", roomno);
				System.out.println("Congratulation room is Allocate for You" );
			}
			else {
				System.out.println("Invalid room or Room is not available ");
			}
			break; 
		case 2:if(nonAc.containsKey(roomno) && nonAc.get(roomno)==null ) {
			allocate(nonAc, 1500, "NON-AC", roomno);
			System.out.println("Congratulation room is Allocate for You" );
		}
		else {
			System.out.println("Invalid room or Room is not available ");
		}
		break;
		case 3:if(deulx.containsKey(roomno) && deulx.get(roomno)==null ) {
			allocate(deulx, 3500, "Deulx", roomno);
			System.out.println("Congratulation room is Allocate for You" );
		}
		else {
			System.out.println("Invalid room or Room is not available ");
		}
		break;

		default:
			break;
		}

	}

	// <<<< ------ ROOM INFORMATION ----->>>>
	
	@Override
	public void roomInfo() {
		System.out.println("---------Room Details-------------");
		System.out.println("---------AC-ROOM------------------");
		System.out.println("1.AC\n2.TV\n3.WIFI\n4.Fridge");
		System.out.println("Price:2500/Day");
		System.out.println("---------NON-AC-ROOM------------------");
		System.out.println("1.Fan\n2.TV\n3.WIFI\n4.Fridge");
		System.out.println("Price:1500/Day");
		System.out.println("---------Delux-ROOM------------------");
		System.out.println("1.AC\n2.TV\n3.WIFI\n4.Fridge");
		System.out.println("Price:2500/Day");

	}         

	@Override
	public void checkAvailability() {
		//	    <------ For AC ----->
		System.out.println("-------AC ROOM----------");
		int c=0;
		for(int key:ac.keySet()) {
			if(ac.get(key)==null) {
				System.out.print(key+" ");
				c++;
			}
		}
		if(c==0) {
			System.out.println("All the rooms are occupied");
		}
		System.out.println();
		//    <------ For NON AC ----->
		System.out.println("-------NON-AC-ROOM----------");
		for(int key:nonAc.keySet()) {
			if(ac.get(key)==null) {
				System.out.print(key+" ");
				c++;
			}
		}
		if(c==0) {
			System.out.print("All the rooms are occupied");
		}
		System.out.println();

		//	    <------ For Deluxe ----->
		System.out.println("------- Deluxe ROOM----------");
		//int dc=0;
		for(int key:deulx.keySet()) {
			if(ac.get(key)==null) {
				System.out.print(key+" ");
				c++;
			}
		}
		if(c==0) {
			System.out.println("All the rooms are occupied");
		}
		System.out.println();

	}

	// <<<< ------ ROOM ALLOCATE ----->>>>
	
	@Override
	public void allocate(LinkedHashMap<Integer, Customer> m, double camt, String roomType, int roomno) {
		System.out.println("-----Customer Details--------");
		System.out.println("Please enter Customer Id :-");
		int cid=sc.nextInt();
		sc.nextLine();
		System.out.println("Please Enter the Customer Name:- ");
		String cname=sc.nextLine();
		System.out.println("Please Enter the Customer email");
		String cemail=sc.nextLine();
		System.out.println("Enter the Customer Phone number :-");
		long cphone=sc.nextLong();
		System.out.println("Enter the Customer Age :-");
		int cage=sc.nextInt();
		System.out.println("Enter the Street:-");
		String cstreet=sc.nextLine();
		sc.next();
		System.out.println("Enter the dist:- ");
		String cdist=sc.nextLine();
		sc.next();
		System.out.println("Enter the state :- ");
		String cstate=sc.nextLine();
		sc.next();
		System.out.println("Enter the country:-");
		String cCountry=sc.nextLine();
		sc.next();
		System.out.println("Enter the PinCode:- ");
		String cpin=sc.next();
		Address a=new Address(cpin, cstreet, cdist, cstate, cCountry, cage);
		Customer c=new Customer(cid, cname, cemail, cphone, a, cage, camt, roomType);
		l1.add(c);
		m.put(roomno, c);
		System.out.println(cname+" had been allocate for " +roomType+" Room Nmber is "+roomno);
		System.out.println("Amount need to be pay: "+camt);

	}

	// <<<< ------ CHECK OUT ----->>>>
	
	@Override
	public void checkOut() {
		System.out.println("-------------Chek Out-------------");
		System.out.println("-----------Room Details--------------");
		System.out.println("1.Ac\n2.Non-AC\n3.Delux");
		System.out.println("Enter your option :-");
		int op=sc.nextInt();
		System.out.println("Please enter the room number");
		int roomno=sc.nextInt();
		System.out.println("Enter the Customer Id :-");
		int cid=sc.nextInt();
		switch(op) {
		case 1: if(ac.containsKey(roomno) && ac.get(roomno) !=null && ac.get(roomno).getcId()==cid) {
			System.out.println(ac.get(roomno).getcNmae()+" Thanks for visiting.....!!!!");
			ac.put(roomno, null);
		}
		else {
			System.out.println("Invalid credential...!!!");
		}
		break;
		case 2:
			if(nonAc.containsKey(roomno) && nonAc.get(roomno) !=null && nonAc.get(roomno).getcId()==cid) {
				System.out.println(nonAc.get(roomno).getcNmae()+" Thanks for visiting.....!!!!");
				nonAc.put(roomno, null);
			}
			else {
				System.out.println("Invalid credential...!!!");
			}
			break;
		case 3:
			if(deulx.containsKey(roomno) && deulx.get(roomno) !=null && deulx.get(roomno).getcId()==cid) {
				System.out.println(deulx.get(roomno).getcNmae()+" Thanks for visiting.....!!!!");
				deulx.put(roomno, null);
			}
			else {
				System.out.println("Invalid credential...!!!");
			}
			break;
		default:
			break;
		}
	}
	// <<<< ------ CUSTOMER INFORMATION ----->>>>
	
	@Override
	public void customerInfo() {
		System.out.println("Enter Customer Id or Phno");
		System.out.println("1.Customer Id\n2.Phno");
		int op=sc.nextInt();
		switch(op) {
		case 1:System.out.println("Enter Customer Id");
		int cid=sc.nextInt();
		searchCustomer(cid);
		break;
		case 2:System.out.println("Enter Phno");
		long phno=sc.nextLong();
		searchCustomer(phno);
		break;
		default:System.out.println("Invalid Options.....!!!");
		}
	}
	public void searchCustomer(long phno) {
		int count=0;
		for(int i=0;i<l1.size();i++) {
			if(l1.get(i).getPhoneNo()==phno) {
				Customer data=l1.get(i);
				System.out.println(data.toString());
				count++;
			}
		 }
		if(count==0) {
			System.out.println("Customer Not Found.....!!!");
		}
		System.out.println();
	}

// <<<< ------ ALL CUSTOMER DETAILS ----->>>>
	@Override
	public void findallcustomer() {
		if(l1.size()==0) {
			System.out.println("Database is Empyty......!!!!");
		}else {
			for(Customer ele:l1) {
				System.out.println(ele);
			}

		}
	}
} 