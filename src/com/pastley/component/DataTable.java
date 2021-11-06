package com.pastley.component;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.primefaces.model.FilterMeta;

import lombok.Data;

@Data
public class DataTable<A> implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<A> entity;
	private List<A> select;
	private List<A> filter;
	private List<FilterMeta> filterBy;

	public DataTable() {
		this(new ArrayList<A>());
	}

	public DataTable(List<A> entity) {
		this.entity = entity;
		this.filter = new ArrayList<A>();
	}
}
