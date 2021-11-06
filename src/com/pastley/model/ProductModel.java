package com.pastley.model;

import java.io.Serializable;

public class ProductModel implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String photo;

	public ProductModel() {
	}
	
	public ProductModel(String name, String photo) {
		this(0L, name, photo);
	}

	public ProductModel(Long id, String name, String photo) {
		this.id = id;
		this.name = name;
		this.photo = photo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
