package com.pastley.models.dto;

import com.pastley.models.model.Category;
import com.pastley.models.model.Product;

public class InitDTO {

	public static Category category() {
		return new Category();
	}
	
	public static Product product(boolean category) {
		Product product = new Product();
		if(category)
			product.setCategory(category());
		return product;
	}
}
