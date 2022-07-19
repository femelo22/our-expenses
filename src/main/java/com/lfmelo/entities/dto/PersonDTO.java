package com.lfmelo.entities.dto;

public class PersonDTO {
	
	
	private String name;
	
	private Integer addressId;
	
	public PersonDTO() {}

	public PersonDTO(String name, Integer addressId) {
		super();
		this.name = name;
		this.addressId = addressId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	
	

}
