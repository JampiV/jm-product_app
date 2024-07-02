package com.jlunic.jlunic_market.domain.ports.input.customer;

import com.jlunic.jlunic_market.domain.models.UserCustomer;

public interface SignUpUserUseCase {
    UserCustomer signUpUser(UserCustomer customer); //throws Exception
}
