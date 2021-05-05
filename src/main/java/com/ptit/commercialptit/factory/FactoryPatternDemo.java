package com.ptit.commercialptit.factory;

public class FactoryPatternDemo {
	public static void main(String[] args) {
		ItemFactory itemFactory = new ItemFactory();
		Item book = itemFactory.getItem("Book");
		Item story = itemFactory.getItem("Story");
		book.getItem();
		story.getItem();
	}
}
