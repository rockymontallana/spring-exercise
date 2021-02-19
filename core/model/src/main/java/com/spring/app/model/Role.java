package com.spring.app.model;

import java.util.*;
import java.text.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity; 
import javax.persistence.FetchType;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

@Entity
@Table(name = "role")
public class Role implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long roleId;
    
    @Column(name = "role")
    private String role;
    
    @ManyToMany(mappedBy="roles", cascade=CascadeType.ALL)
    private List<Person> persons = new ArrayList<>();
    
    public Role() {}
    
    public Role(String role) {
        this.role = role;
    }
    
    //Setters
    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }
    
    public void setRole(String role) {
        this.role = role;
    }
    
    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
    
    
    //Getters
    public long getRoleId() {
        return roleId;
    }
    
    public String getRole() {
        return role;
    }
    
    public List<Person> getPersons() {
        return persons;
    }
}