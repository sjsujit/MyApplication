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
		Address a2 = new Address("Huntington", "MD", 20774, "workhard");
		Address a3 = new Address("Berkley", "MD", 20773, "whyme");
		Address a4 = new Address("yoyo", "MD", 20772, "hourly");
		Address a5 = new Address("madland", "MD", 20771, "rush");

		Customer c1 = new Customer(5, "Sujit", "Jadhav", p1, a1);
		Customer c2 = new Customer(4, "Vansh", "patel", p2, a2);
		Customer c3 = new Customer(6, "Prajna", "Mendon", p3, a3);
		Customer c4 = new Customer(3, "John", "Marshall", p4, a4);
		Customer c5 = new Customer(1, "Akash", "Kodre", p5, a5);

		Order o1 = new Order(1001, c1, LocalDate.parse("2018-07-01"), 2000.00);
		Order o2 = new Order(1002, c2, LocalDate.parse("2014-07-01"), 3000.00);
		Order o3 = new Order(1003, c3, LocalDate.parse("2015-07-01"), 4000.00);
		Order o4 = new Order(1004, c4, LocalDate.parse("2013-07-04"), 5000.00);
		Order o5 = new Order(1005, c5, LocalDate.parse("2015-07-05"), 6000.00);

		List<Order> myList = new ArrayList<Order>();
		myList.add(o1);
		myList.add(o2);
		myList.add(o3);
		myList.add(o4);
		myList.add(o5);

		System.out.println("\n****************Original List: *******************");
		myList.forEach(System.out::println);
		System.out.println("\n****************Sorted List using FirstName: *********************");
		Collections.sort(myList, new CompareByName());
		myList.forEach(System.out::println);

		// System.out.println("\n****************Original List: *******************");
		// myList.forEach(System.out::println);
		System.out.println("\n*******************Sorted List using OrderID: ********************** ");
		Collections.sort(myList, new CompareById());
		myList.forEach(System.out::println);

		// System.out.println("\n****************Original List: *******************");
		// myList.forEach(System.out::println);
		System.out.println("\n**********************Sorted List using Address zipcode:***********************");
		Collections.sort(myList, new CompareByAddress());
		myList.forEach(System.out::println);

		// System.out.println("\n****************Original List: *******************");
		// myList.forEach(System.out::println);
		System.out.println("\n****************************Sorted List using Date: **************************");
		Collections.sort(myList, new CompareByDate());
		myList.forEach(System.out::println);

		SearchingOperation.searchByFirstName(myList);
		SearchingOperation.searchByLastName(myList);
		
		

	}
 
 
}
