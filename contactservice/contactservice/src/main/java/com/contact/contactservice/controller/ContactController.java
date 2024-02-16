package com.contact.contactservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.contactservice.entity.Contact;
import com.contact.contactservice.service.ContactServiceImpl;

@RestController
@RequestMapping(path = "contact")
public class ContactController {
	@Autowired
	private ContactServiceImpl impl;
	@GetMapping("getusercontact/{id}")
	public ResponseEntity<?> getContacts(@PathVariable("id") int id){
		List<Contact>list=this.impl.getAllContactsByUserId(id);
		if(!list.isEmpty()) {
			return new ResponseEntity<List<Contact>>(list,HttpStatus.OK);
		}
		return new ResponseEntity<List<Contact>>(list,HttpStatus.OK);
	}
}
