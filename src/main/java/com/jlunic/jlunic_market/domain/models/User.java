package com.jlunic.jlunic_market.domain.models;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
public class User
{

    private Long id;
    private String username;
    private String password;
    private Role role;

}
