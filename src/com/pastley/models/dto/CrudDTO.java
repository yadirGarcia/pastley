package com.pastley.models.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.pastley.util.PastleyValidate;

public class CrudDTO<A> implements Serializable {

	private static final long serialVersionUID = 1L;

	private A select;
	private String name;
	private String subname;

	private List<A> list;
	private List<A> listSelect;

	private StatuDTO statu;
	private AlertDTO alert;

	public CrudDTO() {
		this(new ArrayList<>(), null, "Selecionada");
	}
	
	public CrudDTO(List<A> list, String name, String subname) {
		this.name = name;
		this.list = list;
		this.subname = subname;
		init();
	}

	public void init() {
		initStatu();
		initAlert();
	}
	
	public void initCrud(List<A> list) {
		this.list = list;
		listSelect = new ArrayList<>();
		select = null;
	}
	
	public void initStatu() {
		statu = new StatuDTO();
	}
	
	public void initAlert() {
		alert = new AlertDTO();
	}
	
	public void resetStatu() {
		if(statu == null) 
			statu = new StatuDTO();
	}
	
	public void reset(boolean reset) {
		if(reset) {
			initAlert();
		}
		resetStatu();
	}
	
	public void update(boolean error, boolean update, boolean reset) {
		reset(reset);
		statu.update(error, update);
	}
	
	public void remove(boolean error, boolean remove, boolean reset) {
		reset(reset);
		statu.remove(error, remove);
	}
	
	public void insert(boolean error, boolean insert, boolean reset) {
		reset(reset);
		statu.register(error, insert);
	}
	
	public String getMessageDeleteCrud() {
		if(PastleyValidate.isList(this.listSelect)) {
			int count = listSelect.size();
			return  count + " "+ ConvertDTO.plural(count, name) +" "+ConvertDTO.plural(count, subname)+".";
		}
		return "Eliminar";
	}

	public A getSelect() {
		return select;
	}

	public void setSelect(A select) {
		this.select = select;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubname() {
		return subname;
	}

	public void setSubname(String subname) {
		this.subname = subname;
	}

	public List<A> getList() {
		return list;
	}

	public void setList(List<A> list) {
		this.list = list;
	}

	public List<A> getListSelect() {
		return listSelect;
	}

	public void setListSelect(List<A> listSelect) {
		this.listSelect = listSelect;
	}

	public StatuDTO getStatu() {
		return statu;
	}

	public void setStatu(StatuDTO statu) {
		this.statu = statu;
	}

	public AlertDTO getAlert() {
		return alert;
	}

	public void setAlert(AlertDTO alert) {
		this.alert = alert;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
