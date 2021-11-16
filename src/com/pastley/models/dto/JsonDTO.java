package com.pastley.models.dto;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class JsonDTO<A> implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Class<A> object;
	
	
	@SuppressWarnings("unchecked")
	public void read(String path) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		this.object =  (Class<A>) objectMapper.readValue(new File(path), Object.class);
	}
}
