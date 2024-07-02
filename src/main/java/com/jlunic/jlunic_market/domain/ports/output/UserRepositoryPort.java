package com.jlunic.jlunic_market.domain.ports.output;

import com.jlunic.jlunic_market.domain.models.User;
import com.jlunic.jlunic_market.domain.models.UserCustomer;

public interface UserRepositoryPort {
    User save(User user);
    UserCustomer saveCustomer(UserCustomer customer);
}
