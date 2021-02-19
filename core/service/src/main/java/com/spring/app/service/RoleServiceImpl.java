package com.spring.app.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.app.model.Role;
import com.spring.app.model.Person;
import com.spring.app.service.RoleService;
import com.spring.app.dao.RoleDAO;   
import com.spring.app.dao.PersonDAO;   

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleDAO roleDAO;
    
    @Autowired
    PersonDAO personDAO;
    
    @Override
    public void createPersonRole(Long personId, Role role) {
        Person person = personDAO.findById(personId).get();
        roleDAO.save(role);
        List<Role> roles = person.getRoles();
        roles.add(role);
        personDAO.save(person);
    }
    
    @Override
    public void deletePersonRole(Long roleId) {
        roleDAO.deleteById(roleId);
    }
    
    @Override
    public void addRole(Long personId, Long roleId, Role role) {
        Person person = personDAO.findById(personId).get();
        List<Role> roles = person.getRoles();
        for(Role newRole : roles) {
            if(newRole.getRoleId() == roleId) {
                newRole.setRole(newRole.getRole() + "," + role.getRole());
            }
        }
        
        person.setRoles(roles);
        personDAO.save(person);

    }
    
    @Override
    public void updateRole(Long personId, Long roleId, Role role) {
        Role newRole = roleDAO.findById(roleId).get();
        newRole.setRole(role.getRole());
        roleDAO.save(newRole);
    }
    
    @Override
    public void deleteRole(Long roleId) {
        roleDAO.deleteById(roleId);
    }
    
    @Override
    public List<Role> listRole() {
        List<Role> roles = roleDAO.findAll();
        return roles;
    }
}