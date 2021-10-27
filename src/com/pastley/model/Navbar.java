package com.pastley.model;

import java.io.Serializable;

public class Navbar<A> implements Serializable{


	private static final long serialVersionUID = 1L;
	
	private A entity;
	private String path;
	private String icon;
	
	public Navbar() {
	}

	public A getEntity() {
		return entity;
	}

	public void setEntity(A entity) {
		this.entity = entity;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
