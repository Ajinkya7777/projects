package com.phonebook.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phonebook.entity.ContactEntity;

public interface ContactRepo extends JpaRepository<ContactEntity, Serializable> {

}
