package com.lfmelo.services;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lfmelo.entities.Person;
import com.lfmelo.repositories.PersonRespository;

@Service
public class PersonService {

	@Autowired
	private PersonRespository repo;
	
	public List<Person> findAll() {
		return this.repo.findAll();
	}
	
	public Person findById(Integer id) {
		return this.repo.findById(id).orElseThrow();
	}
	
	public Person create(Person person) {
		return this.repo.save(person);
	}
	
	public Person update(Person person, Integer id) {
		Person newPerson = new Person();
		newPerson.setId(id);
		BeanUtils.copyProperties(person, newPerson);
		return this.repo.save(newPerson);
	}
	
}
