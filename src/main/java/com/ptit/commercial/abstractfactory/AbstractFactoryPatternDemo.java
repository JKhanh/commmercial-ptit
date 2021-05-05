package com.ptit.commercial.abstractfactory;

public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {
		AbstractOrderFactory paymentFactory = FactoryProducerOrder.getFactory("Payment");
		AbstractOrderFactory shippmentFactory = FactoryProducerOrder.getFactory("shippment");
		
		
		
		Payment ATM = paymentFactory.getPayment("ATM");
		Payment cash = paymentFactory.getPayment("Cash");
		
		Shippment GHTK = shippmentFactory.getShippment("GiaoHangTK");
		Shippment JandT = shippmentFactory.getShippment("JandT");
		
		ATM.getPayment();
		cash.getPayment();
		GHTK.getShippment();
		JandT.getShippment();
	
		
		
		}
		
}
