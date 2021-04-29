package com.te.factory.interfac;

public class OperatingSystemFactory {
	public Os getInsatance(String str){
		if(str.equals("open"))
			return new Android1();
		else if(str.equals("Closed"))
			return new Ios2();
		else
			return new Windows3();
	}
}
