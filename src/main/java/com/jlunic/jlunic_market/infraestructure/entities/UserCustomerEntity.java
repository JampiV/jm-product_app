package com.jlunic.jlunic_market.infraestructure.entities;

import com.jlunic.jlunic_market.domain.models.UserCustomer;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
//@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserCustomerEntity extends UserEntity
{
    @Column(nullable = true)
    private String email;

    public UserCustomerEntity(Long id, String username, String password, RoleEntity role, String email) {
        super(id, username, password, role);
        this.email = email;
    }

    public static UserCustomerEntity fromDomainModel(UserCustomer userCustomer)
    {
        return new UserCustomerEntity(userCustomer.getId(), userCustomer.getUsername(), userCustomer.getPassword(),
                RoleEntity.fromDomainModel(userCustomer.getRole()), userCustomer.getEmail()
        );
    }

    public UserCustomer toDomainModel() { return new UserCustomer(getId(), getUsername(), getPassword(), getRole().toDomainModel(), email); }
}
