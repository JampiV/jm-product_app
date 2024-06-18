package com.jlunic.jlunic_market.application.services;

import com.jlunic.jlunic_market.domain.models.Role;
import com.jlunic.jlunic_market.domain.ports.input.adminSystem.ManageRolUseCase;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class RoleService implements ManageRolUseCase {

    private final ManageRolUseCase manageRolUseCase;

    @Override
    public Role createRole(Role role) {
        return manageRolUseCase.createRole(role);
    }

    @Override
    public List<Role> getAllRoles() {
        return manageRolUseCase.getAllRoles();
    }

    @Override
    public boolean deleteRole(Long roleId) {
        return manageRolUseCase.deleteRole(roleId);
    }
}
