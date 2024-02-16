package com.contact.contactservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.contact.contactservice.entity.Contact;
@Service
public class ContactServiceImpl implements ContactService{

	List<Contact> list=List.of(
			new Contact(1,"Ram","ram@gmail.com",1211),
			new Contact(2,"Shyam","shyam@gmail.com",1211),
			new Contact(3,"Geeta","geeta@gmail.com",1212),
			new Contact(4,"Sita","sita@gmail.com",1212),
			new Contact(5,"Ravi","ravi@gmail.com",1213),
			new Contact(6,"Sagar","sagar@gmail.com",1213)
			);
	@Override
	public List<Contact> getAllContactsByUserId(int id) {
		// TODO Auto-generated method stub
		return list.stream().filter(contact->contact.getUserId()==id).toList();
	}

}
