package com.greenbooks.contacts.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greenbooks.contacts.helper.ContactsHelper;
import com.greenbooks.contacts.models.ContactModels;

@RestController
@RequestMapping("/contacts")
public class ContactControllers {
	
	@Autowired
	ContactsHelper contactHelper;
	
	@RequestMapping("/")
	public ContactModels list() {
		ContactModels contact = new ContactModels();
		return contact;
	}
	
	@RequestMapping("/detail")
	public ContactModels detail() {
		ContactModels contact = new ContactModels();
		contact.setName("Tatas");
		contact.setLocation("Depok");
		contact.setNumber("081295886532");
		return contact;
	}
	
	@PostMapping(path = "/", consumes = "application/json", produces = "application/json")
	public ContactModels addContacts(@RequestBody ContactModels contactInfo) {
		ContactModels contact = new ContactModels();
		contact.setName(contactInfo.getName());
		contact.setLocation(contactInfo.getLocation());
		contact.setNumber(contactInfo.getNumber());
		return contact;
	}
	

}
