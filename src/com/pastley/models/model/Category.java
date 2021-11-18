package com.pastley.models.model;

import java.io.Serializable;
import java.text.ParseException;
import java.time.LocalDate;

import org.json.simple.JSONObject;

import com.pastley.util.PastleyDate;

public class Category implements Serializable {

	private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private boolean statu;
	private String dateRegister;
	private String dateUpdate;
	
	public Category() {
	}
	
	public Category(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Category(JSONObject object) {
		this.id = Long.parseLong(String.valueOf(object.get("id")));
		this.name = object.get("name").toString();
		this.statu = Boolean.parseBoolean(object.get("statu").toString());
		this.dateRegister = object.get("dateRegister").toString();
		this.dateUpdate = object.get("dateUpdate") != null ? object.get("dateUpdate").toString() : null;
	}

	public LocalDate getDateWithoutTime() {
		PastleyDate date = new PastleyDate();
		try {
			return PastleyDate.convertToLocalDate(date.convertToDate(dateRegister));
		} catch (ParseException e) {
			return LocalDate.now();
		}
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", statu=" + statu + ", dateRegister=" + dateRegister
				+ ", dateUpdate=" + dateUpdate + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isStatu() {
		return statu;
	}

	public void setStatu(boolean statu) {
		this.statu = statu;
	}

	public String getDateRegister() {
		return dateRegister;
	}

	public void setDateRegister(String dateRegister) {
		this.dateRegister = dateRegister;
	}

	public String getDateUpdate() {
		return dateUpdate;
	}

	public void setDateUpdate(String dateUpdate) {
		this.dateUpdate = dateUpdate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
