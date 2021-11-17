package com.pastley.models.component;

import java.util.List;

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

	public Badge getBadge() {
		return badge;
	}

	public void setBadge(Badge badge) {
		this.badge = badge;
	}

	public boolean isInfo() {
		return info;
	}

	public void setInfo(boolean info) {
		this.info = info;
	}

	public List<ItemII<A>> getItems() {
		return items;
	}

	public void setItems(List<ItemII<A>> items) {
		this.items = items;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
