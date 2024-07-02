package com.jlunic.jlunic_market.domain.ports.input.adminSystem;

import com.jlunic.jlunic_market.domain.models.User;

public interface ManageContUsersUseCase {
    User save(User user);
}
