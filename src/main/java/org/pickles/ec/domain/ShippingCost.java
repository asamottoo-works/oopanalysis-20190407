package org.pickles.ec.domain;

public class ShippingCost {

	private ShippingDistance shippingDistance;

	public ShippingCost(ShippingDistance shippingDistance) {
		this.shippingDistance = shippingDistance;
	}

	public Money cost() {
		if (this.shippingDistance.toInteger() < 100) {
			return new Money("0");
		} else {
			return new Money("500");
		}
	}
}
