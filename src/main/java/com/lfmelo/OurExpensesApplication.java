package com.lfmelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lfmelo.entities.Address;
import com.lfmelo.entities.Expense;
import com.lfmelo.entities.Person;
import com.lfmelo.repositories.AddressRepository;
import com.lfmelo.repositories.ExpenseRepository;
import com.lfmelo.repositories.PersonRespository;

@SpringBootApplication
public class OurExpensesApplication implements ApplicationRunner {
	
	@Autowired
	private AddressRepository addressRepo;
	
	@Autowired
	private ExpenseRepository expenseRepo;
	
	@Autowired
	private PersonRespository personRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(OurExpensesApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Address a1 = new Address("Rua Guacui", "São Matheus", "35", "406", "MG", "36025190", "Juiz de Fora");
		
		Person p1 = new Person("Luiz Fernando", a1);
		
		Expense ex1 = new Expense("Compras do mercado (pão, leite, batata)", "MERCADO", BigDecimal.valueOf(35.90), LocalDateTime.now(), p1);
		
		addressRepo.save(a1);
		
		personRepo.save(p1);
		
		expenseRepo.save(ex1);
		
	}

}
