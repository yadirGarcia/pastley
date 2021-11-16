package com.pastley.models.component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Badge extends Component{
	
	private static final long serialVersionUID = 1L;
	
	private String name;

	public Badge(String name, String styleClass) {
		this(name, null, styleClass, null);
	}
	
	public Badge(String name, String styleClass, String icon) {
		this(name, null, styleClass, icon);
	}
	
	public Badge(String name, String id, String styleClass, String icon) {
		super(id, styleClass, icon);
		this.name = name;
	}
}
