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
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "person")
public class Person implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long personId;
    
    @Column(name = "last_name")
    private String lastName;
    
    @Column(name = "first_name")
    private String firstName;
    
    @Column(name = "middle_name")
    private String middleName;
    
    @Column(name = "suffix")
    private String suffix;
    
    @Column(name = "title")
    private String title;
    
    @Column(name = "street_no")
    private String streetNo;
    
    @Column(name = "barangay")
	private String barangay;
    
    @Column(name = "city_or_municipality")
	private String cityOrMunicipality;
    
    @Column(name = "zipcode")
	private int zipcode;
    
    @Column(name = "birthday")
    private Date birthday;
    
    @Column(name = "grade_weighted_average")
    private double gradeWeightedAverage; //eto 
    
    @Column(name = "date_hired")
    private Date dateHired;
    
    @Column(name = "is_currently_employed")
    private boolean isCurrentlyEmployed;
    
//    private List<Contact> contacts = new ArrayList<>();
//    private List<Role> roles = new ArrayList<>();
    
    public Person() {}
    
    public Person(String lastName, String firstName, String middleName, String suffix, String title, 
                  String streetNo, String barangay, String cityOrMunicipality, int zipcode, 
                  Date birthday, double gradeWeightedAverage, Date dateHired, boolean isCurrentlyEmployed) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.suffix = suffix;
        this.title = title;
        
        this.streetNo = streetNo;
        this.barangay = barangay;
        this.cityOrMunicipality = cityOrMunicipality;
        this.zipcode = zipcode;
        
        this.birthday = birthday;
        this.gradeWeightedAverage = gradeWeightedAverage;
        this.dateHired = dateHired;
        this.isCurrentlyEmployed = isCurrentlyEmployed;
    }
    
    //Setters
    public void setPersonID(long personId) {
        this.personId = personId;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }
    
    public void setBarangay(String barangay){
        this.barangay = barangay;
    }
    
    public void setCityOrMunicipality(String cityOrMunicipality){
        this.cityOrMunicipality = cityOrMunicipality;
    }
    
    public void setZipcode(int zipcode){
        this.zipcode = zipcode;
    }
    
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    
    public void setGradeWeightedAverage(double gradeWeightedAverage) {
        this.gradeWeightedAverage = gradeWeightedAverage;
    }
    
    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }
    
    public void setIsCurrentlyEmployed(boolean isCurrentlyEmployed) {
        this.isCurrentlyEmployed = isCurrentlyEmployed;
    }
    
//    public void setContacts(List<Contact> contacts) {
//        this.contacts = contacts;
//    }
//    
//    public void setRoles(List<Role> roles) {
//        this.roles = roles;
//    }
    
    //Getters
    public long getPersonID() {
        return personId;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getMiddleName() {
        return middleName;
    }
    
    public String getSuffix() {
        return suffix;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getStreetNo() {
        return streetNo;
    }
    
    public String getBarangay() {
        return barangay;
    }
    
    public String getCityOrMunicipality() {
        return cityOrMunicipality;
    }
    
    public int getZipcode() {
        return zipcode;
    }
    
    public Date getBirthday() {
        return birthday;
    }
    
    public double getGradeWeightedAverage() {
        return gradeWeightedAverage;
    }
    
    public Date getDateHired() {
        return dateHired;
    }
    
    public boolean getIsCurrentlyEmployed() {
        return isCurrentlyEmployed;
    }
    
//    public List<Contact> getContacts() {
//        return contacts;
//    }
//    
//    public List<Role> getRoles() {
//        return roles;
//    }
    
    
}