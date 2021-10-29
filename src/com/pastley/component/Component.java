package com.pastley.component;

import java.io.Serializable;

public class Component implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private String styleClass;
	private String style;
	private String icon;

	public Component() {
		this(null, null, null, null);
	}

	public Component(String id) {
		this(id, null, null, null);
	}

	public Component(String id, String styleClass, String icon) {
		this(id, styleClass, null, icon);
	}

	public Component(String id, String styleClass, String style, String icon) {
		this.id = id;
		this.styleClass = styleClass;
		this.style = style;
		this.icon = icon;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStyleClass() {
		return styleClass;
	}

	public void setStyleClass(String styleClass) {
		this.styleClass = styleClass;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}
}
