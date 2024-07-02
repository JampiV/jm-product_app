package com.jlunic.jlunic_market.infraestructure.entities;

import com.jlunic.jlunic_market.domain.models.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.crypto.password.PasswordEncoder;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false, foreignKey = @ForeignKey(name="FK_role_user"))
    private RoleEntity role;


    public static UserEntity fromDomainModel(User user)
    {
        return new UserEntity(user.getId(), user.getUsername(), user.getPassword(), RoleEntity.fromDomainModel(user.getRole()));
    }

    public User toDomainModel() { return new User(id, username, password, role.toDomainModel()); }

}
