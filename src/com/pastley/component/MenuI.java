package com.pastley.component;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.pastley.util.Pastley;

import lombok.Data;

@Data
public class MenuI<A, B> implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Item<String>> options;
	private List<Item<String>> links;
	private List<Item<A>> level;
	private List<List<Item<B>>> levelII;

	public MenuI() {
		this.init();
	}
	
	public void init() {
		this.options = new ArrayList<Item<String>>();
		this.links = new ArrayList<Item<String>>();
		this.level = new ArrayList<Item<A>>();
		this.levelII = new ArrayList<List<Item<B>>>();
	}

	public void fill() {
		this.fillOptions();
		this.fillLinks();
	}

	public void fillOptions() {
		Pastley.addItem(new Item<String>("lsy-btn-bars", "fas fa-bars", true), this.options);
		Pastley.addItem(new Item<String>("lsy-btn-close", "fas fa-times", true), this.options);
	}

	public void fillLinks() {
		Pastley.addItem(new Item<String>("Contacto", "contact?faces-redirect=true", null), this.links);
		Pastley.addItem(new Item<String>("Carrito", "cart?faces-redirect=true", null), this.links);
		Pastley.addItem(new Item<String>("Iniciar Sesión", "login?faces-redirect=true", "pi pi-user"), this.links);
	}
}
