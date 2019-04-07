package org.pickles.ec.domain;

public class ShippingDistance {

	private ShippingFrom shippingFrom;
	private ShippingTo shippingTo;

	public ShippingDistance(ShippingFrom shippingFrom, ShippingTo shippingTo) {
		this.shippingFrom = shippingFrom;
		this.shippingTo = shippingTo;
	}

	public Integer toInteger() {
		return Math.abs(this.shippingFrom.value - this.shippingTo.value);
	}
}
