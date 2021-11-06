package com.pastley.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class CategoryModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private Long idProduct;
	private String name;
	private String photo;

	public CategoryModel() {
		this(0L, 0L, null, null);
	}
	
	public CategoryModel(Long id, String name) {
		this(id, 0L, name, null);
	}

	public CategoryModel(Long id, String name, String photo) {
		this(id, 0L, name, photo);
	}

	public CategoryModel(Long id, Long idProduct, String name, String photo) {
		this.id = id;
		this.idProduct = idProduct;
		this.name = name;
		this.photo = photo;
	}
}
