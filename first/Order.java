package com.MyApplication.first;

import java.time.LocalDate;
import java.util.UUID;

public class Order {
	private UUID id;
	private Customer customer;
	private LocalDate date;
	private double totalPrice;

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
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


	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public Order(Customer customer, LocalDate date, double totalPrice) {
		super();
		this.id = UUID.randomUUID();
		this.customer = customer;
		this.date = date;
		this.totalPrice = totalPrice;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + "\ncustomer=" + customer + ", date=" + date + ", totalPrice=" + totalPrice + "]\n\n";
	}

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}



