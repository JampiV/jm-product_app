package com.jlunic.jlunic_market.domain.models;

import lombok.*;

@Setter
@Getter
public abstract class User
{

    private String username;
    private String password;
    private String email;
    private String rol;

}
