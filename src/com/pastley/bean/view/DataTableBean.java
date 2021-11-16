package com.pastley.bean.view;


import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.pastley.models.dto.DataTableDTO;
import com.pastley.models.model.MethodPay;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@ManagedBean(name = "table")
@ViewScoped
public class DataTableBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	/* Method Pay */
	private DataTableDTO<MethodPay> methodPay;
	
	@PostConstruct
	public void init() {
		this.methodPay = new DataTableDTO<>();
	}	
	
	public void initMethodPay() {
		if(isMethodPay())
			methodPay.setRenderizar(0);	
	}
	
	public boolean isMethodPay() {
		return methodPay != null;
	}
	
	public DataTableDTO<MethodPay> getMethodPay(){
		if(isMethodPay() && methodPay.getRenderizar() == 0) {
			System.out.print("Llenando metodo de pago.");
		}
		return methodPay;
	}
}
