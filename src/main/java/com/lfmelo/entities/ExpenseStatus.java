package com.lfmelo.entities;

public enum ExpenseStatus {
	
	OPEN(0, "OPEN"),
	PAID(1, "PAID");

	
	private Integer code;
	private String description;
	
	
	private ExpenseStatus(Integer code, String description) {
		this.code = code;
		this.description = description;
	}


	public Integer getCode() {
		return code;
	}


	public void setCode(Integer code) {
		this.code = code;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
}
