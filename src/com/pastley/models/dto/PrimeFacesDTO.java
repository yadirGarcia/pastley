package com.pastley.models.dto;

import java.io.Serializable;

import org.primefaces.PrimeFaces;

public class PrimeFacesDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;

	public void primefacesTableClearFilter(String table) {
		PrimeFaces current = PrimeFaces.current();
		current.executeScript("PF('"+table+"').clearFilters()");
	} 
	
	public void primefacesTableUnSelect(String table) {
		PrimeFaces current = PrimeFaces.current();
		current.executeScript("PF('"+table+"').unselectAllRows()");
	}
	
	public void primefacesDialog(int statu, String dialog) {
		PrimeFaces current = PrimeFaces.current();
		switch (statu) {
		case 1:
			current.executeScript("PF('"+dialog+"').show();");
			break;
		case 2:
			current.executeScript("PF('"+dialog+"').hide();");
			break;
		default:
			break;
		}
	}
	
	public void primefacesUpdate(String a, String b) {
		PrimeFaces.current().ajax().update(a, b);
	}
	
	public void primefacesFileUpdate(String a) {
		PrimeFaces current = PrimeFaces.current();
		current.executeScript("PF('"+a+"').reset();");
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
