package com.ptit.commmercialptit.composite;

import java.util.ArrayList;
import java.util.List;

public class Item {
	private String name;
	private double price;
	private Type type;
	private List<Item> listItem;
	
	public Item(String name, double price, Type type) {
		this.name = name;
		this.price = price;
		this.type = type;
		this.listItem = new ArrayList<>();
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public Type getType() {
		return type;
	}


	public void setType(Type type) {
		this.type = type;
	}


	public List<Item> getListItem() {
		return listItem;
	}


	public void addListItem(Item item) {
		this.listItem.add(item);
	}
	

	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + ", type=" + type + "]";
	}


	enum Type{
		ITEM,
		BOOK,
		NOVEL,
		COMIC,
		ELECTRONIC,
		TV,
		COMPUTER
	}
}
