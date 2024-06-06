package com.jlunic.jlunic_market.application.usecases.adminContent;

import com.jlunic.jlunic_market.domain.models.Product;
import com.jlunic.jlunic_market.domain.ports.input.adminContent.UpdateProductUseCase;
import com.jlunic.jlunic_market.domain.ports.output.ProductRepositoryPort;
import lombok.AllArgsConstructor;

import java.util.Optional;

@AllArgsConstructor
public class UpdateProductUseCaseImpl implements UpdateProductUseCase
{
    private final ProductRepositoryPort productRepositoryPort;

    @Override
    public Optional<Product> updateProduct(Long productId, Product product) { return productRepositoryPort.update(product); }
}
