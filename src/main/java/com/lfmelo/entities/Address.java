package com.lfmelo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "TB_ADDRESS")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String street;
	
	private String neighborhood;
	
	private String number;
	
	private String complement;
	
	private String uf;
	
	private String cep;
	
	private String locality;
	
	public Address() {
		
	}
	
	

	public Address(String street, String neighborhood,String number, String complement, String uf, String cep,
			String locality) {
		super();
		this.street = street;
		this.neighborhood = neighborhood;
		this.number = number;
		this.complement = complement;
		this.uf = uf;
		this.cep = cep;
		this.locality = locality;
	}



	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
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

	public String getComplement() {
		return complement;
	}
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
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

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}
}
