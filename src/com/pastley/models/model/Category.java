package com.pastley.models.model;

import java.io.Serializable;

public class Category implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private Long idProduct;
	private String name;
	private String photo;
	
	public Category() {
		
	}
	
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
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
