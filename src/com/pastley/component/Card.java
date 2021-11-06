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
public class Card extends Component{
	
	private static final long serialVersionUID = 1L;
	private String path;
	private String value;
	private String name;
	
	private List<Link> links;
}
