package com.lfmelo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.lfmelo.entities.dto.PersonDTO;

@Entity(name = "TB_PERSON")
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "address")
	private Address address;
	
	public Person() {}
	
	public Person(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	public Person(PersonDTO dto) {
		this.name = dto.getName();	
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
}
