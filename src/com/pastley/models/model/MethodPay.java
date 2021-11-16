package com.pastley.models.model;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MethodPay implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private boolean statu;
	private String name;
	private String dateRegister;
	private String dateUpdate;
}
