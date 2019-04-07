package org.pickles.ec.domain;

public class ItemName extends ValueObject<String> {

	public ItemName(String value) {
		super(value);
		if (this.value == null || this.value.isEmpty())
			throw new IllegalArgumentException("ItemName's length must be over 0.");
	}
}
