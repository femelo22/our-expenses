package com.lfmelo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lfmelo.entities.Address;

public interface ExpenseRepository extends JpaRepository<Address, Integer>{

}
