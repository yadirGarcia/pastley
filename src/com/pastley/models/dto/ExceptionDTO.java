package com.pastley.models.dto;

import java.io.Serializable;

import org.json.simple.JSONObject;

import com.pastley.util.PastleyValidate;

public class ExceptionDTO extends Exception implements Serializable {

	private static final long serialVersionUID = 1L;

	private String exception;
	private String path;
	private String message;
	private int statu;

	public ExceptionDTO(Exception e) {
		if (e != null) {
			this.exception = e.getLocalizedMessage();
			this.path = e.getLocalizedMessage();
			this.message = e.getMessage();
			this.statu = 404;
		}
	}

	public ExceptionDTO(JSONObject object) {
		if (object != null) {
			this.exception = PastleyValidate.isObject(object.get("exception")) ? String.valueOf(object.get("exception"))
					: "N/A";
			this.path = PastleyValidate.isObject(object.get("path")) ? String.valueOf(object.get("path")) : "N/A";
			this.message = PastleyValidate.isObject(object.get("message")) ? String.valueOf(object.get("message"))
					: "N/A";
			this.statu = PastleyValidate.isObject(object.get("message"))
					? Integer.parseInt(String.valueOf(object.get("message")))
					: 500;
		}
	}

	@Override
	public String toString() {
		return "ExceptionDTO [exception=" + exception + ", path=" + path + ", message=" + message + ", statu=" + statu
				+ "]";
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
