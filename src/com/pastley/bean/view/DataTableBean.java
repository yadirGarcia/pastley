package com.pastley.bean.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.json.simple.JSONObject;

import com.oastley.controller.RequestController;
import com.pastley.models.dto.DataTableDTO;
import com.pastley.models.dto.ExceptionDTO;
import com.pastley.models.model.Category;
import com.pastley.models.model.MethodPay;
import com.pastley.models.model.Product;
import com.pastley.util.PastleyVariable;

@ManagedBean(name = "table")
@ViewScoped
public class DataTableBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	/* Sale Service */
	private DataTableDTO<MethodPay> methodPay;
	
	/* Product Service */
	private DataTableDTO<Category> categoryTable;
	private DataTableDTO<Product>  productTable;
	
	@PostConstruct
	public void init() {
		this.methodPay = new DataTableDTO<>();
		this.categoryTable = new DataTableDTO<>();
		this.productTable = new DataTableDTO<>();
	}	
	
	public void initMethodPay() {
		if(isMethodPay())
			methodPay.setRenderizar(0);	
	}
	
	public void initCategory() {
		if(isCategory())
			categoryTable.setRenderizar(0);	
	}
	
	public void initProduct() {
		if(isProduct())
			productTable.setRenderizar(0);	
	}
	
	public boolean isMethodPay() {
		return methodPay != null;
	}
	
	public boolean isCategory() {
		return categoryTable != null;
	}
	
	public boolean isProduct() {
		return productTable != null;
	}
	
	public List<MethodPay> getMethodPayEntity(){
		if(!isMethodPay())
			return new ArrayList<>();
		if(methodPay.getRenderizar() == 0) {
			try {
				RequestController<List<MethodPay>> request = new RequestController<>();
				methodPay.setEntity(request.get(PastleyVariable.PASTLEY_API_MICROSERVICE_SALE_SERVICE_METHOD, null));
				methodPay.setRenderizar(1);
			}catch (ExceptionDTO e) {
				methodPay.setEntity(new ArrayList<>());
			}
		}
		return methodPay.getEntity();
	}
	
	public List<Category> getCategoryEntity(){
		if(!isCategory())
			return new ArrayList<>();
		if(categoryTable.getRenderizar() == 0) {
			try {
				RequestController<List<JSONObject>> request = new RequestController<>();
				List<JSONObject> list = request.get(PastleyVariable.PASTLEY_API_MICROSERVICE_PRODUCT_SERVICE_CATEGORY, null);
				categoryTable.setEntity(new ArrayList<>());
				for(JSONObject object: list) {
					categoryTable.getEntity().add(new Category(object));
				}
				categoryTable.setRenderizar(1);
			}catch (ExceptionDTO e) {
				categoryTable.setEntity(new ArrayList<>());
			}
		}
		return categoryTable.getEntity();
	}
	
	public List<Product> getProductEntity(){
		if(!isProduct())
			return new ArrayList<>();
		if(productTable.getRenderizar() == 0) {
			try {
				RequestController<List<JSONObject>> request = new RequestController<>();
				List<JSONObject> list = request.get(PastleyVariable.PASTLEY_API_MICROSERVICE_PRODUCT_SERVICE_PRODUCT, null);
				productTable.setEntity(new ArrayList<>());
				for(JSONObject object: list) {
					productTable.getEntity().add(new Product(object));
				}
				productTable.setRenderizar(1);
			}catch (ExceptionDTO e) {
				productTable.setEntity(new ArrayList<>());
			}
		}
		return productTable.getEntity();
	}
	
	public DataTableDTO<MethodPay> getMethodPay(){
		return methodPay;
	}

	public void setMethodPay(DataTableDTO<MethodPay> methodPay) {
		this.methodPay = methodPay;
	}

	public DataTableDTO<Category> getCategoryTable() {
		return categoryTable;
	}

	public void setCategoryTable(DataTableDTO<Category> categoryTable) {
		this.categoryTable = categoryTable;
	}

	public DataTableDTO<Product> getProductTable() {
		return productTable;
	}

	public void setProductTable(DataTableDTO<Product> productTable) {
		this.productTable = productTable;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
