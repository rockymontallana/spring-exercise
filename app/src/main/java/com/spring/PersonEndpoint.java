package com.spring;

import java.util.*;

import com.spring.service.*;
import com.exist.model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/person")
public class PersonEndpoint {
    @Autowired
    PersonService personService;
    
    @PostMapping("/create-person")
    public void createPerson(@RequestBody Person person) {
        personService.save(person);
    }
    
    @GetMapping("/get-person/{id}")
	public Person findById(@PathVariable(value = "id") Integer personId) {
		Person person = personService.findById(personId).get();
		return person;	
	}
    
    @DeleteMapping("/delete-person/{id}")
    public void deletePerson(@PathVariable(value = "id") Integer personId) {
        Person person = personService.findById(personId).get();
        personService.delete(person);
    }
    
    @PutMapping("/update-person/{id}")
    public void updatePerson(@RequestBody Person person) {
        personService.save(person);
    }
    
    @GetMapping("/get-all-persons")
	public List<Person> getAll() {
		List<Person> persons = personService.findAll();
		return persons;
		
	}
}