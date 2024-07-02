package com.jlunic.jlunic_market.application.usecases.customer;

import com.jlunic.jlunic_market.domain.models.UserCustomer;
import com.jlunic.jlunic_market.domain.ports.input.customer.SignUpUserUseCase;
import com.jlunic.jlunic_market.domain.ports.output.UserRepositoryPort;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;

@AllArgsConstructor
public class SignUpUserUseCaseImpl implements SignUpUserUseCase
{
    private final UserRepositoryPort userRepositoryPort;
    private PasswordEncoder passwordEncoder;

    @Override
    public UserCustomer signUpUser(UserCustomer customer) {
        customer.setPassword(passwordEncoder.encode(customer.getPassword()));
        return userRepositoryPort.saveCustomer(customer);
    }

}
