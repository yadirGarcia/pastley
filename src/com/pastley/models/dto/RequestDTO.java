package com.pastley.models.dto;

import java.io.Serializable;
import java.lang.reflect.Field;

import org.json.simple.JSONObject;

import com.pastley.models.model.Product;

public class RequestDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private JSONObject object;

	public void init() {
		if (object == null)
			object = new JSONObject();
	}

	@SuppressWarnings("unchecked")
	public <A> void add(String key, A value) {
		this.init();
		this.object.put(key, value);
	}

	@SuppressWarnings("deprecation")
	public <A> void add(Product product) {
		for (Field field : Product.class.getDeclaredFields()) {
			if (!field.isAccessible()) {
				field.setAccessible(true);
			}
			try {
				add(field.getName(), field.get(product));
			} catch (Exception e) {
			}
		}
	}

	public JSONObject getObject() {
		return object;
	}

	public void setObject(JSONObject object) {
		this.object = object;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
