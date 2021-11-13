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
	private boolean info;
	
	private List<ItemII<A>> items;
	
	public ItemII(Badge badge, boolean info, A entity, String path, String icon) {
		this(badge, info, null, null, null, entity, path, icon, null);
	}
	
	public ItemII(Badge badge, boolean info, A entity, String path, String icon, List<ItemII<A>> items) {
		this(badge, info, null, null, null, entity, path, icon, items);
	}
	
	public ItemII(Badge badge, boolean info, String id, String styleClass, String title, A entity, String path, String icon) {
		this(badge, info, id, styleClass, title, entity, path, icon, null);
	}
	
	public ItemII(Badge badge, boolean info, String id, String styleClass, String title, A entity, String path, String icon, List<ItemII<A>> items) {
		super(id, styleClass, title, entity, path, icon);
		this.badge = badge;
		this.info = info;
		this.items = items;
	}
}
