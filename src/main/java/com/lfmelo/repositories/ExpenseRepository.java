package com.lfmelo.repositories;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lfmelo.entities.Expense;
import com.lfmelo.entities.Person;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Integer> {

	List<Expense> findByReleaseDateBetweenAndPerson(LocalDateTime startDate, LocalDateTime endDate, Person person);
}
