package com.pastley.bean.request;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.io.IOException;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import lombok.Data;

@ManagedBean(name = "requestApp")
@RequestScoped
@Data
public class RequestBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = LoggerFactory.getLogger(RequestBean.class);

	private FacesContext context;
	private ExternalContext external;
	private String url;

	public void init() {
		this.context = FacesContext.getCurrentInstance();
		this.external = context.getExternalContext();
		this.url = this.external.getRequestContextPath();
	}

	public void direct(String path) {
		LOGGER.info("Accessing method: direct(String path)");
		this.init();
		try {
			this.external.redirect(this.url + "/" + path);
		} catch (IOException e) {
		}
	}
}
