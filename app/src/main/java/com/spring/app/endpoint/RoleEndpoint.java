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

import com.spring.app.service.RoleService;
import com.spring.app.model.Role;
import com.spring.app.model.Person;

@RestController
@RequestMapping("/api/") 
public class RoleEndpoint {
    @Autowired
    private RoleService roleService;
    
    //create person role
    @PostMapping("person/{personId}/create-person-role")
    public void createPersonRole(@PathVariable("personId") Long personId, @RequestBody Role role) {
		roleService.createPersonRole(personId, role);
    }
    
    //delete person role
    @DeleteMapping("person/delete-person-role/{roleId}")
    public void deletePersonRole(@PathVariable("roleId") Long roleId) {
        roleService.deletePersonRole(roleId);
    }
    
    //add role
    @PutMapping("person/{personId}/add-person-role/{roleId}")
    public void addRole(@PathVariable("personId") Long personId, 
                        @PathVariable("roleId") Long roleId, 
                        @RequestBody Role role) {
		roleService.addRole(personId, roleId, role);
    }
    
    //update role
    @PutMapping("person/{personId}/update-person-role/{roleId}")
    public void updateRole(@PathVariable("personId") Long personId, 
                           @PathVariable("roleId") Long roleId, 
                           @RequestBody Role role) {
		roleService.updateRole(personId, roleId, role);
    }
    
    //delete role
    @DeleteMapping("person/delete-role/{roleId}")
    public void deleteRole(@PathVariable("roleId") Long roleId) {
        roleService.deleteRole(roleId);
    }
    
    //list roles
    @GetMapping("person/list-of-roles")
    public List<Role> listRole() {
        return roleService.listRole();
    }
}