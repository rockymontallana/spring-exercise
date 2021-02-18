package com.spring.app.service;

import java.util.List;

import com.spring.app.model.Person;

public interface PersonService {
    void createPerson(Person person);
    void deletePerson(Long personId);
    void updatePerson(Person person, Long personId);
    List<Person> listPersonsByGWA();
    List<Person> listPersonsByDateHired();
    List<Person> listPersonsByLastName();
    
}