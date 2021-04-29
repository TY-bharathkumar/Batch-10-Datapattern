package com.te.factory.methods;

public abstract class Plan {
	protected int rate;
public abstract void setRate();
public void generateBill(double units){
	
	System.out.println(units*rate);
}
}
