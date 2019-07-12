package com.MyApplication.first;

import java.util.Collections;
import java.util.List;

public class SearchingOperation {

	// public static List<Order> orderList;
	public static void CompareByName(List<Order> orderList) {
		Collections.sort(orderList,
				(Order o1, Order o2) -> o1.getCustomer().getFirstName().compareTo(o2.getCustomer().getFirstName()));
		System.out.println(orderList);
	}

	public static void CompareByDate(List<Order> orderList) {
		Collections.sort(orderList, (Order o1, Order o2) -> o1.getDate().compareTo(o2.getDate()));
		System.out.println(orderList);

	}

	public static void CompareById(List<Order> orderList) {
		Collections.sort(orderList, (Order o1, Order o2) -> o1.getCustomer().getId() - o2.getCustomer().getId());
		System.out.println(orderList);
	}

	public static void CompareByAddress(List<Order> orderList) {
		Collections.sort(orderList, (Order o1, Order o2) -> o1.getCustomer().getAddress().getZipcode()
				- o2.getCustomer().getAddress().getZipcode());
		System.out.println(orderList);
	}

	static void searchByFirstName(List<Order> orderList) {
		orderList.stream().filter(p -> p.getCustomer().getFirstName().startsWith("S"))
				.forEach(p -> System.out.print(p));
	}

	static void searchByLastName(List<Order> orderList) {
		orderList.stream().filter(p -> p.getCustomer().getLastName().startsWith("M")).forEach(p -> System.out.print(p));
	}

	static void searchById(List<Order> orderList) {
		orderList.stream().filter(p -> p.getCustomer().getId() == 1).forEach(p -> System.out.print(p));
	}

	static void searchByZipcode(List<Order> orderList) {
		orderList.stream().filter(p -> p.getCustomer().getAddress().getZipcode() == 20770)
				.forEach(p -> System.out.print(p));
	}
	/*
	 * public void searchByName (List<Order> orders, String givenSearchString) {
	 * List<Order> found = orders.stream().filter(order ->
	 * order.getCustomer().getFirstName().contains(givenSearchString)
	 * ||order.getCustomer().getLastName().contains(givenSearchString)).collect(
	 * Collectors.toList());
	 * 
	 * }
	 */
	

}
