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
import com.pastley.models.model.CategoryModel;
import com.pastley.models.model.ProductModel;

import lombok.Data;
import lombok.NoArgsConstructor;

@ManagedBean(name = "menu")
@SessionScoped
@Data
@NoArgsConstructor
public class MenuBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private MenuI<CategoryModel, ProductModel> menuI;
	
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
