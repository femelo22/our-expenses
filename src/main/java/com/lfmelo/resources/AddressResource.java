package com.lfmelo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lfmelo.entities.Address;
import com.lfmelo.entities.dto.AddressDTO;
import com.lfmelo.services.AddressService;

@RestController
@RequestMapping("/adresses")
public class AddressResource {

	@Autowired
	private AddressService service;
	
	
	@PostMapping
	public ResponseEntity<Address> create(@RequestBody AddressDTO dto) {
		return ResponseEntity.ok().body(this.service.create(dto));
	}
}
