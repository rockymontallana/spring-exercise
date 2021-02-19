package com.spring.app.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.spring.app.service.ContactService;
import com.spring.app.model.Contact;
import com.spring.app.model.Person;

@RestController
@RequestMapping("/api/") 
public class ContactEndpoint {
    @Autowired
    private ContactService contactService;
    
    //create contact
    @PostMapping("person/{personId}/create-contact")
    public void createContact(@PathVariable("personId") Long personId, 
                              @RequestBody Contact contact) {
		contactService.createContact(personId, contact);
    }
    
    //update contact
    @PutMapping("person/{personId}/update-contact/{contactId}")
    public void updateContact(@PathVariable("personId") Long personId, 
                              @RequestBody Contact contact,
                              @PathVariable("contactId") Long contactId) {
        contactService.updateContact(personId, contact, contactId);
    }
    
    //delete contact
    @DeleteMapping("person/{personId}/delete-contact/{contactId}")
    public void deleteContact(@PathVariable("contactId") Long contactId) {
        contactService.deleteContact(contactId);
    }
}