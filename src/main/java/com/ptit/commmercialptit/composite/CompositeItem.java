package com.ptit.commmercialptit.composite;

public class CompositeItem {
	public static void main(String[] args) {
		Item item = new Item("item", 10000,Item.Type.ITEM);
		Item book = new Item("book", 10000,Item.Type.BOOK);
		Item electric = new Item("electric", 10000,Item.Type.ELECTRONIC);
		Item novel = new Item("novel", 10000,Item.Type.NOVEL);
		Item comic = new Item("comic", 10000,Item.Type.COMIC);
		Item tv = new Item("tv", 10000,Item.Type.TV);
		Item computer = new Item("computer", 10000,Item.Type.COMPUTER);
		item.addListItem(book);
		item.addListItem(electric);
		book.addListItem(novel);
		book.addListItem(comic);
		electric.addListItem(tv);
		electric.addListItem(computer);
		System.out.println(item);
		for(Item i : item.getListItem()) {
			System.out.println(i);
			for(Item i1 : i.getListItem()) {
				System.out.println(i1);
			}
		}
			
	}
}
