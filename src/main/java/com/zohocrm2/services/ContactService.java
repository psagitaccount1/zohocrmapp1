package com.zohocrm2.services;

import java.util.List;

import com.zohocrm2.entities.Contact;

public interface ContactService {
	public void saveContact(Contact contact);

	public List<Contact> listContacts();
}
