package com.te.factory.methods;

public class GetPlan {
	public Plan getPlan(String s){
		if(s==null){
			return null;
		}
		if(s.equalsIgnoreCase("Commercial"))
			return new Commercial();
		else if (s.equalsIgnoreCase("Domestic"))
			return new Domestic();
		else if(s.equalsIgnoreCase("Institutional"))
			return new Institutional();
		else 
			return null;


	}
}
