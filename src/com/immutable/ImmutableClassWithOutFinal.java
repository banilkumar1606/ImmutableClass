package com.immutable;

public class ImmutableClassWithOutFinal {
	private final int value;

	public ImmutableClassWithOutFinal(int value) {
		super();
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	
	
}
