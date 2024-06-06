package com.jlunic.jlunic_market.application.usecases.adminContent;

import com.jlunic.jlunic_market.domain.models.Product;
import com.jlunic.jlunic_market.domain.ports.input.adminContent.CreateProductUseCase;
import com.jlunic.jlunic_market.domain.ports.output.ProductRepositoryPort;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreateProductUseCaseImpl implements CreateProductUseCase
{
    private final ProductRepositoryPort productRepositoryPort;

    @Override
    public Product createProduct(Product product) { return productRepositoryPort.save(product); }
}
