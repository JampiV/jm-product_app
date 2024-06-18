package com.jlunic.jlunic_market.domain.models;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@AllArgsConstructor
//Pending User SuperBuilder
//@SuperBuilder
public class User
{

    private final String username;
    private final String password;
    private final Role rol;

}
