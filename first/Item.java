package com.MyApplication.first;

public class Item {
	private String itemId;
	private String iteamName;
	private float unitPrice;

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getIteamName() {
		return iteamName;
	}

	public void setIteamName(String iteamName) {
		this.iteamName = iteamName;
	}

	public float getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Item(String itemId, String iteamName, float unitPrice) {
		super();
		this.itemId = itemId;
		this.iteamName = iteamName;
		this.unitPrice = unitPrice;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", iteamName=" + iteamName + ", unitPrice=" + unitPrice + "]";
	}

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((itemId == null) ? 0 : itemId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (itemId == null) {
			if (other.itemId != null)
				return false;
		} else if (!itemId.equals(other.itemId))
			return false;
		return true;
	}

}
