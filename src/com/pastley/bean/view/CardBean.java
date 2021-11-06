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
public class CardBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private List<Card> cardsUser;
	
	public CardBean(){
	}
	
	@PostConstruct
	public void init() {
		this.cardsUser = new ArrayList<Card>();
	}
	
	public void initCardUser() {
		for(int i= 1; i<=6; i++) {
			Card card = new Card("login.xhtml", "30000"+i, "Card "+i, new ArrayList<Link>());
			card.setStyleClass("lsy-bg-success");
			card.setId("Card "+i);
			card.setIcon("pi pi-user");
			this.cardsUser.add(card);
		}
	}
	
	public List<Card> getCardsUser(){
		initCardUser();
		return cardsUser;
	}
}
