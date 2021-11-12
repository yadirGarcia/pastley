package com.pastley.bean.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.pastley.component.Card;
import com.pastley.component.Link;

import lombok.Data;

@Data
@ManagedBean(name = "card")
@ViewScoped
public class CardBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Card> cardsUser;

	@PostConstruct
	public void init() {
		this.cardsUser = new ArrayList<>();
	}

	public void initCardUser() {
		this.cardsUser.add(new Card("login.xhtml", "30000", "Clientes", false, new ArrayList<Link>(), "lsy-bg-c-success",
				"", "pi pi-user"));
		this.cardsUser
				.add(new Card("login.xhtml", "30000", "Cajeros", false, new ArrayList<Link>(), "", "", "pi pi-user"));
		this.cardsUser.add(new Card("login.xhtml", "30000", "Productos", false, new ArrayList<Link>(), "lsy-bg-c-fatal",
				"", "pi pi-user"));
		this.cardsUser.add(new Card("login.xhtml", "30000", "Ventas", true, new ArrayList<Link>(), "lsy-bg-c-warning",
				"", "pi pi-user"));
		this.cardsUser.add(new Card("login.xhtml", "30000", "Contacto", true, new ArrayList<Link>(), "lsy-bg-c-info",
				"", "pi pi-user"));
	}

	public List<Card> getCardsUser() {
		initCardUser();
		return cardsUser;
	}
}
