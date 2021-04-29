package com.te.designpatter.creationaldp.builderdesignpattern;

public class BuilderExampleMainClass {
	public static void main(String[] args) {
		
		//specifing only os and price and getting only those values
		Phone p=new PhoneBuilder().setOs("Windows").setPrice(2500).getphone();
		System.out.println(p);
		
		//specifing the only batterry,setprocessor,ramsize and getting the values
		Phone p1=new PhoneBuilder().setBattery(5200).setProcesser("snap").setRamSize(58).getphone();

		System.out.println(p1);
	}
}
