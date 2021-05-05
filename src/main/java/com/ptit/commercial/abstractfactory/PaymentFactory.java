package com.ptit.commercial.abstractfactory;

public class PaymentFactory  extends AbstractOrderFactory{

	@Override
	Shippment getShippment(String shipment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Payment getPayment(String paymentType) {
		if(paymentType == null ) {
			return null;
		}
		else if(paymentType.equalsIgnoreCase("GiaoHangTK")) {
			return (Payment) new GiaohangTK();
		}
		else if(paymentType.equalsIgnoreCase("JandT")){
			return (Payment) new JandT();
		}
		return null;
	}
	

}
