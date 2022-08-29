package com.zohocrm2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohocrm2.entities.Contact;
import com.zohocrm2.services.ContactService;

@Controller
public class ContactController {
	@Autowired
	private ContactService contactService;
	@RequestMapping("/listAllContacts")
	public String listAllContacts(ModelMap model) {
		List<Contact> contacts = contactService.listContacts();
		model.addAttribute("contacts",contacts);
		return "search_contact_result";
}
}