package com.pastley.bean.view.page;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.pastley.bean.view.DataTableBean;
import com.pastley.models.dto.CrudDTO;
import com.pastley.models.dto.InitDTO;
import com.pastley.models.dto.PrimeFacesDTO;
import com.pastley.models.model.Category;


@ManagedBean(name = "category")
@ViewScoped
public class CategoryBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private CrudDTO<Category> crud;
	private Category category;
	
	@ManagedProperty("#{table}")
	private DataTableBean tableBean;

	@PostConstruct
	public void init() {
		initCrud();
	}

	public void initCrud() {
		this.crud = new CrudDTO<Category>(tableBean.getCategoryTable().getEntity(), "categoria", "selecionada");
		initOther();
	}
	
	public void sync() throws InterruptedException {
		crud.initAlert();
		tableBean.initCategory();
		crud.getAlert().success("Se ha actualizado la tabla categoria.");
		crud.getAlert().toPrintln(true);
		PrimeFacesDTO prime = new PrimeFacesDTO();
		prime.primefacesTableClearFilter("lsy-table");
	}
	
	public void open(Category category, boolean edit, boolean subcategory) {
		crud.setSelect(new Category());
		if(edit) {
			crud.setSelect(category);
		}
		openStatu((!edit), (!subcategory));
		PrimeFacesDTO prime = new PrimeFacesDTO();
		prime.primefacesDialog(1, "lsy-table-dialog");
	}
	
	public void openStatu(boolean statu, boolean title) {
		crud.getStatu().setStatu(statu);
		crud.getStatu().setTitle((statu ? "Registrar" : " Actualizar"));
		crud.getStatu().setSubtitle((title ? "Categoria" : " Subcategoria"));
	}
	
	public void initOther() {
		this.category = InitDTO.category();
	}

	public CrudDTO<Category> getCrud() {
		return crud;
	}

	public void setCrud(CrudDTO<Category> crud) {
		this.crud = crud;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public DataTableBean getTableBean() {
		return tableBean;
	}

	public void setTableBean(DataTableBean tableBean) {
		this.tableBean = tableBean;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
