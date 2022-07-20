package com.lfmelo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.lfmelo.entities.Expense;
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
		return this.repo.save(expense);
	}
	
	
	//TODO: SERVIÇO PARA PAGAR UMA DESPESA (FECHAR O STATUS)
}
