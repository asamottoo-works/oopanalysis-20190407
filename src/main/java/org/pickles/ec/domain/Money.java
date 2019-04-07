package org.pickles.ec.domain;

import java.math.BigDecimal;

public class Money extends ValueObject<BigDecimal> {

	public Money(String value) {
		super(new BigDecimal(value));
		if (this.value.compareTo(BigDecimal.ZERO) == -1) throw new IllegalArgumentException("money must be 0 or more.");
	}

	public Money(BigDecimal value) {
		super(value);
		if (this.value.compareTo(BigDecimal.ZERO) == -1) throw new IllegalArgumentException("money must be 0 or more.");
	}
}
