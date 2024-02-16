package com.user.userservice.entity;

import java.util.List;

public class User {
	
	private int userId;
	private String userName;
	private String email;
	
	private List<Contact>contacts;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

	public User(int userId, String userName, String email) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
	}

	public User(int userId, String userName, String email, List<Contact> contacts) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.contacts = contacts;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", email=" + email + "]";
	}
	
	
}
