package com.pastley.util;

import java.io.Serializable;
import java.util.List;

import com.pastley.component.Item;

public class Pastley implements Serializable {

	private static final long serialVersionUID = 1L;

	public static <A> List<Item<A>> addItem(Item<A> item, List<Item<A>> list) {
		if (item != null && list != null) {
			list.add(item);
		}
		return list;
	}
}
