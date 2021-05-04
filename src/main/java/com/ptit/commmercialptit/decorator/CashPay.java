package com.ptit.commmercialptit.decorator;

public class CashPay implements Payment{

	@Override
	public void getTransactionType() {
		System.out.println("Pay by Cash");
	}

}
