package com.pastley.component;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.pastley.model.Category;
import com.pastley.util.Pastley;

public class Footer implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Item<Category>> categories;
	private List<Item<String>> services;
	private List<Item<String>> social;

	public Footer() {
		this.init();
	}
	
	public void init() {
		this.categories = new ArrayList<Item<Category>>();
		this.services = new ArrayList<Item<String>>();
		this.social = new ArrayList<Item<String>>();
	}

	public void fill() {
		this.fillServicies();
		this.fillSocial();
	}

	public void fillServicies() {
		Pastley.addItem(new Item<String>("Iniciar Sesión", "login?faces-redirect=true", "Iniciar Sesión", "pi pi-user"),
				this.services);
		Pastley.addItem(new Item<String>("Contacto", "contact?faces-redirect=true", "Contacto", "pi pi-user"),
				this.services);
		Pastley.addItem(new Item<String>("Carrito", "cart?faces-redirect=true", "Carrito", "pi pi-user"),
				this.services);
	}

	public void fillSocial() {
		Pastley.addItem(new Item<String>(null, "login?faces-redirect=true", "Facebook", "pi pi-facebook"), this.social);
		Pastley.addItem(new Item<String>(null, "login?faces-redirect=true", "Twitter", "pi pi-twitter"), this.social);
		Pastley.addItem(new Item<String>(null, "login?faces-redirect=true", "Mensaje", "pi pi-send"), this.social);
	}

	public List<Item<Category>> getCategories() {
		return categories;
	}

	public void setCategories(List<Item<Category>> categories) {
		this.categories = categories;
	}

	public List<Item<String>> getServices() {
		return services;
	}

	public List<Item<String>> getSocial() {
		return social;
	}

	public void setSocial(List<Item<String>> social) {
		this.social = social;
	}

	public void setServices(List<Item<String>> services) {
		this.services = services;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
