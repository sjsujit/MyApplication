package com.MyApplication.first;

public class Payment {
	private Integer number;
	private Integer CVV;
	private String name_card_holder;

	public Payment(Integer number, Integer cVV, String name_card_holder) {
		super();
		this.number = number;
		CVV = cVV;
		this.name_card_holder = name_card_holder;
	}

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

	public String getName_card_holder() {
		return name_card_holder;
	}

	public void setName_card_holder(String name_card_holder) {
		this.name_card_holder = name_card_holder;
	}

	@Override
	public String toString() {
		return "[number " + number + " CVV " + CVV + " name_card_holder " + name_card_holder + "]   ";
		//return String.format("\n%d %d %s", number,CVV,name_card_holder);
	}

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

}
