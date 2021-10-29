package com.pastley.component;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.primefaces.model.FilterMeta;

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

	public List<A> getEntity() {
		return entity;
	}

	public void setEntity(List<A> entity) {
		this.entity = entity;
	}

	public List<A> getSelect() {
		return select;
	}

	public void setSelect(List<A> select) {
		this.select = select;
	}

	public List<A> getFilter() {
		return filter;
	}

	public void setFilter(List<A> filter) {
		this.filter = filter;
	}

	public List<FilterMeta> getFilterBy() {
		return filterBy;
	}

	public void setFilterBy(List<FilterMeta> filterBy) {
		this.filterBy = filterBy;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
