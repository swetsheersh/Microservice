package com.user.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.userservice.entity.Contact;
import com.user.userservice.entity.User;
import com.user.userservice.service.UserServiceImpl;

@RestController
@RequestMapping(path = "user")
public class UserController {
	
	@Autowired
	private UserServiceImpl impl;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/userget/{id}")
	public ResponseEntity<?> getUser(@PathVariable("id") Integer id){
		User user=impl.getUserDetails(id);
		if(user!=null) {
			List<Contact>list=this.restTemplate.getForObject("http://CONTACT-SERVICE/contact/getusercontact/"+id, List.class);
			user.setContacts(list);
			return new ResponseEntity<User>(user,HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("User Not Found",HttpStatus.NOT_FOUND);
		}
	}
}
