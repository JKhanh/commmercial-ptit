package com.ptit.commmercialptit.facade;

public class FacadeDemo {
	public static void main(String[] args) {
		PaymentMaker paymentMaker = new PaymentMaker();
		paymentMaker.getCashPay();
		paymentMaker.getDebitPay();
	}
}
