package com.te.designpatter.creationaldp.builderdesignpattern;

public class PhoneBuilder {
	private String os;
	private String processer;
	private double screenSize;
	private int battery;
	private int camera;
	private int price;
	private int ramSize;
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setProcesser(String processer) {
		this.processer = processer;
		return this;
	}
	public PhoneBuilder setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	public PhoneBuilder setCamera(int camera) {
		this.camera = camera;
		return this;
	}
	public PhoneBuilder setPrice(int price) {
		this.price = price;
		return this;
	}
	public PhoneBuilder setRamSize(int ramSize) {
		this.ramSize = ramSize;
		return this;
	}
	public Phone getphone(){
		return new Phone(os, processer, screenSize, battery, camera, price, ramSize);
	}
}
