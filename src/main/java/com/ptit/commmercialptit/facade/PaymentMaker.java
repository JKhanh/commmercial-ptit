package com.ptit.commmercialptit.facade;

public class PaymentMaker {
	private Payment cashPay;
	private Payment debitPay;
	public PaymentMaker() {
		cashPay = new CashPay();
		debitPay = new DebitPay();
	}
	void getCashPay() {
		cashPay.getTransactionType();
	}
	void getDebitPay() {
		debitPay.getTransactionType();
	}
}
