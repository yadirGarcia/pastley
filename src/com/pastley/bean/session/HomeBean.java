package com.pastley.bean.session;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import com.pastley.models.component.Footer;

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

	public Footer getFooter() {
		return footer;
	}

	public void setFooter(Footer footer) {
		this.footer = footer;
	}

	public MenuBean getMenuBean() {
		return menuBean;
	}

	public void setMenuBean(MenuBean menuBean) {
		this.menuBean = menuBean;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
