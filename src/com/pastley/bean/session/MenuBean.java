package com.pastley.bean.session;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.pastley.component.Item;
import com.pastley.component.MenuI;
import com.pastley.model.CategoryModel;
import com.pastley.model.ProductModel;

import lombok.Data;

@Data
@ManagedBean(name = "menu")
@SessionScoped
public class MenuBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private MenuI<CategoryModel, ProductModel> menuI;

	@PostConstruct
	public void init() {
		this.initMenuI();
	}

	public void initMenuI() {
		this.menuI = new MenuI<>();
		this.menuI.fill();
		this.consultMenuIByCategories();
	}

	public void consultMenuIByCategories() {
		if (this.menuI == null)
			return;
		int size = 10;
		for (int i = 0; i < 10; i++) {
			CategoryModel c = new CategoryModel((i + 1L), "Categorie " + (i + 1L));
			this.menuI.getLevel().add(new Item<CategoryModel>(c, null, "fas fa-angle-right"));
			List<Item<ProductModel>> listProduct = new ArrayList<>();
			for (int j = 0; j < size; j++) {
				ProductModel p = new ProductModel((j + 1L), "Product " + c.getId() + "." + (j + 1L), "product.jpg");
				listProduct.add(new Item<ProductModel>(p, null, null));
			}
			this.menuI.getLevelII().add(listProduct);
		}
	}
}
