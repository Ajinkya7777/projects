package com.phonebook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.phonebook.dto.Contact;
import com.phonebook.service.ContactService;

@Controller

public class ContactInfoController {

	@Autowired(required = true)
	private ContactService service;

	public Contact saveContact(Contact contact) {
		return null;
	}

	@GetMapping(value = { "/", "/addContact" })
	public String loadForm(Model model) {
		Contact c = new Contact();
		model.addAttribute("contact", c);
		return "contactInfo";
	}

	@PostMapping(value = { "/saveContact" })
	public String handleSubmitButton(@ModelAttribute("contact") Contact c, Model model) {

		boolean isSaved = service.saveContact(c);
		if (isSaved) {
			model.addAttribute("succMsg", "Contact Saved");
		} else {
			model.addAttribute("errMsg", "Failed to Save");
		}
		return "contactInfo";

	}

	public List<Contact> getAllContact() {
		return null;
	}

	public Contact updateContact(int contactId, Contact contact) {
		return null;
	}

	public int deleteContact(int contactId) {
		return 0;
	}
}
