package com.pastley.bean.session;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import com.pastley.models.component.Footer;

import lombok.Data;

@Data
@ManagedBean(name = "home")
@SessionScoped
public class HomeBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Footer footer;

	@ManagedProperty("#{menu}")
	private MenuBean menuBean;

	@PostConstruct
	public void init() {
		this.initFooter();
	}

	public void initFooter() {
		this.footer = new Footer();
		this.footer.fill();
		this.footer.setCategories((this.menuBean != null || this.menuBean.getMenuI() != null
				|| this.menuBean.getMenuI().getLevel() != null) ? this.menuBean.getMenuI().getLevel()
						: this.footer.getCategories());
	}
}
