package com.MyApplication.first;

import java.util.Comparator;

public class CompareByAddress implements Comparator<Order> {

	@Override
	public int compare(Order o1, Order o2) {
		
		return o1.getCustomer().getAddress().getZipcode()-o2.getCustomer().getAddress().getZipcode();
	}



	

}
