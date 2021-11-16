package com.pastley.models.dto;

import java.io.Serializable;

import org.json.simple.JSONObject;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
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
}
