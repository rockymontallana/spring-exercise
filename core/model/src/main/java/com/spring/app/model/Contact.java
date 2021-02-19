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
@Table(name = "contact")
public class Contact implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long contactId;
    
    @Column(name = "land_line")
    private long landLine;
    
    @Column(name = "mobile_number")
    private long mobileNumber;
    
    @Column(name = "email")
    private String email;
    
//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "personId")
    @Transient
    private Person person;
    
    public Contact() {}
    
    public Contact(long landLine, long mobileNumber, String email) {
        this.landLine = landLine;
        this.mobileNumber = mobileNumber;
        this.email = email;
    }
    
     //Setters
    public void setContactId(int contactId) {
        this.contactId = contactId;
    }
    
    public void setLandLine(long landLine) {
        this.landLine = landLine;
    }
    
    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setPerson(Person person) {
        this.person = person;
    }
    
    //Getters
    public long getContactId() {
        return contactId;
    }
    public long getLandLine() {
        return landLine;
    }
    
    public long getMobileNumber() {
        return mobileNumber;
    }
    
    public String getEmail() {
        return email;
    }
    
    public Person getPerson() {
        return person;
    }
}