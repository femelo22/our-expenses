package com.lfmelo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lfmelo.entities.Expense;
import com.lfmelo.entities.dto.ExpenseDTO;
import com.lfmelo.services.ExpenseService;

@RestController
@RequestMapping("/expenses")
public class ExpenseResource {

	@Autowired
	private ExpenseService service;
	
	@PostMapping
	public ResponseEntity<Expense> create(@RequestBody ExpenseDTO dto) {
		return ResponseEntity.ok().body(this.service.create(dto));
	}
	
	@GetMapping
	public ResponseEntity<String> create(@PathVariable String startDate, @PathVariable String endDate, @PathVariable Integer personId) {
		
		//TODO: IMPLEMENTAR CONVERSÃO DE DATA STRING PARA LOCALDATETIME
		
		return null;
	}
}
