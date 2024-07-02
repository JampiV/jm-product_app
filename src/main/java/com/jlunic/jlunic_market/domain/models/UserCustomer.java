package com.jlunic.jlunic_market.domain.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCustomer extends User
{
    private final String email;

    public UserCustomer(Long id, String username, String password, Role role, String email)
    {   super(id, username, password, role);
        this.email = email;    }
}
