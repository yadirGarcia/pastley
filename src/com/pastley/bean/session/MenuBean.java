package com.pastley.bean.session;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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
		int size = 10;
		for (int i = 0; i < 10; i++) {
			Category c = new Category((i + 1L), "Categorie " + (i + 1L));
			this.menuI.getLevel().add(new Item<Category>(c, null, "fas fa-angle-right"));
			List<Item<Product>> listProduct = new ArrayList<Item<Product>>();
			for (int j = 0; j < size; j++) {
				Product p = new Product((j + 1L), "Product " + c.getId() + "." + (j + 1L), "product.jpg");
				listProduct.add(new Item<Product>(p, null, null));
			}
			this.menuI.getLevelII().add(listProduct);
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
