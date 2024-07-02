package com.jlunic.jlunic_market.infraestructure.entities;

import com.jlunic.jlunic_market.domain.models.Role;
import com.jlunic.jlunic_market.domain.models.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class RoleEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    /*
    @OneToMany(mappedBy = "role")
    private List<User> users;*/

    public static RoleEntity fromDomainModel(Role role)
    {
        return new RoleEntity(role.getId(),role.getRoleName());
    }

    public Role toDomainModel() { return new Role(id, name);}
}
