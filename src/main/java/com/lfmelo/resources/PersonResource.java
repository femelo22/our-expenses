package com.lfmelo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lfmelo.entities.Person;
import com.lfmelo.entities.dto.PersonDTO;
import com.lfmelo.services.PersonService;

@RestController
@RequestMapping("/people")
public class PersonResource {
	
	@Autowired
	private PersonService service;
	
	@PostMapping
	private ResponseEntity<Person> create(@RequestBody PersonDTO person) {
		return ResponseEntity.ok().body(this.service.create(person));
	}
	

}
