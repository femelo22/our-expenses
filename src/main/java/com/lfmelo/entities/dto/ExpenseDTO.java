package com.lfmelo.entities.dto;

import java.math.BigDecimal;

public class ExpenseDTO {
	
	private String description;
	
	private String type;
	
	private BigDecimal value;
	
	private Integer personId;
	
	public ExpenseDTO() {}

	public ExpenseDTO(String description, String type, BigDecimal value, Integer personId) {
		super();
		this.description = description;
		this.type = type;
		this.value = value;
		this.personId = personId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}
	
	

}
