package com.pastley.bean.session;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.pastley.component.Item;
import com.pastley.component.MenuI;
import com.pastley.model.Category;
import com.pastley.model.Product;

@ManagedBean(name = "menu")
@SessionScoped
public class MenuBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private MenuI<Category, Product> menuI;

	public MenuBean() {
	}

	@PostConstruct
	public void init() {
		this.initMenuI();
	}

	public void initMenuI() {
		this.menuI = new MenuI<Category, Product>();
		this.menuI.fill();
		this.consultMenuIByCategories();
	}

	public void consultMenuIByCategories() {
		if (this.menuI == null)
			return;
		for (int i = 0; i < 10; i++) {
			Category c = new Category();
			c.setId(i + 1L);
			c.setName("Categorie " + c.getId());
			this.menuI.getLevel().add(new Item<Category>(c, null, "fas fa-angle-right"));
		}
	}

	public MenuI<Category, Product> getMenuI() {
		return menuI;
	}

	public void setMenuI(MenuI<Category, Product> menuI) {
		this.menuI = menuI;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
