package com.spring.app.dao;

//import java.util.List;
//import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.data.jpa.repository.Query;

import com.spring.app.model.Person;

@Repository
public interface PersonDAO extends JpaRepository<Person, Long> {

//    @Query(value = "SELECT p FROM Person p")
//    List<Person> listPersonsByDateHired(Sort sort);
//    
//    @Query(value = "SELECT p FROM Person p")
//    List<Person> listPersonsByDateHired(Sort sort);
}