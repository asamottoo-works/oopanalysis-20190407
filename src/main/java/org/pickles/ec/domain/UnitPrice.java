package org.pickles.ec.domain;

import java.math.BigDecimal;

public class UnitPrice extends Money {
	public UnitPrice(String value) {
		super(value);
	}

	BigDecimal toBigDecimal() {
		return this.value;
	}
}
