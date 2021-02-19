package com.spring.app.service;

import java.util.List;

import com.spring.app.model.Contact;

public interface ContactService {
    void createContact(Long personId, Contact contact);
    void updateContact(Long personId, Contact contact, Long contactId);
    void deleteContact(Long contactId);
    
    
}