package com.pastley.component;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.pastley.util.Pastley;

public class MenuI<A, B> implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Item<String>> options;
	private List<Item<String>> links;
	private List<Item<A>> level;
	private List<Item<B>> levelII;
	private List<Item<String>> levelIII;

	public MenuI() {
		this.init();
	}
	
	public void init() {
		this.options = new ArrayList<Item<String>>();
		this.links = new ArrayList<Item<String>>();
		this.level = new ArrayList<Item<A>>();
		this.levelII = new ArrayList<Item<B>>();
		this.levelIII = new ArrayList<Item<String>>();
	}

	public void fill() {
		this.fillOptions();
		this.fillLinks();
	}

	public void fillOptions() {
		Pastley.addItem(new Item<String>("btn-bars", "fas fa-bars", true), this.options);
		Pastley.addItem(new Item<String>("btn-close", "fas fa-times", true), this.options);
	}

	public void fillLinks() {
		Pastley.addItem(new Item<String>("Contacto", "contact?faces-redirect=true", null), this.links);
		Pastley.addItem(new Item<String>("Carrito", "cart?faces-redirect=true", null), this.links);
		Pastley.addItem(new Item<String>("Iniciar Sesión", "login?faces-redirect=true", "pi pi-user"), this.links);
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

	public List<Item<A>> getLevel() {
		return level;
	}

	public void setLevel(List<Item<A>> level) {
		this.level = level;
	}

	public List<Item<B>> getLevelII() {
		return levelII;
	}

	public void setLevelII(List<Item<B>> levelII) {
		this.levelII = levelII;
	}

	public List<Item<String>> getLevelIII() {
		return levelIII;
	}

	public void setLevelIII(List<Item<String>> levelIII) {
		this.levelIII = levelIII;
	}

	public void setLinks(List<Item<String>> links) {
		this.links = links;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
