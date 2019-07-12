package com.MyApplication.first;

import java.time.LocalDate;

public class Payment {
	private Integer number;
	private short CVV;
	private String nameCardHolder;
	private LocalDate validTill;

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public short getCVV() {
		return CVV;
	}

	public void setCVV(short cVV) {
		CVV = cVV;
	}

	public LocalDate getValidTill() {
		return validTill;
	}

	public void setValidTill(LocalDate validTill) {
		this.validTill = validTill;
	}

	public String getNameCardHolder() {
		return nameCardHolder;
	}

	public void setNameCardHolder(String nameCardHolder) {
		this.nameCardHolder = nameCardHolder;
	}

	public Payment(Integer number, short cVV, String nameCardHolder, LocalDate validTill) {
		super();
		this.number = number;
		CVV = cVV;
		this.nameCardHolder = nameCardHolder;
		this.validTill = validTill;
	}

	@Override
	public String toString() {
		return "Payment [number=" + number + ", CVV=" + CVV + ", nameCardHolder=" + nameCardHolder + ", validTill="
				+ validTill + "]";
	}

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

}
