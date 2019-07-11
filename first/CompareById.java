package com.MyApplication.first;

import java.util.Comparator;

public class CompareById implements Comparator <Order>{

	@Override
	public int compare(Order o1, Order o2) {
		
		return o1.getId()-o2.getId();
	}


	

}
