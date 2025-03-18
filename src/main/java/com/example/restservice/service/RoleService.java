package com.example.restservice.service;

import com.example.restservice.model.Role;
import com.example.restservice.model.RoleType;
import com.example.restservice.repository.RoleRepository;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Optional<Role> findRoleByName(RoleType roleType) {
        return roleRepository.findByName(roleType);
    }

    public Role createRole(Role role) {
        return roleRepository.save(role);
    }
}

