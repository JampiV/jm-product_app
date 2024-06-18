package com.jlunic.jlunic_market.domain.ports.output;

import com.jlunic.jlunic_market.domain.models.Role;

import java.util.List;

public interface RoleRepositoryPort {

    Role save(Role role);
    List<Role> findAll();
    boolean deleteById(Long id);
}
