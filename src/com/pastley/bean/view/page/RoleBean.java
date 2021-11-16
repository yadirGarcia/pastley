package com.pastley.bean.view.page;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import lombok.Data;

@Data
@ManagedBean(name = "role")
@ViewScoped
public class RoleBean implements Serializable{
	
	private static final long serialVersionUID = 1L;

}
