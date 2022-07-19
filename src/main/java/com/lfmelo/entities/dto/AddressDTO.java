package com.lfmelo.entities.dto;

public class AddressDTO {
	
	private String locality;
	
	private String street;
	
	private String neighborhood;
	
	private String number;
	
	private String complement;
	
	private String uf;
	
	private String cep;
	
	public AddressDTO() {}

	public AddressDTO(String locality, String street, String neighborhood, String number, String complement, String uf,
			String cep) {
		super();
		this.locality = locality;
		this.street = street;
		this.neighborhood = neighborhood;
		this.number = number;
		this.complement = complement;
		this.uf = uf;
		this.cep = cep;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	
	
	
}
