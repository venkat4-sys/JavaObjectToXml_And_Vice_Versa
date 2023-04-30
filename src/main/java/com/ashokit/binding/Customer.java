package com.ashokit.binding;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Customer {
	
	private Integer Id;
	
	private String name;
	
	private String email;
	
	private Long phno;
	
	private Address addr;
	

}
