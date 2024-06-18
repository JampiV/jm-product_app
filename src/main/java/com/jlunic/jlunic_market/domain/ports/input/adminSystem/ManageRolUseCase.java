package com.jlunic.jlunic_market.domain.ports.input.adminSystem;

import com.jlunic.jlunic_market.domain.models.Role;

import java.util.List;

public interface ManageRolUseCase {
    Role createRole(Role role);

    List<Role> getAllRoles();

    boolean deleteRole(Long roleId);
}
