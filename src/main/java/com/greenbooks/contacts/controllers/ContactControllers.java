package com.greenbooks.contacts.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greenbooks.contacts.models.ContactModels;

@RestController
@RequestMapping("/contacts")
public class ContactControllers {
	
	@RequestMapping("/lists")
	public String list() {
		return "This is list";
	}
	
	@RequestMapping("/detail")
	public ContactModels detail() {
		ContactModels contact = new ContactModels();
		contact.setName("Tatas");
		return contact;
	}
	

}
