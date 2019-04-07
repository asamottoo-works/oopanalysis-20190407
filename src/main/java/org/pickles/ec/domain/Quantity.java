package org.pickles.ec.domain;

import java.math.BigDecimal;

public class Quantity extends ValueObject<Integer> {
	public Quantity(Integer value) {
		super(value);
		if (this.value < 0) throw new IllegalArgumentException("quantity must be 0 or more.");
	}

	public BigDecimal toBigDecimal() {
		return new BigDecimal(this.value.toString());
	}
}
