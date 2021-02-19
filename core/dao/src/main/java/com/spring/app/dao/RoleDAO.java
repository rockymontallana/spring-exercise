package com.spring.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.app.model.Role;

@Repository
public interface RoleDAO extends JpaRepository<Role, Long> {

}