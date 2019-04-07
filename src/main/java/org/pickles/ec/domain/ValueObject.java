package org.pickles.ec.domain;

public abstract class ValueObject<T> {
	T value;

	public ValueObject(T value) {
		this.value = value;
	}
}
