package com.pastley.models.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class StatuDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	protected boolean register;
	protected boolean update;
	protected boolean remove;
	protected boolean filter;
	protected boolean filterClear;
	protected boolean error;
	protected boolean errorAdv;
	protected boolean statu;
	protected boolean url;

	protected int renderizar;
	protected int indexI;
	protected int indexJ;
	
	protected String title;
	protected String subtitle;
	
	public void initStatu() {
		register = false;
		update = false;
		remove = false;
		filter = false;
		filterClear = false;
		statu = false;
		error = false;
		errorAdv = false;
		url = false;
		renderizar = 0;
		indexI = -1;
		indexJ = -1;
		title = null;
		subtitle = null;
	}
	
	public void update(boolean error, boolean update) {
		this.error = error;
		this.update = update;
	}
	
	public void remove(boolean error, boolean remove) {
		this.error = error;
		this.remove = remove;
	}
	
	public void index(int i, int j) {
		this.indexI = i;
		this.indexJ = j;
	}

}
