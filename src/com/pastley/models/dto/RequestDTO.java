package com.pastley.models.dto;

import java.io.Serializable;

import org.json.simple.JSONObject;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RequestDTO<A> implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private JSONObject object;
	private A value;
}
