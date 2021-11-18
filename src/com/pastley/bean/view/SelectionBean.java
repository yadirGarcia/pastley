package com.pastley.bean.view;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;
import javax.faces.model.SelectItemGroup;

import org.json.simple.JSONObject;

import com.oastley.controller.RequestController;
import com.pastley.models.dto.ExceptionDTO;
import com.pastley.models.model.Category;
import com.pastley.util.PastleyValidate;
import com.pastley.util.PastleyVariable;

@ManagedBean(name = "selection")
@ViewScoped
public class SelectionBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<SelectItem> category;
	private boolean renderizarCategory;

	@PostConstruct
	public void init() {
		renderizarCategory = true;
	}

	public List<SelectItem> getCategory() {
		if (renderizarCategory) {
			this.category = new ArrayList<>();
			SelectItemGroup group = new SelectItemGroup("No se ha encontrado ninguna categoria.");
			try {
				RequestController<List<JSONObject>> request = new RequestController<>();
				List<JSONObject> list = request.get(PastleyVariable.PASTLEY_API_MICROSERVICE_PRODUCT_SERVICE_CATEGORY
						+ "/" + PastleyVariable.PASTLEY_API_REQUEST_ALL_GET_STATU + "true", null);
				if (PastleyValidate.isList(list)) {
					group = new SelectItemGroup("Categorias");
					int i = 0;
					SelectItem[] items = new SelectItem[list.size()];
					for (JSONObject object : list) {
						Category c = new Category(object);
						items[i] = new SelectItem(String.valueOf(c.getId()), c.getName());
						i++;
					}
					group.setSelectItems(items);
				} else {
					group.setSelectItems(new SelectItem[0]);
				}
			} catch (ExceptionDTO e) {
				group.setSelectItems(new SelectItem[0]);
			} finally {
				category.add(group);
				renderizarCategory = false;
			}
		}
		return category;
	}

	public static void main(String[] args) {
		SelectionBean bean = new SelectionBean();
		bean.setRenderizarCategory(true);
		bean.getCategory();
	}

	public void setCategory(List<SelectItem> category) {
		this.category = category;
	}

	public boolean isRenderizarCategory() {
		return renderizarCategory;
	}

	public void setRenderizarCategory(boolean renderizarCategory) {
		this.renderizarCategory = renderizarCategory;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
