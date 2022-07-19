package com.lfmelo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lfmelo.entities.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Integer>{

}
