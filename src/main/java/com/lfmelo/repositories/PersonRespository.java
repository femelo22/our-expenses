package com.lfmelo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lfmelo.entities.Person;

public interface PersonRespository extends JpaRepository<Person, Integer>{

}
