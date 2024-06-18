package com.jlunic.jlunic_market.infraestructure.repositories;

import com.jlunic.jlunic_market.infraestructure.entities.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaRoleRepository extends JpaRepository<RoleEntity, Long> {

}
