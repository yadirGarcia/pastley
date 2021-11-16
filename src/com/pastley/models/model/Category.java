package com.pastley.models.model;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Category implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private Long idProduct;
	private String name;
	private String photo;
	
	public Category(Long id, String name) {
		this(id, 0L, name, null);
	}

	public Category(Long id, String name, String photo) {
		this(id, 0L, name, photo);
	}

	public Category(Long id, Long idProduct, String name, String photo) {
		this.id = id;
		this.idProduct = idProduct;
		this.name = name;
		this.photo = photo;
	}
}
