package com.pastley.component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Badge extends Component{
	
	private static final long serialVersionUID = 1L;
	
	private String name;

	public Badge(String name, String id, String styleClass, String icon) {
		super(id, styleClass, icon);
		this.name = name;
	}
}
