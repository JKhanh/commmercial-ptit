package com.ptit.commercial.abstractfactory;

public class Cash implements Payment{
	@Override
	public void getPayment() {
		System.out.println("Get Cash payment");
		
	}
}
