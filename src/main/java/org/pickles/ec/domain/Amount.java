package org.pickles.ec.domain;

import java.math.BigDecimal;

public class Amount extends Money {

	public Amount(String value) {
		super(value);
	}

	public Amount(BigDecimal value) {
		super(value);
	}
}
