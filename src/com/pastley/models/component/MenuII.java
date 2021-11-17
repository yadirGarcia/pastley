package com.pastley.models.component;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.pastley.util.PastleyVariable;

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
		this.items.add(new Item<>(null, "index.xhtml", "Cerrar Sesión", PastleyVariable.PASTLEY_ICON_OUT));
	}

	public Item<String> getLogo() {
		return logo;
	}

	public void setLogo(Item<String> logo) {
		this.logo = logo;
	}

	public List<Item<String>> getItems() {
		return items;
	}

	public void setItems(List<Item<String>> items) {
		this.items = items;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
