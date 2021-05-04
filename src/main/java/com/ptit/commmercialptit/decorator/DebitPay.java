package com.ptit.commmercialptit.decorator;

public class DebitPay implements Payment{

	@Override
	public void getTransactionType() {
		System.out.println("Pay by Debit Card");
	}

}
