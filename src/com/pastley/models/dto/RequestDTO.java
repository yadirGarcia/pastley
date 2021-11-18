package com.pastley.models.dto;

import java.io.Serializable;

import org.json.simple.JSONObject;

import com.pastley.models.model.Category;
import com.pastley.models.model.Product;
import com.pastley.util.PastleyValidate;

public class RequestDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@SuppressWarnings({ "unchecked" })
	public JSONObject add(Product product) {
		JSONObject object = new JSONObject();
		object.put("id", product.getId());
		object.put("name", product.getName());
		object.put("flavor", product.getFlavor());
		object.put("vat", product.getVat());
		object.put("stock", product.getStock());
		object.put("stockMin", product.getStockMin());
		object.put("dimension", product.getDimension());
		object.put("image", product.getImage());
		object.put("price", product.getPrice());
		object.put("description", product.getDescription());
		object.put("ingredients", product.getIngredients());
		object.put("discount", product.getDiscount());
		object.put("dateRegister", product.getDateRegister());
		object.put("dateUpdate", product.getDateUpdate());
		object.put("category", add(product.getCategory() != null ? product.getCategory() : new Category()));
		return object;
	}

	@SuppressWarnings("unchecked")
	public JSONObject add(Category category) {
		JSONObject object = new JSONObject();
		object.put("id", PastleyValidate.isLong(category.getId()) ? category.getId() : 0L);
		object.put("name", category.getName());
		return object;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
