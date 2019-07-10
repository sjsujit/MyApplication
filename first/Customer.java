package com.MyApplication.first;

public class Customer implements Comparable<Customer>{

	private Integer id;
	private String firstName;
	private String lastName;
	private Order order;

	
	public Customer(Integer id, String firstName, String lastName, Order order) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.order = order;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public int compareTo(Customer o) {
		return this.id - o.getId();
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", order=" + order + "]";
	}

}

