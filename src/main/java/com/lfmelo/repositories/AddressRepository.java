package com.lfmelo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lfmelo.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Integer>{

}
