package com.pastley.models.component;

import java.util.List;

public class Card extends Component {

	private static final long serialVersionUID = 1L;
	private String path;
	private String value;
	private String name;
	private boolean isPrice;
	private List<Link> links;

	public Card(String path, String value, String name, boolean isPrice, List<Link> links, String styleClass, String id,
			String icon) {
		super(id, styleClass, icon);
		this.path = path;
		this.value = value;
		this.name = name;
		this.isPrice = isPrice;
		this.links = links;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isPrice() {
		return isPrice;
	}

	public void setPrice(boolean isPrice) {
		this.isPrice = isPrice;
	}

	public List<Link> getLinks() {
		return links;
	}

	public void setLinks(List<Link> links) {
		this.links = links;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
