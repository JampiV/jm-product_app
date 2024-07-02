package com.jlunic.jlunic_market.application.services;

import com.jlunic.jlunic_market.domain.models.User;
import com.jlunic.jlunic_market.domain.models.UserCustomer;
import com.jlunic.jlunic_market.domain.ports.input.adminSystem.ManageContUsersUseCase;
import com.jlunic.jlunic_market.domain.ports.input.customer.SignUpUserUseCase;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;

@AllArgsConstructor
@RequiredArgsConstructor
public class UserService implements SignUpUserUseCase, ManageContUsersUseCase {
   private SignUpUserUseCase signUpUserUseCase;
   private final ManageContUsersUseCase manageContUsersUseCase;

    @Override
    public User save(User user) {
        return manageContUsersUseCase.save(user);
    }

    @Override
    public UserCustomer signUpUser(UserCustomer customer) {
        return signUpUserUseCase.signUpUser(customer);
    }
}
