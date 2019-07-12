package com.MyApplication.first;

public class Payment {
	private Integer number;
	private Integer CVV;
	private String nameCardHolder;


	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getCVV() {
		return CVV;
	}

	public void setCVV(Integer cVV) {
		CVV = cVV;
	}


	public String getNameCardHolder() {
		return nameCardHolder;
	}

	public void setNameCardHolder(String nameCardHolder) {
		this.nameCardHolder = nameCardHolder;
	}

	public Payment(Integer number, Integer cVV, String nameCardHolder) {
		super();
		this.number = number;
		CVV = cVV;
		this.nameCardHolder = nameCardHolder;
	}

	@Override
	public String toString() {
		return "Payment [number=" + number + ", CVV=" + CVV + ", nameCardHolder=" + nameCardHolder + "]";
	}

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

}
