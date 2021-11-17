package com.pastley.models.dto;

import java.io.Serializable;

import org.json.simple.JSONObject;

public class RequestDTO<A> implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private JSONObject object;
	private A value;
	
	public JSONObject getObject() {
		return object;
	}
	public void setObject(JSONObject object) {
		this.object = object;
	}
	public A getValue() {
		return value;
	}
	public void setValue(A value) {
		this.value = value;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
