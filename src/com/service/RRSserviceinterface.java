package com.service;

import java.util.*;

import module.com.entity.*;

public interface RRSserviceinterface {
	LinkedHashMap<Integer, Customer> ac=new LinkedHashMap<Integer, Customer>();
	LinkedHashMap<Integer, Customer> nonAc=new LinkedHashMap<Integer, Customer>();
	LinkedHashMap<Integer, Customer> deulx=new LinkedHashMap<Integer, Customer>();// for mapping the room numbers
	ArrayList<Customer> l1=new ArrayList<Customer>(); // Storing the customer details
	void checkIn();
	void roomInfo();
	void checkAvailability();
	void allocate(LinkedHashMap<Integer,Customer> m, double camt,String roomType, int roomno);
	void checkOut();
	void customerInfo();
	void findallcustomer();

	
	
}
