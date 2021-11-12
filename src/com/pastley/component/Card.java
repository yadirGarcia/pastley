package com.pastley.component;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Card extends Component {

	private static final long serialVersionUID = 1L;
	private String path;
	private String value;
	private String name;
	private boolean isPrice;
	private List<Link> links;

	public Card(String path, String value, String name, boolean isPrice, List<Link> links, String styleClass, String id,
			String icon) {
		super(id, styleClass, icon);
		this.path = path;
		this.value = value;
		this.name = name;
		this.isPrice = isPrice;
		this.links = links;
	}
}
