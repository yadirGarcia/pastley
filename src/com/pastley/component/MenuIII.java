package com.pastley.component;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class MenuIII implements Serializable { 

	private static final long serialVersionUID = 1L;

	private Item<String> logo;
	private List<ItemII<String>> items;

	public void init(String pathLogo) {
		this.logo = new Item<>(null, pathLogo, "Logo", null);
		this.fillItems();
	}

	public void fillItems() {
		this.items = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			Badge badge = new Badge("Pro", "3", null, "pi pi-user");
			ItemII<String> item = new ItemII<>(badge, "Item " + i, "index.xhtml", "pi pi-user");
			item.setItems(new ArrayList<>());
			for (int j = 0; j <= 3; j++) {
				item.getItems().add(new ItemII<>(j % 2 == 0 ? badge : null, "Item " + i + "," + j, "index.xhtml", "pi pi-user"));
			}
			System.out.println("SIZE: "+item.getItems().size());
			this.items.add(item);
		}
	}
}
