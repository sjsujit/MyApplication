package com.MyApplication.first;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application {

	public static void main(String[] args) {

		Payment p1 = new Payment(1, 123, "Sujit Jadhav");
		Payment p2 = new Payment(2, 456, "Vansh Patel");
		Payment p3 = new Payment(3, 789, "Prajna Mendon");
		Payment p4 = new Payment(4, 234, "John Marshall");
		Payment p5 = new Payment(5, 345, "Akash Kodre");

		Address a1 = new Address("Hanover", "MD", 20770, "Cabel");
		Address a2 = new Address("Huntington", "MD", 20770, "workhard");
		Address a3 = new Address("Berkley", "MD", 20770, "whyme");
		Address a4 = new Address("yoyo", "MD", 20770, "hourly");
		Address a5 = new Address("madland", "MD", 20770, "rush");

		Order o1 = new Order(1001, LocalDate.parse("2019-07-01"), 2000.00, p1, a1);
		Order o2 = new Order(1002, LocalDate.parse("2019-07-01"), 3000.00, p2, a2);
		Order o3 = new Order(1003, LocalDate.parse("2019-07-01"), 4000.00, p3, a3);
		Order o4 = new Order(1004, LocalDate.parse("2019-07-04"), 5000.00, p4, a4);
		Order o5 = new Order(1005, LocalDate.parse("2019-07-05"), 6000.00, p5, a5);

		Customer c1 = new Customer(5, "Sujit", "Jadhav", o1);

		Customer c2 = new Customer(4, "Vansh", "patel", o2);

		Customer c3 = new Customer(6, "Prajna", "Mendon", o3);

		Customer c4 = new Customer(3, "John", "Marshall", o4);

		Customer c5 = new Customer(1, "Akash", "Kodre", o5);

		List<Customer> myList = new ArrayList<Customer>();
		myList.add(c1);
		myList.add(c2);
		myList.add(c3);
		myList.add(c4);
		myList.add(c5);

		System.out.println("Original List: ");
		myList.forEach(System.out::println);
		System.out.println("Sorted List: ");
		Collections.sort(myList, new CompareCustomer() );
		myList.forEach(System.out::println);
		
	 	
	

	}

}
