package com.pastley.models.component;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.pastley.util.Pastley;

public class MenuI<A, B> implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Item<String>> options;
	private List<Item<String>> links;
	private List<Item<A>> level;
	private List<List<Item<B>>> levelII;
	
	public void init() {
		this.options = new ArrayList<>();
		this.links = new ArrayList<>();
		this.level = new ArrayList<>();
		this.levelII = new ArrayList<>();
	}

	public void fill() {
		this.init();
		this.fillOptions();
		this.fillLinks();
	}

	public void fillOptions() {
		Pastley.addItem(new Item<String>("lsy-btn-bars", "fas fa-bars", true), this.options);
		Pastley.addItem(new Item<String>("lsy-btn-close", "fas fa-times", true), this.options);
	}

	public void fillLinks() {
		Pastley.addItem(new Item<String>("Contacto", "contact.xhtml", null), this.links);
		Pastley.addItem(new Item<String>("Carrito", "cart.xhtml", null), this.links);
		Pastley.addItem(new Item<String>("Iniciar Sesión", "login.xhtml", "pi pi-user"), this.links);
	}

	public List<Item<String>> getOptions() {
		return options;
	}

	public void setOptions(List<Item<String>> options) {
		this.options = options;
	}

	public List<Item<String>> getLinks() {
		return links;
	}

	public void setLinks(List<Item<String>> links) {
		this.links = links;
	}

	public List<Item<A>> getLevel() {
		return level;
	}

	public void setLevel(List<Item<A>> level) {
		this.level = level;
	}

	public List<List<Item<B>>> getLevelII() {
		return levelII;
	}

	public void setLevelII(List<List<Item<B>>> levelII) {
		this.levelII = levelII;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
