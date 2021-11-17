package com.pastley.bean.session;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.pastley.models.component.Item;
import com.pastley.models.component.MenuI;
import com.pastley.models.component.MenuII;
import com.pastley.models.component.MenuIII;
import com.pastley.models.model.Category;
import com.pastley.models.model.Product;

@ManagedBean(name = "menu")
@SessionScoped
public class MenuBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private MenuI<Category, Product> menuI;
	
	private MenuII menuII;
	private MenuIII menuIII;

	@PostConstruct
	public void init() {
		this.initMenuI();
		
		// REMOVE
		this.initMenuUser();
	}
	
	public void initMenuUser() {
		this.initMenuII();
		this.initMenuIII();
	}

	public void initMenuI() {
		this.menuI = new MenuI<>();
		this.menuI.fill();
		this.fillMenuIByCategories();
	}
	
	public void initMenuII() {
		this.menuII = new MenuII();
		this.menuII.init("https://raw.githubusercontent.com/DeveUp/pastley-backend/24a5d508aa5b57556ddec01716f72a622740a817/pastley-logos/01.svg");
	}
	
	public void initMenuIII() {
		this.menuIII = new MenuIII();
		this.menuIII.init("https://raw.githubusercontent.com/DeveUp/pastley-backend/24a5d508aa5b57556ddec01716f72a622740a817/pastley-logos/01.svg");
	}

	public void fillMenuIByCategories() {
		if (this.menuI == null)
			return;
		int size = 10;
		for (int i = 0; i < 10; i++) {
			Category c = new Category((i + 1L), "Categorie " + (i + 1L));
			this.menuI.getLevel().add(new Item<Category>(c, null, "fas fa-angle-right"));
			List<Item<Product>> listProduct = new ArrayList<>();
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

	public MenuII getMenuII() {
		return menuII;
	}

	public void setMenuII(MenuII menuII) {
		this.menuII = menuII;
	}

	public MenuIII getMenuIII() {
		return menuIII;
	}

	public void setMenuIII(MenuIII menuIII) {
		this.menuIII = menuIII;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
