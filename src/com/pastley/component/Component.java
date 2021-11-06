package com.pastley.component;

import java.io.Serializable;

import lombok.Data;

@Data
public class Component implements Serializable {

	private static final long serialVersionUID = 1L;

	protected String id;
	protected String title;
	protected String styleClass;
	protected String style;
	protected String icon;

	public Component() {
		this(null, null, null, null, null);
	}

	public Component(String id) {
		this(id, null, null, null, null);
	}

	public Component(String id, String styleClass, String icon) {
		this(id, styleClass, null, null, icon);
	}
	
	public Component(String id, String styleClass, String title, String icon) {
		this(id, styleClass, title, null, icon);
	}

	public Component(String id, String styleClass, String title, String style, String icon) {
		this.id = id;
		this.styleClass = styleClass;
		this.title = title;
		this.style = style;
		this.icon = icon;
	}
}
