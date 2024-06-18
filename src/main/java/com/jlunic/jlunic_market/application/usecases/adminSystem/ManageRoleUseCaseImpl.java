package com.jlunic.jlunic_market.application.usecases.adminSystem;

import com.jlunic.jlunic_market.domain.models.Role;
import com.jlunic.jlunic_market.domain.ports.input.adminSystem.ManageRolUseCase;
import com.jlunic.jlunic_market.domain.ports.output.RoleRepositoryPort;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class ManageRoleUseCaseImpl implements ManageRolUseCase {
    private final RoleRepositoryPort roleRepositoryPort;


    @Override
    public Role createRole(Role role) {
        return roleRepositoryPort.save(role);
    }

    @Override
    public List<Role> getAllRoles() {
        return roleRepositoryPort.findAll();
    }

    @Override
    public boolean deleteRole(Long roleId) {
        return roleRepositoryPort.deleteById(roleId);
    }
}
