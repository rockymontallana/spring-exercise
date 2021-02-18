package com.spring.app.service;

//import java.util.List;
//import java.util.Optional;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Sort;

import com.spring.app.model.Person;
import com.spring.app.service.PersonService;
import com.spring.app.dao.PersonDAO;

@Service
public class PersonServiceImpl implements PersonService{
    @Autowired
    private PersonDAO personDAO;
    
    @Override 
    public void createPerson(Person person) {
        personDAO.save(person);
    }
    
    @Override
    public void deletePerson(Long personId) {
        personDAO.deleteById(personId);
    }
    
    @Override
    public void updatePerson(Person person, Long personId) {
        Person newPerson = personDAO.findById(personId).get();
        
        newPerson.setLastName(person.getLastName());
        newPerson.setFirstName(person.getFirstName());
        newPerson.setMiddleName(person.getMiddleName());
        newPerson.setSuffix(person.getSuffix());
        newPerson.setTitle(person.getTitle());
        newPerson.setTitle(person.getTitle());
        newPerson.setStreetNo(person.getStreetNo());
        newPerson.setBarangay(person.getBarangay());
        newPerson.setCityOrMunicipality(person.getCityOrMunicipality());
        newPerson.setZipcode(person.getZipcode());
        newPerson.setBirthday(person.getBirthday());
        newPerson.setGradeWeightedAverage(person.getGradeWeightedAverage());
        newPerson.setDateHired(person.getDateHired());
        newPerson.setIsCurrentlyEmployed(person.getIsCurrentlyEmployed());
        
        personDAO.save(newPerson);
    }
    
    @Override
    public List<Person> listPersonsByGWA() {
        List<Person> persons = personDAO.findAll();
        
        Collections.sort(persons, new Comparator<Person>() {
                    @Override
                    public int compare(Person person1, Person person2) {
                        return Double.compare(person1.getGradeWeightedAverage(), person2.getGradeWeightedAverage());
                    }
                });
        
        return persons;
    }
    
    @Override
    public List<Person> listPersonsByDateHired() {
        return personDAO.findAll(Sort.by(Sort.Direction.ASC, "dateHired"));
    }
    
    @Override
    public List<Person> listPersonsByLastName() {
        return personDAO.findAll(Sort.by(Sort.Direction.ASC, "lastName"));
    }
    
    
}