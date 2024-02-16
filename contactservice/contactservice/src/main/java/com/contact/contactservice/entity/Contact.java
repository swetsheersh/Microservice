package com.contact.contactservice.entity;

public class Contact {
	private int contactId;
	private String name;
	private String email;
	
	private int userId;

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Contact(int contactId, String name, String email, int userId) {
		super();
		this.contactId = contactId;
		this.name = name;
		this.email = email;
		this.userId = userId;
	}

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", name=" + name + ", email=" + email + ", userId=" + userId + "]";
	}
	
	
}
