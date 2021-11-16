package com.pastley.models.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.primefaces.model.FilterMeta;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DataTableDTO<A> implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<A> entity;
	private List<A> select;
	private List<A> filter;
	private List<FilterMeta> filterBy;
	
	public DataTableDTO(List<A> entity) {
		this.entity = entity;
		this.filter = new ArrayList<A>();
	}
}
