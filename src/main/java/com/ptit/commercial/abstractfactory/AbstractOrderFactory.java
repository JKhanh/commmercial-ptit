package com.ptit.commercial.abstractfactory;

public abstract class AbstractOrderFactory {
	abstract Shippment getShippment(String shipment);
	abstract Payment getPayment(String payment);
	
}
