package com.pastley.component;

import java.io.Serializable;

public class Item<A> implements Serializable{


	private static final long serialVersionUID = 1L;
	
	private A entity;
	private String path;
	private String icon;
	
	public Item() {
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
