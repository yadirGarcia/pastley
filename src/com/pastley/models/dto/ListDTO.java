package com.pastley.models.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.pastley.util.PastleyValidate;

public class ListDTO <A> implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private List<A> list;
	private A entity;
	private int index;
	
	public ListDTO() {
		this(null);
	}
	
	public ListDTO(List<A> list) {
		this.list = list;
		this.index = -1;
	}
	
	public void reset() {
		if(!PastleyValidate.isList(list)) {
			list = new ArrayList<A>();
		}
	}
	
	public boolean isList() {
		return (PastleyValidate.isList(list));
	}
	
	public boolean isValidate(A entity) {
		return (entity != null && isList());
	}

	public boolean remove(A entity) {
		return (isValidate(entity)) ? list.remove(entity) : false;
	}
	
	public int index(A entity) {
		index = -1;
		if(isValidate(entity)) {
			index = list.indexOf(entity);
			if(index >= 0) {
				this.entity = list.get(index);
			}
		}
		return index;
	}
	
	public boolean replace(A entity) {
		if(isValidate(entity)) {
			index = index(entity);
			if(index >= 0) {
				list.set(index, entity);
				return true;
			}
		}
		return false;
	}
	
	public boolean add(List<A> list) {
		reset();
		if(PastleyValidate.isList(list)) {
			for(A e: list) {
				if(e != null) {
					this.list.add(e);
				}
			}
			return true;
		}
		return false;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<A> getList() {
		return list;
	}

	public void setList(List<A> list) {
		this.list = list;
	}

	public A getEntity() {
		return entity;
	}

	public void setEntity(A entity) {
		this.entity = entity;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

}
