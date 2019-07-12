package com.MyApplication.first;

import java.time.LocalDate;

public class Order {
	private Integer id;
	private Customer customer;
	private LocalDate date;
	private double total_price;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public double getTotal_price() {
		return total_price;
	}

	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}


	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Order:[\n id: " + id + "\n  customer:  " + customer + "\n  date:  " + date + "\n  total_price:  " + total_price + "]  ";
		
	}

	public Order(Integer id, Customer customer, LocalDate date, double total_price) {
		super();
		this.id = id;
		this.customer = customer;
		this.date = date;
		this.total_price = total_price;
	}

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}



