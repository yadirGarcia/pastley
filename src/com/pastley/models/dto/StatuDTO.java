package com.pastley.models.dto;

import java.io.Serializable;

public class StatuDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private boolean register;
	private boolean update;
	private boolean remove;
	private boolean filter;
	private boolean filterClear;
	private boolean error;
	private boolean errorAdv;
	private boolean statu;
	private boolean url;

	private int renderizar;
	private int indexI;
	private int indexJ;
	
	private String title;
	private String subtitle;
	
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
	
	public void register(boolean error, boolean register) {
		this.error = error;
		this.register = register;
	}
	
	public void remove(boolean error, boolean remove) {
		this.error = error;
		this.remove = remove;
	}
	
	public void index(int i, int j) {
		this.indexI = i;
		this.indexJ = j;
	}

	public boolean isRegister() {
		return register;
	}

	public void setRegister(boolean register) {
		this.register = register;
	}

	public boolean isUpdate() {
		return update;
	}

	public void setUpdate(boolean update) {
		this.update = update;
	}

	public boolean isRemove() {
		return remove;
	}

	public void setRemove(boolean remove) {
		this.remove = remove;
	}

	public boolean isFilter() {
		return filter;
	}

	public void setFilter(boolean filter) {
		this.filter = filter;
	}

	public boolean isFilterClear() {
		return filterClear;
	}

	public void setFilterClear(boolean filterClear) {
		this.filterClear = filterClear;
	}

	public boolean isError() {
		return error;
	}

	public void setError(boolean error) {
		this.error = error;
	}

	public boolean isErrorAdv() {
		return errorAdv;
	}

	public void setErrorAdv(boolean errorAdv) {
		this.errorAdv = errorAdv;
	}

	public boolean isStatu() {
		return statu;
	}

	public void setStatu(boolean statu) {
		this.statu = statu;
	}

	public boolean isUrl() {
		return url;
	}

	public void setUrl(boolean url) {
		this.url = url;
	}

	public int getRenderizar() {
		return renderizar;
	}

	public void setRenderizar(int renderizar) {
		this.renderizar = renderizar;
	}

	public int getIndexI() {
		return indexI;
	}

	public void setIndexI(int indexI) {
		this.indexI = indexI;
	}

	public int getIndexJ() {
		return indexJ;
	}

	public void setIndexJ(int indexJ) {
		this.indexJ = indexJ;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
