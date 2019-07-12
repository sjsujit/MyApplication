package com.MyApplication.first;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Application {

	public static void main(String[] args) {

		Payment p1 = new Payment(1, (short) 123, "Sujit Jadhav", LocalDate.parse("2020-07-02"));
		Payment p2 = new Payment(2, (short) 456, "Vansh Patel", LocalDate.parse("2022-07-10"));
		Payment p3 = new Payment(3, (short) 789, "Prajna Mendon", LocalDate.parse("2020-06-29"));
		Payment p4 = new Payment(4, (short) 234, "John Marshall", LocalDate.parse("2023-03-23"));
		Payment p5 = new Payment(5, (short) 345, "Akash Kodre", LocalDate.parse("2024-05-23"));

		Address a1 = new Address("Hanover", "MD", 20770, "Cabel");
		Address a2 = new Address("Huntington", "MD", 20774, "workhard");
		Address a3 = new Address("Berkley", "MD", 20773, "whyme");
		Address a4 = new Address("yoyo", "MD", 20770, "hourly");
		Address a5 = new Address("madland", "MD", 20771, "rush");

		Customer c1 = new Customer(5, "Sujit", "Jadhav", p1, a1);
		Customer c2 = new Customer(4, "Vansh", "patel", p2, a2);
		Customer c3 = new Customer(6, "Prajna", "Mendon", p3, a3);
		Customer c4 = new Customer(3, "John", "Marshall", p4, a4);
		Customer c5 = new Customer(1, "Akash", "Kodre", p5, a5);

		Order o1 = new Order(c1, LocalDate.parse("2018-07-01"),null);
		Order o2 = new Order(c2, LocalDate.parse("2014-07-01"),null);
		Order o3 = new Order(c3, LocalDate.parse("2015-07-01"),null);
		Order o4 = new Order(c4, LocalDate.parse("2013-07-04"),null);
		Order o5 = new Order(c5, LocalDate.parse("2015-07-05"),null);
		
		List<Order> myList = new ArrayList<Order>();
		myList.add(o1);
		myList.add(o2);
		myList.add(o3);
		myList.add(o4);
		myList.add(o5);

		/*
		 * System.out.println("\n****************Original List: *******************\n\n"
		 * ); myList.forEach(System.out::println); System.out.
		 * println("\n****************Sorted List using FirstName: *********************\n\n"
		 * ); Collections.sort(myList, new CompareByName());
		 * myList.forEach(System.out::println);
		 * 
		 * //
		 * System.out.println("\n****************Original List: *******************");
		 * // myList.forEach(System.out::println); System.out.
		 * println("\n*******************Sorted List using OrderID: **********************\n\n"
		 * ); Collections.sort(myList, new CompareById());
		 * myList.forEach(System.out::println);
		 * 
		 * //
		 * System.out.println("\n****************Original List: *******************");
		 * // myList.forEach(System.out::println); System.out.
		 * println("\n**********************Sorted List using Address zipcode:**********************\n\n"
		 * ); Collections.sort(myList, new CompareByAddress());
		 * myList.forEach(System.out::println);
		 * 
		 * //
		 * System.out.println("\n****************Original List: *******************");
		 * // myList.forEach(System.out::println); System.out.
		 * println("\n****************************Sorted List using Date: **************************\n\n"
		 * ); Collections.sort(myList, new CompareByDate());
		 * myList.forEach(System.out::println);
		 */
		System.out.println("\n****************************Sort by firstname : **************************\n\n");
		SearchingOperation.CompareByName(myList);
		System.out.println("\n****************************Sort by Order Id : **************************\n\n");
		SearchingOperation.CompareById(myList);
		System.out.println("\n****************************Sort by Date : **************************\n\n");
		SearchingOperation.CompareByDate(myList);
		System.out.println("\n****************************Sort by Address using zipcode: **************************\n\n");
		SearchingOperation.CompareByAddress(myList);
		System.out.println("\n****************************Search by firstname starts with S : **************************\n\n");
		SearchingOperation.searchByFirstName(myList);
		System.out.println("\n****************************Search by Id **************************\n\n");
		SearchingOperation.searchById(myList);
		System.out.println("\n****************************Search by lastname starts with M: **************************\n\n");
		SearchingOperation.searchByLastName(myList);
		System.out.println("\n****************************Search by ZipCode 20770: **************************\n\n");
		SearchingOperation.searchByZipcode(myList);
		

	}

}
