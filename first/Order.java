package com.MyApplication.first;

import java.time.LocalDate;

public class Order {
	private Integer id;
	private Customer customer;
	private LocalDate date;
	private double totalPrice;

	public Integer getId() {
		return id;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public void setId(Integer id) {
		this.id = id;
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


	public Order(Integer id, Customer customer, LocalDate date, double totalPrice) {
		super();
		this.id = id;
		this.customer = customer;
		this.date = date;
		this.totalPrice = totalPrice;
	}

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", customer=" + customer + ", date=" + date + ", totalPrice=" + totalPrice + "]";
	}

	
}



