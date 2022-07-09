package com.lfmelo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lfmelo.entities.Person;

@Repository
public interface PersonRespository extends JpaRepository<Person, Integer>{

}
