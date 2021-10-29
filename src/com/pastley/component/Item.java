package com.pastley.component;

import java.io.Serializable;

public class Item<A> extends Component implements Serializable{


	private static final long serialVersionUID = 1L;
	
	private A entity;
	private String path;
	
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
