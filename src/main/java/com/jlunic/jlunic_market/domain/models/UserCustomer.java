package com.jlunic.jlunic_market.domain.models;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
//Pending User SuperBuilder
@SuperBuilder
public class UserCustomer
        //extends User
{
    private String email;
}
