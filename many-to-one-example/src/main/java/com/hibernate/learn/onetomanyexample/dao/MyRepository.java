package com.hibernate.learn.onetomanyexample.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibernate.learn.onetomanyexample.entities.LoanEntity;

public interface MyRepository extends JpaRepository<LoanEntity, Integer> {

}
