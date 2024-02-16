package com.contact.contactservice.service;

import java.util.List;

import com.contact.contactservice.entity.Contact;

public interface ContactService {
	public List<Contact> getAllContactsByUserId(int id);
}
