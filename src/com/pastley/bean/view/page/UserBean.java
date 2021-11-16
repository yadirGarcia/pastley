package com.pastley.bean.view.page;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import lombok.Data;

@Data
@ManagedBean(name = "user")
@ViewScoped
public class UserBean implements Serializable{
	
	private static final long serialVersionUID = 1L;

}
