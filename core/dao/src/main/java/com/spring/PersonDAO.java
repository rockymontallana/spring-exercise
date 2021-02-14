package com.spring;

import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonDAO extends JpaRepository<Person, Integer> {
//    //Create or insert person
//    public void createPerson(T entity);
//    
//    //Find Person
//    public Person findById(Integer personID);
//    
//    //Delete person
//    public void deletePerson(T entity);
//    
//    //Update person
//    public void updatePerson(T entity);
//    
//    //List Person
//    public List<T> findAllPersonByGWA();
//    public List<T> findAllPersonByDateHired();
//    public List<T> findAllPersonByLastName();
}