package com.MyApplication.first;

import java.util.List;

public class SearchingOperation {

	//public static List<Order> orderList;
	
	static void searchByFirstName(List<Order> orderList) {
	 orderList.stream().filter(p -> p.getCustomer().getFirstName().startsWith("S"))
	 			.forEach(p -> System.out.print(p));
	}
	
	
	static void searchByLastName(List<Order> orderList) {
		orderList.stream().filter(p -> p.getCustomer().getLastName().startsWith("M")).forEach(p -> System.out.print(p));
	}
	static void searchByOrderId(List<Order> orderList) {
		orderList.stream().filter(p-> p.getId()==1001).forEach(p-> System.out.print(p));
	}
	
}
