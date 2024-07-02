package com.jlunic.jlunic_market.infraestructure.repositories;

import com.jlunic.jlunic_market.domain.models.User;
import com.jlunic.jlunic_market.domain.models.UserCustomer;
import com.jlunic.jlunic_market.domain.ports.output.UserRepositoryPort;
import com.jlunic.jlunic_market.infraestructure.entities.UserCustomerEntity;
import com.jlunic.jlunic_market.infraestructure.entities.UserEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class JpaUserRepositoryAdapter implements UserRepositoryPort
{
    private final JpaUserRepository jpaUserRepository;

    @Override
    public User save(User user) {
        UserEntity userEntity = UserEntity.fromDomainModel(user);
        UserEntity savedUserEntity = jpaUserRepository.save(userEntity);
        return savedUserEntity.toDomainModel();
    }

    @Override
    public UserCustomer saveCustomer(UserCustomer customer) {
        UserCustomerEntity userCustomerEntity = UserCustomerEntity.fromDomainModel(customer);
        UserCustomerEntity savedUserCustomerEntity = jpaUserRepository.save(userCustomerEntity);
        return savedUserCustomerEntity.toDomainModel();
    }

}
