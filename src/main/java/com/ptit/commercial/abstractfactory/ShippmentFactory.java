package com.ptit.commercial.abstractfactory;

public class ShippmentFactory extends AbstractOrderFactory{

	@Override
	Shippment getShippment(String shipment) {
		// TODO Auto-generated method stub
		if(shipment == null) {
			return null;
		}
		else if(shipment.equalsIgnoreCase("ATM")) {
			return (Shippment) new ATM();
			
		}
		else if (shipment.equalsIgnoreCase("Cash")) {
			return (Shippment) new Cash();
		}
		return null;
	}

	@Override
	Payment getPayment(String payment) {
		// TODO Auto-generated method stub
		return null;
	}

}
