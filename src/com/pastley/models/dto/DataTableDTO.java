package com.pastley.models.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.primefaces.model.FilterMeta;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DataTableDTO<A> extends StatuDTO implements Serializable {

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
