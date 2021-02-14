package com.spring.service;

import java.util.List;

import com.spring.dao.*;
//import java.io.*;
//
//import java.util.List; 
//import java.util.Date; 
//import java.util.Iterator; 
//import org.hibernate.HibernateException; 
//import org.hibernate.Session; 
//import org.hibernate.Transaction; 
//import org.hibernate.SessionFactory; 
//import org.hibernate.cfg.Configuration;

public class PersonService {
    private static PersonDAO personDAO;
    
    @Autiwired
    public PersonService(PersonDAO, personDAO) {
        this.personDAO = personDAO;
    }
    
    public void createPerson(Person person) {
        personDAO.createPerson(person);
    }
    
    public Person findById(int personID) {
        Person person = personDAO.findById(personID);
        return person;
    }
    
    public void deletePerson(Integer personID) {
        Person person = personDAO.findById(personID);
        personDAO.deletePerson(person);
    }
    
    public void updatePerson(Person person) {
        personDAO.updatePerson(person);
    }
    
    public List<Person> findAll() {
        List<Person> persons = personDAO.findAll();
        return persons;
    }
    
//    public List<Person> findAllPersonByDateHired() {
//        personDAOImp.openCurrentSession();
//        List<Person> persons = personDAOImp.findAllPersonByDateHired();
//        personDAOImp.closeCurrentSession();
//        return persons;
//    }
//    
//    public List<Person> findAllPersonByLastName() {
//        personDAOImp.openCurrentSession();
//        List<Person> persons = personDAOImp.findAllPersonByLastName();
//        personDAOImp.closeCurrentSession();
//        return persons;
//    }
    
    public PersonDAO personDAO() {
        return personDAO;
    }
}