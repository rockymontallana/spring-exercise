package com.spring.app.dao;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.app.model.Contact;

@Repository
public interface ContactDAO extends JpaRepository<Contact, Long> {

}