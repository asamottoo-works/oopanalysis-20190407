package org.pickles.ec.domain;

import java.math.BigDecimal;

public class Line {

	private Item item;

	private Quantity quantity;

	public Line(Item item, Quantity quantity) {
		this.item = item;
		this.quantity = quantity;
	}

	public Amount amount() {
		BigDecimal quantity = this.quantity.toBigDecimal();

		BigDecimal unitPrice = this.item.getUnitPrice().toBigDecimal();

		return new Amount(unitPrice.multiply(quantity));
	}
}
