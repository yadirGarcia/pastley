package com.pastley.models.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.primefaces.model.FilterMeta;

public class DataTableDTO<A> extends StatuDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<A> entity;
	private List<A> entityCopy;
	private List<A> select;
	private List<A> filter;
	private List<FilterMeta> filterValue;
	private List<FilterMeta> filterBy;
	
	public DataTableDTO() {
		this(new ArrayList<>());
	}
	
	public DataTableDTO(List<A> entity) {
		this.entity = entity;
		this.entityCopy = entity;
		initTable();
	}
	
	public void initTable(){
		filter = new ArrayList<>();
		initStatu();
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

	public List<A> getEntityCopy() {
		return entityCopy;
	}

	public void setEntityCopy(List<A> entityCopy) {
		this.entityCopy = entityCopy;
	}

	public List<A> getFilter() {
		return filter;
	}

	public void setFilter(List<A> filter) {
		this.filter = filter;
	}

	public List<FilterMeta> getFilterValue() {
		return filterValue;
	}

	public void setFilterValue(List<FilterMeta> filterValue) {
		this.filterValue = filterValue;
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
