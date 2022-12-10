package com.phbookapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.phbookapp.domain.Contact;
import com.phbookapp.service.ContactService;

@RestController
@RequestMapping("/contacts")
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	@PostMapping
	@ResponseStatus(code=HttpStatus.CREATED)
    public String saveContact(Contact contact) {
    	
         return contactService.saveContact(contact);
    	
    	
    }
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Contact> getAllContacts(){
		
		return contactService.getAllContacts();
	}
	
	
	@GetMapping("/{id}")
	public Contact getContactById(@PathVariable("id")Integer contactId) {
		
		return contactService.getContactById(contactId);
		
	}
	
	@PutMapping
	@ResponseStatus(code=HttpStatus.OK)
	public String updateContact(@RequestBody Contact contact) {
		
		return contactService.updateContact(contact);
		
	}
	
	public String deleteContactById(Integer contactId) {
		
		return contactService.deleteContactById(contactId);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
