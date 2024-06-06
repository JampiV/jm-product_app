package com.jlunic.jlunic_market.domain.ports.input.adminContent;

import com.jlunic.jlunic_market.domain.models.Product;

public interface CreateProductUseCase
{
    Product createProduct(Product product);
}
