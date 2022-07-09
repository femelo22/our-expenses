package com.lfmelo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lfmelo.entities.Address;

@Repository
public interface ExpenseRepository extends JpaRepository<Address, Integer>{

}
