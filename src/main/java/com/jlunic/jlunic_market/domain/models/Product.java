package com.jlunic.jlunic_market.domain.models;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
public class Product
{

    private Long id;
    private int code;
    private String name;
    private String description;
    private String category;
    private String specification;
    private String image;
    private double price;

}
