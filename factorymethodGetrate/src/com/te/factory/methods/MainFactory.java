package com.te.factory.methods;

import java.util.Scanner;

public class MainFactory {
public static void main(String[] args) {
	GetPlan plan=new GetPlan();
	Scanner s=new Scanner(System.in);
	System.out.println("enter the plan \nCommercial\nDomestic \nInstitutional");
	String plan1=s.next();
	System.out.println("enter the  units in double value ");
	Double units=s.nextDouble();
	Plan p=plan.getPlan(plan1);
	p.setRate();
	p.generateBill(units);
	
}
}
