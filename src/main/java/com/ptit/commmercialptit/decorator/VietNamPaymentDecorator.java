package com.ptit.commmercialptit.decorator;

public class VietNamPaymentDecorator extends PaymentDecorator{

	public VietNamPaymentDecorator(Payment payment) {
		super(payment);
	}

	@Override
	public void getTransactionType() {
		payment.getTransactionType();
		setMoneyType(payment);
	}

	private void setMoneyType(Payment payment) {
		System.out.println("Viet Nam Dong (VND)");
	}

}
