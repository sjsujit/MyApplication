package com.MyApplication.first;

import java.time.LocalDate;

public class Order {
	private Integer id;
	private LocalDate date;
	private double total_price;
	private Payment payment;
	private Address address;

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

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Order(Integer id, LocalDate date, double total_price, Payment payment, Address address) {
		super();
		this.id = id;
		this.date = date;
		this.total_price = total_price;
		this.payment = payment;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", date=" + date + ", total_price=" + total_price + ", payment=" + payment
				+ ", address=" + address + "]";
	}
}



