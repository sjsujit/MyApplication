package com.MyApplication.first;

import java.time.LocalDate;
import java.util.Map;
import java.util.UUID;

public class Order {
	private UUID id;
	private Customer customer;
	private LocalDate date;
	private Map<Item, Integer> iteamQuantity;
	private double totalPrice;

	public double getTotalPrice() {
		this.iteamQuantity.entrySet().stream().mapToDouble(entry -> entry.getKey().getUnitPrice() * entry.getValue()).sum();
		return totalPrice;
	}

	public LocalDate getDate() {
		return date;
	}

	public Map<Item, Integer> getIteamQuantity() {
		return iteamQuantity;
	}

	public void setIteamQuantity(Map<Item, Integer> iteamQuantity) {
		this.iteamQuantity = iteamQuantity;
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

	

	public Order(Customer customer, LocalDate date, Map<Item, Integer> iteamQuantity) {
		super();
		this.id = UUID.randomUUID();
		this.customer = customer;
		this.date = date;
		this.iteamQuantity = iteamQuantity;
		
	}
	

	@Override
	public String toString() {
		return "Order [id=" + id + ", customer=" + customer + ", date=" + date + ", iteamQuantity=" + iteamQuantity+ "]";
	}

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}



