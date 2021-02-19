package com.spring.app.service;

import java.util.List;

import com.spring.app.model.Role;

public interface RoleService {
    void createPersonRole(Long personId, Role role);
    void deletePersonRole(Long roleId);
    void addRole(Long personId, Long roleId, Role role);
    void updateRole(Long personId, Long roleId, Role role);
    void deleteRole(Long roleId);
    List<Role> listRole();
    
    
}