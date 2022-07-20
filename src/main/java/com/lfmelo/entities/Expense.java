package com.lfmelo.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.lfmelo.entities.dto.ExpenseDTO;

@Entity(name = "TB_EXPENSE")
public class Expense {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String description;
	
	@Column
	private String type;
	
	@Column
	private BigDecimal value;
	
	@Column
	private LocalDateTime releaseDate;
	
	@ManyToOne
	@JoinColumn(name = "person")
	private Person person;
	

	public Expense() {}
	

	public Expense(String description, String type, BigDecimal value, LocalDateTime releaseDate, Person person) {
		super();
		this.description = description;
		this.type = type;
		this.value = value;
		this.releaseDate = releaseDate;
		this.person = person;
	}

	public Expense(ExpenseDTO dto) {
		this.description = dto.getDescription();
		this.type = dto.getType();
		this.value = dto.getValue();
		this.releaseDate = LocalDateTime.now();
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public LocalDateTime getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDateTime releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	
}
