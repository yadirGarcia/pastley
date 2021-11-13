package com.pastley.component;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ItemII<A> extends Item<A> {

	private static final long serialVersionUID = 1L;
	
	private Badge badge;
	
	private List<ItemII<A>> items;
	
	public ItemII(Badge badge, A entity, String path, String icon) {
		this(badge, null, null, null, entity, path, icon);
	}
	
	public ItemII(Badge badge, String id, String styleClass, String title, A entity, String path, String icon) {
		super(id, styleClass, title, entity, path, icon);
		this.badge = badge;
	}
}
