package com.ptit.commmercialptit.facade;

public class DebitPay implements Payment{

	@Override
	public void getTransactionType() {
		System.out.println("Debit Card Pay");
	}

}
