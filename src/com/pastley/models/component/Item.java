package com.pastley.models.component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Item<A> extends Component{

	private static final long serialVersionUID = 1L;

	private A entity;
	private String path;

	public Item(A entity) {
		this(null, null, null, entity, null, null);
	}

	public Item(A entity, String path, String icon) {
		this(null, null, null, entity, path, icon);
	}

	public Item(A entity, String path, String title, String icon) {
		this(null, null, title, entity, path, icon);
	}

	public Item(String id, String icon, boolean isClass) {
		this(id, (isClass ? id : null), null, null, null, icon);
	}

	public Item(String id, String styleClass, String title, A entity, String path, String icon) {
		super(id, styleClass, title, null, icon);
		this.entity = entity;
		this.path = path;
	}
}
