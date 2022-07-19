package com.lfmelo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lfmelo.entities.Address;
import com.lfmelo.entities.dto.AddressDTO;
import com.lfmelo.repositories.AddressRepository;

@Service
public class AddressService {

	@Autowired
	private AddressRepository repo;
	
	public Address create(AddressDTO dto) {
		Address address = new Address(dto);
		return this.repo.save(address);
	}
}
