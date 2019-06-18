package com.greenbooks.contacts.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contacts")
public class ContactControllers {
	
	@RequestMapping("/lists")
	public String list() {
		return "This is list";
	}

}
