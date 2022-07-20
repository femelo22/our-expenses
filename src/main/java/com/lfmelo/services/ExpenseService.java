package com.lfmelo.services;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.lfmelo.entities.Expense;
import com.lfmelo.entities.ExpenseStatus;
import com.lfmelo.entities.Person;
import com.lfmelo.entities.dto.ExpenseDTO;
import com.lfmelo.repositories.ExpenseRepository;

@Service
public class ExpenseService {

	@Autowired
	private ExpenseRepository repo;
	
	@Autowired
	private PersonService personService;
	
	
	public Expense create(@RequestBody ExpenseDTO dto) {
		Expense expense = new Expense(dto);
		Person person = this.personService.findById(dto.getPersonId());
		expense.setPerson(person);
		expense.setStatus(ExpenseStatus.OPEN);
		return this.repo.save(expense);
	}
	
	
	public String calculateExpenses(LocalDateTime startDate, LocalDateTime endDate, Integer personId) {
		
		Person person = this.personService.findById(personId);
		
		List<Expense> expenses = this.repo.findByReleaseDateBetweenAndPerson(startDate, endDate, person);
		
		BigDecimal value = BigDecimal.ZERO;
		
		//TODO: FAZER VALIDAÇÃO PARA DESPESAS ABERTAS
		
		for (Expense expense : expenses) {
			System.out.println(expense.getValue());
			value = value.add(expense.getValue());
		}
		
		return person.getName() + " deve pagar um total de " + value;
	}
}
