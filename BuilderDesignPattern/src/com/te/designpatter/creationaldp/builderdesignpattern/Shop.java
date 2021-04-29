package com.te.designpatter.creationaldp.builderdesignpattern;

public class Shop {
public static void main(String[] args) {
	Phone phone= new Phone("Android", "Snapdragon", 16.25, 2500, 12, 250000, 8);
	System.out.println(phone);
}
}
