package com.ptit.commmercialptit.facade;

public class CashPay implements Payment{

	@Override
	public void getTransactionType() {
		System.out.println("Cash Pay");
	}

}
