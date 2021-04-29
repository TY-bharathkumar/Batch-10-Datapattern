package com.te.designpatter.creationaldp.builderdesignpattern;

public class Phone {
	private String os;
	private String processer;
	private double screenSize;
	private int battery;
	private int camera;
	private int price;
	private int ramSize;
	public Phone(String os, String processer, double screenSize, int battery, int camera, int price, int ramSize) {
		super();
		this.os = os;
		this.processer = processer;
		this.screenSize = screenSize;
		this.battery = battery;
		this.camera = camera;
		this.price = price;
		this.ramSize = ramSize;
	}
	@Override
	public String toString() {
		return "Phone [os=" + os + ", processer=" + processer + ", screenSize=" + screenSize + ", battery=" + battery
				+ ", camera=" + camera + ", price=" + price + ", ramSize=" + ramSize + "]";
	}

}
