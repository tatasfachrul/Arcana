package com.greenbooks.contacts.helper;

import org.springframework.stereotype.Controller;

@Controller
public class ContactsHelper {
	
	public String convertNumber(Integer input) {
		return input.toString();
	}
	
	public  ResponseData resData(String data, Integer statusCode) {
		return null;		
	}

}
