package com.MyApplication.first;

public class Address {

	private String street;
	private String state;
	private Integer zipcode;
	private String county;

	public Address(String street, String state, Integer zipcode, String county) {
		super();
		this.street = street;
		this.state = state;
		this.zipcode = zipcode;
		this.county = county;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getZipcode() {
		return zipcode;
	}

	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	@Override
	public String toString() {
		return "\nAddress [street=" + street + " state=" + state + " zipcode=" + zipcode + " county=" + county + "]";
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

}
