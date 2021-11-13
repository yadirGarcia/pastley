package com.pastley.component;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class MenuII implements Serializable {

	private static final long serialVersionUID = 1L;

	private Item<String> logo;
	private List<Item<String>> items;

	public void init(String pathLogo) {
		this.logo = new Item<>(null, pathLogo, "Logo", null);
		this.fillItems();
	}

	public void fillItems() {
		this.items = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			Item<String> item = new Item<>("Item " + i, "index.xhtml", "Logo", "pi pi-user");
			this.items.add(item);
		}
	}
}
