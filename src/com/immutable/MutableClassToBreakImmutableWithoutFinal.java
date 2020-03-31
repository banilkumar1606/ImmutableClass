package com.immutable;

public class MutableClassToBreakImmutableWithoutFinal extends ImmutableClassWithOutFinal{
	private int realValue;
	public MutableClassToBreakImmutableWithoutFinal(int value) {
		super(value);
		realValue=value;
	}
	public int getValue() {
		return realValue;
	}
	public void setRealValue(int realValue) {
		this.realValue = realValue;
	}
	public static void main(String[] args) {
		MutableClassToBreakImmutableWithoutFinal mutableObj=new MutableClassToBreakImmutableWithoutFinal(10);
		ImmutableClassWithOutFinal immutableObj=(ImmutableClassWithOutFinal) mutableObj;
		System.out.println(immutableObj.getValue());
		mutableObj.setRealValue(12);
		System.out.println(immutableObj.getValue());
	}
}	
