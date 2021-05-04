package com.ptit.commmercialptit.decorator;

public abstract class PaymentDecorator implements Payment{
	protected Payment payment;

	public PaymentDecorator(Payment payment) {
		super();
		this.payment = payment;
	}
	public void transitionType() {
		payment.getTransactionType();
	}
}
