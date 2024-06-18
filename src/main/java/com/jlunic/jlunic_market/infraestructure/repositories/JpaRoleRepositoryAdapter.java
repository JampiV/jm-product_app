package com.jlunic.jlunic_market.infraestructure.repositories;

import com.jlunic.jlunic_market.domain.models.Role;
import com.jlunic.jlunic_market.domain.ports.output.RoleRepositoryPort;
import com.jlunic.jlunic_market.infraestructure.entities.RoleEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Component
public class JpaRoleRepositoryAdapter implements RoleRepositoryPort
{
    private final JpaRoleRepository jpaRoleRepository;

    @Override
    public Role save(Role role) {
        RoleEntity roleEntity = RoleEntity.fromDomainModel(role);
        RoleEntity savedRoleEntity = jpaRoleRepository.save(roleEntity);
        return savedRoleEntity.toDomainModel();
    }

    @Override
    public List<Role> findAll() {
        return jpaRoleRepository.findAll().stream()
                .map(RoleEntity::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public boolean deleteById(Long id) {
        if (jpaRoleRepository.existsById(id))
        {
            jpaRoleRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
