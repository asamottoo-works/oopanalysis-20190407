package org.pickles.ec.domain;

public class Item {

	private UnitPrice unitPrice;

	private ItemName itemName;

	public Item(UnitPrice unitPrice, ItemName itemName) {
		this.unitPrice = unitPrice;
		this.itemName = itemName;
	}

	public UnitPrice getUnitPrice() {
		return unitPrice;
	}
}
