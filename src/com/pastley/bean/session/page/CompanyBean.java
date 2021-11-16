package com.pastley.bean.session.page;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import lombok.Data;

@Data
@ManagedBean(name = "company")
@SessionScoped
public class CompanyBean implements Serializable{
	
	private static final long serialVersionUID = 1L;

}
