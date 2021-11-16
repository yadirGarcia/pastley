package com.pastley.models.model;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Product implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String photo;

	public Product(String name, String photo) {
		this(0L, name, photo);
	}

	public Product(Long id, String name, String photo) {
		this.id = id;
		this.name = name;
		this.photo = photo;
	}
}
