package com.te.factory.interfac;

public class FactoryMain {
	public static void main(String[] args) {
		OperatingSystemFactory osf =new OperatingSystemFactory();
		
		Os  obj =osf.getInsatance("");
		
		obj.spec();
	}
}
