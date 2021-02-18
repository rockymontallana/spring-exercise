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

import com.spring.app.service.PersonService;
import com.spring.app.model.Person;

@RestController
@RequestMapping("/api/") 
public class PersonEndpoint {
    @Autowired
    private PersonService personService;
    
    //create person
    @PostMapping("create-person")
    public void createPerson(@RequestBody Person person) {
		personService.createPerson(person);
    }
    
    //delete person
    @DeleteMapping("delete-person/{personId}")
    public void deletePerson(@PathVariable("personId") Long personId) {
        personService.deletePerson(personId);
    }
    
    //update person
    @PutMapping("update-person/{personId}")
    public void updatePerson(@RequestBody Person person, @PathVariable("personId") Long personId) {
        personService.updatePerson(person, personId);
    }
    
    
    //display List of persons by GWA
    @GetMapping("list-by-GWA")
    public List<Person> listPersonsByGWA() {
        return personService.listPersonsByGWA();
    }
    
    //display List of persons by date hired
    @GetMapping("list-by-date-hired")
    public List<Person> listPersonsByDateHired() {
        return personService.listPersonsByDateHired();
    }
    
    //display List of persons by date hired
    @GetMapping("list-by-last-name")
    public List<Person> listPersonsByLastName() {
        return personService.listPersonsByLastName();
    }
}