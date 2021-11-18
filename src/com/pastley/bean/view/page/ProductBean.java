package com.pastley.bean.view.page;

import java.io.Serializable;
import java.util.Locale;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.oastley.controller.RequestController;
import com.pastley.bean.view.DataTableBean;
import com.pastley.models.dto.CrudDTO;
import com.pastley.models.dto.ExceptionDTO;
import com.pastley.models.dto.FilterDTO;
import com.pastley.models.dto.InitDTO;
import com.pastley.models.dto.RequestDTO;
import com.pastley.models.model.Product;
import com.pastley.util.PastleyVariable;

@ManagedBean(name = "product")
@ViewScoped
public class ProductBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private CrudDTO<Product> crud;
	private Product product;

	@ManagedProperty("#{table}")
	private DataTableBean tableBean;

	@PostConstruct
	public void init() {
		initCrud();
	}

	public void initCrud() {
		this.crud = new CrudDTO<Product>(tableBean.getProductTable().getEntity(), "producto", "selecionado");
		initOther();
	}

	public void initOther() {
		this.product = InitDTO.product(true);
	}

	public void create() {
		crud.insert(true, false, true);
		RequestController<Product> request = new RequestController<>();
		try {
			RequestDTO send = new RequestDTO();
			Product create = request.post(PastleyVariable.PASTLEY_API_MICROSERVICE_PRODUCT_SERVICE_PRODUCT + "/"
					+ PastleyVariable.PASTLEY_API_REQUEST_CREATE, send.getObject());
			crud.getAlert().success("Se ha registrado el producto con el id "+create.getId());
			crud.insert(false, true, false);
		} catch (ExceptionDTO e) {
			crud.getAlert().error(e.getMessage());
		}
		crud.getAlert().toPrintln(true);
	}

	public boolean filterByInteger(Object value, Object filter, Locale locale) {
		return FilterDTO.filterByInteger(value, filter, locale);
	}

	public CrudDTO<Product> getCrud() {
		return crud;
	}

	public void setCrud(CrudDTO<Product> crud) {
		this.crud = crud;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
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