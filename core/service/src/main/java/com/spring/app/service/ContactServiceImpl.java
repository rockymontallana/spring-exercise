package com.spring.app.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.app.model.Contact;
import com.spring.app.model.Person;
import com.spring.app.service.ContactService;
import com.spring.app.dao.ContactDAO;   
import com.spring.app.dao.PersonDAO;   

@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    ContactDAO contactDAO;
    
    @Autowired
    PersonDAO personDAO;
    
    @Override
    public void createContact(Long personId, Contact contact) {
        Person person = personDAO.findById(personId).get();
        List<Contact> contacts = person.getContacts();
        contacts.add(contact);
        personDAO.save(person);
    }
    
    @Override
    public void updateContact(Long personId, Contact contact, Long contactId) {
        Contact newContact = contactDAO.findById(contactId).get();
        
        newContact.setLandLine(contact.getLandLine());
        newContact.setMobileNumber(contact.getMobileNumber());
        newContact.setEmail(contact.getEmail());
        
        contactDAO.save(newContact);
    }
    
    @Override
    public void deleteContact(Long contactId) {
        contactDAO.deleteById(contactId);
    }
}
