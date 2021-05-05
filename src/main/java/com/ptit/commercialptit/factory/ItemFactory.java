package com.ptit.commercialptit.factory;

public class ItemFactory {
	public Item getItem(String itemType) {
		if(itemType == null) {
			return null;
		}
		if(itemType.equalsIgnoreCase("Book")) {
			return (Item) new Book();
		}
		else if(itemType.equalsIgnoreCase("Story")) {
			return new Story();
		}
		return null;
		
	}
}
