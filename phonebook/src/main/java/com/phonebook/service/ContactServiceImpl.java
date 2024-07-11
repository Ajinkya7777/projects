package com.phonebook.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phonebook.dto.Contact;
import com.phonebook.entity.ContactEntity;
import com.phonebook.repository.ContactRepo;

@Service
public class ContactServiceImpl implements ContactService {
	@Autowired
	private ContactRepo repo;

	@Override
	public boolean saveContact(Contact c) {
		ContactEntity entity = new ContactEntity();
		BeanUtils.copyProperties(c, entity);
		ContactEntity savedEntity = repo.save(entity);
		int id = savedEntity.getContactId();

		return savedEntity.getContactId() != null;
	}

	@Override
	public List<ContactEntity> getAllContacts() {

		return null;
	}

	@Override
	public ContactEntity getContactById(Integer c) {

		return null;
	}

	@Override
	public boolean deleteContact(Integer cId) {

		return false;
	}

}
