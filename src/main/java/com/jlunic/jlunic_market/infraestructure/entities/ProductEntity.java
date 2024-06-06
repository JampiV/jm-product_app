package com.jlunic.jlunic_market.infraestructure.entities;

import com.jlunic.jlunic_market.domain.models.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
//@Table(name = "product")
public class ProductEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private int code;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private String category;

    @Column
    private String specification;

    @Column
    private String image;

    @Column
    private double price;

    public static ProductEntity fromDomainModel(Product product)
    {
        return new ProductEntity(product.getId(), product.getCode(), product.getName(), product.getDescription(), product.getCategory(), product.getSpecification(), product.getImage(), product.getPrice());
    }

    public Product toDomainModel() { return new Product(id, code, name, description, category, specification, image, price); }
}
