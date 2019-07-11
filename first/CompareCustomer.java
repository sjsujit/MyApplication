package com.MyApplication.first;

import java.util.Comparator;

public class CompareCustomer implements Comparator <Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		if (o1.getOrder().getDate().compareTo(o2.getOrder().getDate()) == 0) {
			return o1.getId().compareTo(o2.getId());
		} else {
			return o1.getFirstName().compareTo(o2.getFirstName());
		}
	}

	

}
