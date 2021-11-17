package com.pastley.models.dto;

import java.io.Serializable;

import org.json.simple.JSONObject;

public class ExceptionDTO extends Exception implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String exception;
	private String path;
	private String message;
	private int statu;
	
	
	public ExceptionDTO(Exception e) {
		if(e != null) {
			this.exception = e.getLocalizedMessage();
			this.path = e.getLocalizedMessage();
			this.message = e.getMessage();
			this.statu = 404;
		}
	}
	
	public ExceptionDTO(JSONObject object) {
		if(object != null) {
			this.exception = String.valueOf(object.get("exception"));
			this.path = String.valueOf(object.get("path"));
			this.message = String.valueOf(object.get("message"));
			this.statu = Integer.parseInt(String.valueOf(object.get("statu")));
		}
	}

	public String getException() {
		return exception;
	}

	public void setException(String exception) {
		this.exception = exception;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getStatu() {
		return statu;
	}

	public void setStatu(int statu) {
		this.statu = statu;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
