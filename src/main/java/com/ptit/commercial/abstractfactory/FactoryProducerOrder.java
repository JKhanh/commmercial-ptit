package com.ptit.commercial.abstractfactory;

public class FactoryProducerOrder {
	public static AbstractOrderFactory getFactory(String choice) {
		if(choice.equalsIgnoreCase("Payment")) {
			return new PaymentFactory();
		}
		else if (choice.equalsIgnoreCase("Shippment")) {
			return new ShippmentFactory();
		}
		return null;
	}

}
