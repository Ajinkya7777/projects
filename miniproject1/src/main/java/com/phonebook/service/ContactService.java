package com.phonebook.service;

import java.util.List;

import com.phonebook.dto.Contact;
import com.phonebook.entity.ContactEntity;


public interface ContactService {

	boolean saveContact (Contact c);
	List<ContactEntity> getAllContacts();
	ContactEntity getContactById(Integer c);
	boolean deleteContact(Integer cId);
	
}
