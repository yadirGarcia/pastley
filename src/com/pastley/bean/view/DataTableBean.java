package com.pastley.bean.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.oastley.controller.RequestController;
import com.pastley.models.dto.DataTableDTO;
import com.pastley.models.dto.ExceptionDTO;
import com.pastley.models.model.MethodPay;
import com.pastley.util.PastleyVariable;

@ManagedBean(name = "table")
@ViewScoped
public class DataTableBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	/* Method Pay */
	private DataTableDTO<MethodPay> methodPay;
	
	@PostConstruct
	public void init() {
		this.methodPay = new DataTableDTO<>();
		System.out.println(PastleyVariable.PASTLEY_API_MICROSERVICE_SALE_SERVICE_METHOD);
	}	
	
	public void initMethodPay() {
		if(isMethodPay())
			methodPay.setRenderizar(0);	
	}
	
	public boolean isMethodPay() {
		return methodPay != null;
	}
	
	public List<MethodPay> getMethodPayEntity(){
		System.out.println("ENTRO");
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
		System.out.println("SIZE: "+methodPay.getEntity().size());
		return methodPay.getEntity();
	}
	
	public DataTableDTO<MethodPay> getMethodPay(){
		if(!isMethodPay())
			methodPay = new DataTableDTO<>();
		return methodPay;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setMethodPay(DataTableDTO<MethodPay> methodPay) {
		this.methodPay = methodPay;
	}
}
