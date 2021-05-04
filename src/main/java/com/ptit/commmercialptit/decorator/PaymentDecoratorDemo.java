package com.ptit.commmercialptit.decorator;

public class PaymentDecoratorDemo {
	public static void main(String[] args) {
		Payment cashPay = new CashPay();
		Payment vietnameCashPay = new VietNamPaymentDecorator(new CashPay());
		Payment vietnamDebitPay = new VietNamPaymentDecorator(new DebitPay());
		cashPay.getTransactionType();
		vietnameCashPay.getTransactionType();
		vietnamDebitPay.getTransactionType();
	}
}
