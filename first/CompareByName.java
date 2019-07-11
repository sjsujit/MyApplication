package com.MyApplication.first;

import java.util.Comparator;

public class CompareByName implements Comparator <Order>{

	@Override
	public int compare(Order o1, Order o2) {
		if (o1.getCustomer().getFirstName().compareTo(o2.getCustomer().getFirstName()) == 0) {
			return o1.getId().compareTo(o2.getId());
		} else {
			return o1.getCustomer().getFirstName().compareTo(o2.getCustomer().getFirstName());
		}
		
	}

	
	
	}
	
